
import React, { useState } from 'react';
import axios from 'axios';
import './AddEmployee.css';

function AddEmployee({ onEmployeeAdded }) {
  const [formData, setFormData] = useState({
    employeeId: '',
    name: '',
    email: '',
    phone: '',
    city: '',
    salary: '',
    bonus: '',
    deductions: ''
  });

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      await axios.post(
        'http://localhost:5000/employee/add-emp',
        formData
      );

      alert('Employee Added Successfully!');

      setFormData({
        employeeId: '',
        name: '',
        email: '',
        phone: '',
        city: '',
        salary: '',
        bonus: '',
        deductions: ''
      });

      if (onEmployeeAdded) {
        onEmployeeAdded();
      }
    } catch (error) {
      console.error('Error inserting data:', error);

      const serverMessage =
        error.response?.data?.error ||
        error.response?.data?.message ||
        error.message;

      alert(`Failed to add employee: ${serverMessage}`);
    }
  };

  return (
    <div className="add-employee-card">
      <h3 className="card-title">Add New Employee</h3>

      <form onSubmit={handleSubmit}>
        <div className="form-grid">
          <label className="form-label">
            Employee ID *
            <input
              className="form-input"
              type="number"
              name="employeeId"
              placeholder="Employee ID"
              value={formData.employeeId}
              onChange={handleChange}
              required
            />
          </label>

          <label className="form-label">
            Name *
            <input
              className="form-input"
              type="text"
              name="name"
              placeholder="Full name"
              value={formData.name}
              onChange={handleChange}
              required
            />
          </label>

          <label className="form-label">
            Email *
            <input
              className="form-input"
              type="email"
              name="email"
              placeholder="Email address"
              value={formData.email}
              onChange={handleChange}
              required
            />
          </label>

          <label className="form-label">
            Phone
            <input
              className="form-input"
              type="text"
              name="phone"
              placeholder="Phone number"
              value={formData.phone}
              onChange={handleChange}
            />
          </label>

          <label className="form-label">
            City
            <input
              className="form-input"
              type="text"
              name="city"
              placeholder="City"
              value={formData.city}
              onChange={handleChange}
            />
          </label>

          <label className="form-label">
            Salary (₹)
            <input
              className="form-input"
              type="number"
              name="salary"
              placeholder="Basic salary"
              value={formData.salary}
              onChange={handleChange}
            />
          </label>

          <label className="form-label">
            Bonus (₹)
            <input
              className="form-input"
              type="number"
              name="bonus"
              placeholder="Bonus"
              value={formData.bonus}
              onChange={handleChange}
            />
          </label>

          <label className="form-label full-width">
            Deductions (₹)
            <input
              className="form-input"
              type="number"
              name="deductions"
              placeholder="Deductions"
              value={formData.deductions}
              onChange={handleChange}
            />
          </label>
        </div>

        <button type="submit" className="submit-btn">
          Submit
        </button>
      </form>
    </div>
  );
}

export default AddEmployee;
