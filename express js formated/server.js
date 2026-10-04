const express=require('express')
const mongoose=require('mongoose')
const dotenv=require('dotenv')
const bodypraser=require('body-parser')
const app=express()
dotenv.config()
const PORT=process.env.PORT

app.use(bodypraser.json())
const employeeRoutes=require('./routes/employeeRoutes')
const employee = require('./models/employee')

app.get('/',(req,res)=>{
    res.status(200).json(employee)
})

app.use('/employee',employeeRoutes)
mongoose.connect(process.env.MONGO_URL)
    .then(()=>{
        console.log("MongoDB Connected Successfully")
    })
    .catch((error)=>{
        console.log("ERROR:",error)
    })

app.listen(PORT,()=>{
    console.log(`Server started successfully on port ${PORT}`)
})