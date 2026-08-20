import { converterToCaps } from "./converter.js";

const fileInput=document.getElementById("myFile");
const msg=document.getElementById("msg");
const err=document.getElementById("err");

fileInput.addEventListener("change", async function () {
    
    msg.textContent="";
    err.textContent="";

    try{
        const file=fileInput.files[0];
        if(!file){
            return;
        }
        if(!file.name.toLowerCase().endsWith(".txt")){
            throw new Error("only txt files are allowed");
        }

        const text=await file.text();
        const result=converterToCaps(text);

        msg.textContent=result;
    }
    catch(error){
        msg.textContent=error.message;
    }
    
});