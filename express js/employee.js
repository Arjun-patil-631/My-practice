const express = require("express");
const { default: mongoose } = require("mongoose");

const app = express();

let employee = [];

// Middleware to read form data
app.use(express.urlencoded({ extended: true }));

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

// Register New Employee
app.post("/register", (req, res) => {
    const newEmployee = {
        id: employee.length + 1,
        name: req.body.name,
        employeeNumber: Number(req.body.employeeNumber),
        department: req.body.department
    };

    employee.push(newEmployee);

    res.redirect("/employees");
});

// Middleware for /employees
app.use("/employees", (req, res, next) => {
    console.log("Employee list accessed");
    next();
});


app.get("/employees", (req, res) => {
    res.json(employee);
});

app.get("/employees/:id", (req, res) => {
    const id = Number(req.params.id);

    const emp = employee.find((e) => e.id === id);

    if (!emp) {
        return res.send("Employee not found");
    }

    res.send(`
        <h1>Employee Details</h1>
        <p>Employee ID: ${emp.id}</p>
        <p>Name: ${emp.name}</p>
        <p>Employee Number: ${emp.employeeNumber}</p>
        <p>Department: ${emp.department}</p>

        <a href="/employees">Back to Employees</a>
    `);
});

app.listen(3000, () => {
    console.log("Employee Registration System running on http://localhost:3000");
});