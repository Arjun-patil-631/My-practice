let classroom={
    classname:"section A",
    totalStudents:44,
    studentsList:[
        {name:"ramu", rollno:65},
        {name:"kiran", rollno:47}
    ]
};
console.log(classroom.classname);
console.log(classroom.studentsList[0].name);

//coverting to string
let classroomstring=JSON.stringify(classroom);
console.log(classroomstring);