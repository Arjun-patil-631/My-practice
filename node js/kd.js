import fs from 'node:fs/promises';

async function createLog(){
    try{
        await fs.writeFile('log.txt', 'System started successfulyy\n');
        console.log("File cretaed successfully");
    }
    catch(err){
        console.error("error writing file", err);
    }
}
console.log("File creation using writeFile");
createLog();