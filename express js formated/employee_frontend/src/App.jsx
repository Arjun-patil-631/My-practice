
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Navbar from './components/Navbar';
import AddEmployee from './components/AddEmployee';
import EmployeeList from './components/EmployeeList';
import './App.css';

function App() {
  const [activeTab, setActiveTab] = useState('list');
  const [employees, setEmployees] = useState([]);
  const [loading, setLoading] = useState(false);

  // Fetch all employees from the Node.js API
  const fetchEmployees = async () => {
    setLoading(true);

    try {
      const response = await axios.get(
        'http://localhost:5000/employee/allemployees'
      );

      if (Array.isArray(response.data)) {
        setEmployees(response.data);
      } else {
        setEmployees([]);
      }
    } catch (error) {
      console.error('Error fetching employees:', error);
      setEmployees([]);
    } finally {
      setLoading(false);
    }
  };

  // Fetch employees when the component loads
  useEffect(() => {
    fetchEmployees();
  }, []);

  // Refresh the list after adding an employee
  const handleEmployeeAdded = () => {
    fetchEmployees();
    setActiveTab('list');
  };

  return (
    <div className="app-container">
      <Navbar
        activeTab={activeTab}
        setActiveTab={setActiveTab}
      />

      <main className="main-content">
        {activeTab === 'list' && (
          <EmployeeList
            employees={employees}
            loading={loading}
            onRefresh={fetchEmployees}
          />
        )}

        {activeTab === 'add' && (
          <AddEmployee
            onEmployeeAdded={handleEmployeeAdded}
          />
        )}
      </main>
    </div>
  );
}

export default App;
