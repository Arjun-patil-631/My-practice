const Employee = require('../models/employee');

const createEmployee = async (req, res) => {
    try {
        const { employeeId, name, email, phone, city } = req.body;
        const employee = new Employee({ 
            employeeId, 
            name, 
            email, 
            phone, 
            city 
        });
        await employee.save();
        res.status(201).json(employee);
    } catch (error) {
        console.error("There is an error:", error);
        res.status(500).json({ message: error.message });
    }
};

const getEmployees=async(req, res)=>{
    try{
        const employees=await Employee.find()
        res.status(200).json(employees)
    }catch(error){
        console.error("There is an error:", error);
        res.status(500).json({ message: error.message });
    }
}
module.exports = { createEmployee, getEmployees };