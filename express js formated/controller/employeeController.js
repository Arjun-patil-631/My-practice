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

const updateEmployee=async(req,res)=>{
    try{
        const {employeeId, name, email, phone, city}=req.body
        const myEmployee=await Employee.findByIdAndUpdate(req.params.id,{employeeId,name,email,phone,city})
        if(!myEmployee){
            return res.status(404).json({message: 'employee not found'})
        }
        res.status(202).json(myEmployee)
    }catch(error){
        console.error("There is an error", error);
        res.status(500).json({message: "server error"});
    }
}

const deleteEmployee=async(req,res)=>{
    try{
        const deleteEmployee= await Employee.findByIdAndDelete(req.params.id)
        res.status(204).send()
    }catch(error){
        console.error("There is an error:", error);
        res.status(500).json({message:"server error"});
    }
}
module.exports = { createEmployee, getEmployees, updateEmployee, deleteEmployee };