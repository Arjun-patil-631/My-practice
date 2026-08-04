/*function prepareFood(dish, callback){
    console.log(`cooking ${dish}...`);

    setTimeout(()=>{
        console.log(`${dish} is ready`);
        callback();
    },3000);
}
    function serveFood(){
        console.log("Serving food to customer");
    }
    prepareFood("biryani", serveFood);  
    console.log("make a order");
*/
    //promise
function fetchUserData(){
    return new Promise((resolve, reject)=>{
        let sucess=false;

        setTimeout(()=>{
            if(sucess){
                resolve({id :101, name:"Arjun"});
            }else{
                reject("server error: unable to frtch user");
            }
        },2000);
    });
}
//consuming the promise
fetchUserData()
.then((data)=>{
    console.log("user received:", data.name);
})
.catch((error)=>{
    console.log("Error:", error);
});