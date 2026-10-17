import React from 'react'; 
import './Navbar.css'; 
function Navbar({ activeTab, setActiveTab }) { 
    return (
    <nav className="navbar">       
    <h2 className="navbar-brand">Employee Management System</h2>       
    <div className="navbar-links">         
    <button 
        className={`nav-btn ${activeTab === 'list' ? 'active' : ''}`} 
        onClick={() => setActiveTab('list')}         
    >Employee List</button>         
    <button 
        className={`nav-btn ${activeTab === 'add' ? 'active' : ''}`} 
        onClick={() => setActiveTab('add')}         
    >Add Employee</button>       
    </div>     
    </nav>); 
} 
export default Navbar; 