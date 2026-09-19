const express=require("express");
const app=express();

const port=5000;

let student=[
    {id:1, name:"Ramu", rollnumber:601},
    {id:2, name:"Ravi", rollnumber:602},
    {id:3, name:"Raju", rollnumber:603}
]
app.get('/',(req,res)=>{
    res.send(`
    <html>
    <body>
        <h1>Student list</h1>
        <p>
            <a href="/student">Move to student</a>
        </p>
    </body>
    </html>    
    `)
})
app.get('/student',(req,res)=>{
    res.json(student)
})

app.listen(port, ()=>{
    console.log("Server is running successfully");
})
