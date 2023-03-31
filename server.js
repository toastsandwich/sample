var express = require('express');

const server = express();
const port = 3000

server.get('/',(req,res)=>{
    res.sendFile(__dirname+'/page.html');
    console.log("change made");
});

server.listen(port);
console.log("Server up!!");