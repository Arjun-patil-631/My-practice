const express = require("express");
const app = express();

const port = 6000;

let student = [
    { id: 1, name: "Ramu", rollnumber: 601 },
    { id: 2, name: "Ravi", rollnumber: 602 },
    { id: 3, name: "Raju", rollnumber: 603 }
];


app.use((req, res, next) => {
    if (10 < 20) {
        next();
    }
});


app.use(express.urlencoded({ extended: true }));

app.get('/', (req, res) => {
    res.send(`
    <html>
    <body>
        <h2>School of Computing</h2>
        <ul>
        <li><a href="/student">View Students</a> - view all students</li>
        </ul>

        <h3>Register Student</h3>
        <form action="/register" method="POST">
            <input type="text" name="name" placeholder="Enter name" required>
            <input type="number" name="rollnumber" placeholder="Enter roll number" required>
            <button type="submit">Register</button>
        </form>
    </body>
    </html>    
    `);
});

app.post('/register', (req, res) => {
    const { name, rollnumber } = req.body;
    const newStudent = {
        id: student.length > 0 ? Math.max(...student.map(s => s.id)) + 1 : 1,
        name: name,
        rollnumber: Number(rollnumber) 
    };

    student.push(newStudent);
    return res.redirect('/student');
});

app.get('/student', (req, res) => {
    res.json(student);
});

app.listen(port, () => {
    console.log(`Server is running successfully on port https://localhost:6000`);
});
