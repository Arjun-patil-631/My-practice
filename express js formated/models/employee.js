const mongoose = require('mongoose');
const employeeSchema = new mongoose.Schema({
    employeeId: {
        type: Number,
        required: true,
        unique: true
    },
    name: {
        type: String,
        required: true
    },
    email: {
        type: String,
        required: true,
    },
    phone: {
        type: Number,
        default: false,
        required: true,
        unique: true
    },
    city: {
        type: String,
        required: true
    },
    salary:{
        type:Number,
        required: true
    },
    bonus:{
        type: Number,
        required: true
    },
    deductions:{
        type: Number,
        required: true
    }
});
module.exports=mongoose.model('Employee',employeeSchema)
