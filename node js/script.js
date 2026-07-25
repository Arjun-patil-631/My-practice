let userName=prompy("Enter your name");
let birthYear=prompt("Enter your birth year");
let currentYear=2026;
let age=currentYear-Number(birthYear);

// document.getElementById("greeting").textContent=`Hello, ${userName}`;
// document.getElementById("output").textContent=`your age is ${age}`;

if(!userName){
    alert("Name is required");
}else if(isNaN(birthYear)){
    alert("Please enter a valid age");
}else{
    document.getElementById("output").innerHTML=`hello ${userName} your age is ${age}`;
}