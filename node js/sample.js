const os=require(`os`)
console.log(os.type())
console.log(os.version())
console.log(os.freemem())

const path=require(`path`)
console.log(path.dirname(__filename))


const http=require(`http`)
const myServer=http.createServer((req,res)=>{
    res.write("welcome to node js\n")
    res.write("This server is created by arjun")
    res.end()
})
myServer.listen(5500)