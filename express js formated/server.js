const express=require('express')
const mongoose=require('mongoose')
const dotenv=require('dotenv')
const bodyParser=require('body-parser')
const app=express()
dotenv.config()
const PORT=process.env.PORT
const cors=require('cors')
const employeeRoutes=require('./routes/employeeRoutes')
const employee = require('./models/employee')

app.get('/',(req,res)=>{
    res.status(200).json(employee)
})

// Middleware 
app.use(cors()); // 2. Enable CORS for cross-origin requests 
app.use(bodyParser.json()); 
app.use(bodyParser.urlencoded({ extended: true })); 

app.use('/employee',employeeRoutes)
mongoose.connect(process.env.MONGO_URI
        console.log("MongoDB Connected Successfully")
    })
    .catch((error)=>{
        console.log("ERROR:",error)
    })

app.listen(PORT,()=>{
    console.log(`Server started successfully on port ${PORT}`)
})