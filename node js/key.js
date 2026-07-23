var x=10;
var y=12.3;
var name="soc";

console.log(x, "", y,"",name);
function add(x, y){
    var res=x+y;
    console.log(res);
}

{
    let a=20;
    const b=30;
    console.log(a);
    console.log(b);

}
//console.log(a); this will give error 
//because a, b is block scope variable

//data types
/*
1.string
2.number
3.boolean
4.null
5.undefined
6.symbol
7.bigint
8.object {}
9.array []
*/

//by using typeof operator we can find the data type of variable
console.log(typeof x);

//template literals
console.log(`name:${name}`);

let a=10;
let b=20;
let res=(x,y)=> x+y;//arrow function
console.log(res(a,b));