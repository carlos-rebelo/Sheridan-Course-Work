"use strict";
const http = require('http');
const server = http.createServer((req, res) => {
    console.log(req.url)
    if (req.url === '/api/courses') {
        res.setHeader("content-type", "text/html")
        res.end("<h1>Hello World</h1>");
    }
    else

    res.write("New request came!");
    res.end();
});

server.listen(4000, () => {
    console.log("server is up");
})