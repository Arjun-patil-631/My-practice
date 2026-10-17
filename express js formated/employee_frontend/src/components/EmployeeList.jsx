
import React, { useState } from 'react';
import axios from 'axios';
import './EmployeeList.css';

function EmployeeList({ employees, loading, onRefresh }) {
  const [editingEmployee, setEditingEmployee] = useState(null);

  // 1. Calculate and display net salary
  const handleCalculateSalary = async (employeeId) => {
    try {
      const response = await axios.get(
        `http://localhost:5000/employee/net-salary/${employeeId}`
      );

      const data = response.data;

      const empName = data.name || data.employee?.name || 'Employee';
      const salaryEmployeeId = data.employeeId ?? data.employee?.employeeId ?? 'N/A';
      const baseSalary = data.baseSalary ?? data.salary ?? 0;
      const bonus = data.bonus ?? 0;
      const deductions = data.deductions ?? 0;
      const netSalary = data.netSalary ?? 0;

      alert(
        `Employee: ${empName}\n` +
          `Employee ID: ${salaryEmployeeId}\n` +
          `Base Salary: ₹${baseSalary}\n` +
          `Bonus: ₹${bonus}\n` +
          `Deductions: ₹${deductions}\n` +
          `--------------------------\n` +
          `Net Salary: ₹${netSalary}`
      );
    } catch (error) {
      console.error('Error fetching net salary:', error);
      alert('Could not calculate net salary.');
    }
  };

  // 2. Delete employee
  const handleDelete = async (id) => {
    const confirmDelete = window.confirm(
      'Are you sure you want to delete this employee?'
    );

    if (!confirmDelete) return;

    try {
      await axios.delete(
        `http://localhost:5000/employee/delete-emp/${id}`
      );

      alert('Employee deleted successfully!');

      if (typeof onRefresh === 'function') {
        onRefresh();
      }
    } catch (error) {
      console.error('Error deleting employee:', error);

      const errMsg =
        error.response?.data?.message || error.message;

      alert(`Failed to delete employee: ${errMsg}`);
    }
  };

  // 3. Open the edit form
  const handleEditClick = (emp) => {
    setEditingEmployee({ ...emp });
  };

  // Handle changes in the edit form
  const handleEditChange = (e) => {
    setEditingEmployee({
      ...editingEmployee,
      [e.target.name]: e.target.value
    });
  };

  // 4. Update employee details
  const handleUpdateSubmit = async (e) => {
    e.preventDefault();

    try {
      await axios.put(
        `http://localhost:5000/employee/update-emp/${editingEmployee._id}`,
        editingEmployee
      );

      alert('Employee updated successfully!');
      setEditingEmployee(null);

      if (typeof onRefresh === 'function') {
        onRefresh();
      }
    } catch (error) {
      console.error('Error updating employee:', error);

      const errMsg =
        error.response?.data?.message || error.message;

      alert(`Failed to update employee: ${errMsg}`);
    }
  };

  // Display loading state
  if (loading) {
    return <p>Loading employee data...</p>;
  }

  return (
    <div className="list-container">
      <h3 className="list-title">Employee Directory</h3>

      {Array.isArray(employees) && employees.length === 0 ? (
        <p>No employees found in database.</p>
      ) : (
        <div className="table-wrapper">
          <table className="employee-table">
            <thead>
              <tr>
                <th>Employee ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>City</th>
                <th>Salary (₹)</th>
                <th>Bonus (₹)</th>
                <th>Deductions (₹)</th>
                <th style={{ textAlign: 'center' }}>
                  Actions
                </th>
              </tr>
            </thead>

            <tbody>
              {Array.isArray(employees) &&
                employees.map((emp) => (
                  <tr key={emp._id}>
                    <td>{emp.employeeId ?? 'N/A'}</td>
                    <td>{emp.name}</td>
                    <td>{emp.email}</td>
                    <td>{emp.city || 'N/A'}</td>
                    <td>{emp.salary ?? 0}</td>
                    <td>{emp.bonus ?? 0}</td>
                    <td>{emp.deductions ?? 0}</td>

                    <td className="actions-cell">
                      <button
                        className="btn-salary"
                        onClick={() =>
                          handleCalculateSalary(emp._id)
                        }
                      >
                        Salary
                      </button>

                      <button
                        className="btn-edit"
                        onClick={() => handleEditClick(emp)}
                      >
                        Edit
                      </button>

                      <button
                        className="btn-delete"
                        onClick={() => handleDelete(emp._id)}
                      >
                        Delete
                      </button>
                    </td>
                  </tr>
                ))}
            </tbody>
          </table>
        </div>
      )}

      {/* Edit Employee Modal */}
      {editingEmployee && (
        <div className="modal-overlay">
          <div className="modal-content">
            <h3 style={{ marginTop: 0 }}>
              Edit Employee
            </h3>

            <form
              onSubmit={handleUpdateSubmit}
              className="modal-form"
            >
              <label>
                Employee ID:
                <input
                  className="modal-input"
                  type="number"
                  name="employeeId"
                  value={editingEmployee.employeeId ?? ''}
                  onChange={handleEditChange}
                  required
                />
              </label>

              <label>
                Name:
                <input
                  className="modal-input"
                  type="text"
                  name="name"
                  value={editingEmployee.name || ''}
                  onChange={handleEditChange}
                  required
                />
              </label>

              <label>
                Email:
                <input
                  className="modal-input"
                  type="email"
                  name="email"
                  value={editingEmployee.email || ''}
                  onChange={handleEditChange}
                  required
                />
              </label>

              <label>
                City:
                <input
                  className="modal-input"
                  type="text"
                  name="city"
                  value={editingEmployee.city || ''}
                  onChange={handleEditChange}
                />
              </label>

              <label>
                Salary (₹):
                <input
                  className="modal-input"
                  type="number"
                  name="salary"
                  value={editingEmployee.salary ?? ''}
                  onChange={handleEditChange}
                />
              </label>

              <label>
                Bonus (₹):
                <input
                  className="modal-input"
                  type="number"
                  name="bonus"
                  value={editingEmployee.bonus ?? ''}
                  onChange={handleEditChange}
                />
              </label>

              <label>
                Deductions (₹):
                <input
                  className="modal-input"
                  type="number"
                  name="deductions"
                  value={editingEmployee.deductions ?? ''}
                  onChange={handleEditChange}
                />
              </label>

              <div className="modal-actions">
                <button
                  type="button"
                  className="btn-cancel"
                  onClick={() => setEditingEmployee(null)}
                >
                  Cancel
                </button>

                <button
                  type="submit"
                  className="btn-save"
                >
                  Save Changes
                </button>
              </div>
            </form>
          </div>
        </div>
      )}
    </div>
  );
}

export default EmployeeList;
