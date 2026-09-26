const express = require("express");
const mongoose = require("mongoose");
const app = express();
const port = 5000;

app.use(express.urlencoded({ extended: true }));

// Connect to MongoDB
mongoose
  .connect("mongodb://127.0.0.1:27017/employeeDB")
  .then(() => console.log("Connected to MongoDB successfully!"))
  .catch((err) => console.error("Database connection error", err));

// Schema & Model Definition
const employeeSchema = new mongoose.Schema({
    name: {
        type: String,
        required: true,
    },
    employeeNumber: {
        type: Number,
        required: true,
        unique: true,
    },
    department: {
        type: String,
        required: true,
    }
});

const Employee = mongoose.model("Employee", employeeSchema);

// Home Page
app.get("/", (req, res) => {
    res.send(`
        <h1>Company Employee Management System</h1>
        <p>Register and manage company employees.</p>

        <a href="/employees">View All Employees</a>

        <h2>Register New Employee</h2>

        <form action="/register" method="POST">
            <label>Employee Name:</label>
            <input type="text" name="name" required><br><br>

            <label>Employee ID / Employee Number:</label>
            <input type="number" name="employeeNumber" required><br><br>

            <label>Department:</label>
            <input type="text" name="department" required><br><br>

            <button type="submit">Register Employee</button>
        </form>
    `);
});

// Middleware for /employees
app.use("/employees", (req, res, next) => {
    console.log("Employee list accessed");
    next();
});

// Fetch all employees from the database
app.get("/employees", async (req, res) => {
    try {
        const employees = await Employee.find();
        const employeeList = employees.length
            ? employees
                .map(
                    (e, index) =>
                        `<p>${index + 1}. <b>Name:</b> ${e.name} | <b>Employee Number:</b> ${e.employeeNumber} | <b>Department:</b> ${e.department}</p>`
                )
                .join("")
            : "<p>No employees found.</p>";

        res.send(`
            <!DOCTYPE html>
            <html>
              <body>
                <h2>Registered Employees</h2>
                ${employeeList}
                <br/>
                <a href="/">Back to home</a>
              </body>
            </html>
        `);
    } catch (error) {
        console.error("Error fetching employees:", error);
        res.status(500).send("Error fetching employees");
    }
});

// Register New Employee
app.post("/register", async (req, res) => {
    try {
        const newEmployee = new Employee({
            name: req.body.name,
            employeeNumber: Number(req.body.employeeNumber),
            department: req.body.department
        });

        await newEmployee.save();
        res.redirect("/employees");
    } catch (error) {
        console.error("Error registering employee:", error);
        res.status(500).send("Error registering employee");
    }
});

// Get employee by ID
app.get("/employees/:id", async (req, res) => {
    try {
        const emp = await Employee.findById(req.params.id);
        if (!emp) {
            return res.status(404).send("Employee not found");
        }

        res.send(`
            <h1>Employee Details</h1>
            <p>Employee ID: ${emp.id}</p>
            <p>Name: ${emp.name}</p>
            <p>Employee Number: ${emp.employeeNumber}</p>
            <p>Department: ${emp.department}</p>

            <a href="/employees">Back to Employees</a>
        `);
    } catch (error) {
        console.error("Error fetching employee:", error);
        res.status(500).send("Error fetching employee");
    }
});

app.listen(port, () => {
    console.log(`Employee Registration System running on http://localhost:${port}`);
});