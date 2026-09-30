const express=require('express')
const router=express.Router()
const employeeContoller=require('../controller/employeeController')
const Employee=require('../models/employeeModel')
router.post('/add-emp',employeeContoller.createEmployee)
router.get('/allemployees',employeeContoller.getEmployees)
router.put('/update-emp/:id',employeeContoller.updateEmployee)
router.delete('/delete-emp/:id',employeeContoller.deleteEmployee)
module.exports=router