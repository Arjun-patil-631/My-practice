const express = require("express");
const mongoose = require("mongoose");
const student = express();
const port = 6000;
student.use(express.urlencoded({ extended: true })); 

mongoose
  .connect("mongodb://127.0.0.1:27017/schoolDB")
  .then(() => console.log("Connected to MongoDB successfully!"))
  .catch((err) => console.error("Database connection error:", err));

  // Schema & Model Definition
const studentSchema = new mongoose.Schema({
    name: {
      type: String,
      required: true,
    },
    rollnumber: {
      type: Number,
      required: true,
      unique: true,
    },
  });
  
  const Student = mongoose.model("Student", studentSchema);
  
  // Home page with registration form
  student.get("/", (req, res) => {
    res.send(`
      <h2>School of Computing</h2>
      <p>List of CSE Students:</p>
      <ul>
        <li><a href="/students">/students</a> - View all students</li>
      </ul>
  
      <h3>Register New Student</h3>
      <form action="/register" method="POST">
        <input type="text" name="name" placeholder="Name" required />
        <input type="number" name="rollnumber" placeholder="Roll Number" required />
        <button type="submit">Add Student</button>
      </form>
    `);
  });
  
  // Fetch all students from the database
  student.get("/students", async (req, res) => {
    try {
      const students = await Student.find();
  
      const sdata = students
  .map((s, index) => `<p>${index + 1}. <b>Name:</b> ${s.name} | 
  <b>Roll No:</b> ${s.rollnumber}</p>`)
  .join("");
  
      res.send(`
        <!DOCTYPE HTML>
        <html>
          <body>
            <h2>Registered Students</h2>
            ${sdata || "<p>No students found.</p>"}
            <br/>
            <a href="/">Back to Home</a>
          </body>
        </html>
      `);
    } catch (error) {
      res.status(500).send("Error fetching students: " + error.message);
    }
  });
  
  // Insert new student into the database
  student.post("/register", async (req, res) => {
    try {
      const { name, rollnumber } = req.body;
          
      // Save student document to MongoDB
      const newStudent = await Student.create({
        name,
        rollnumber: Number(rollnumber),
      });
      return res.redirect("/students");
        
    } catch (error) {
      // Catch duplicate roll number or validation errors
      res.status(400).json({ error: error.message });
    }
  });
  student.listen(port, () => {
    console.log(`Server started and running successfully on http://localhost:${port}/`);
  });