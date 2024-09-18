"use strict";
const port = 4000
let http = require("http");
let fs = require("fs");
let chineseYear = require("chinese-year");
const { url } = require("inspector");

http.createServer((req, res) => {
    res.setHeader("Content-Type", "text/html");


    if(req.url.indexOf("getyear") >= 0) {

        let urlObj = new URL(`https://${req.headers.host}${req.url}`);
        let year  = urlObj.searchParams.get("year");
        year = (year) ? year: new Date().getFullYear();
        const animal = chineseYear.getAnimal(year);

        res.statusCode = 200; 
        res.write(`<h1>Chinese Year<h1><p>${year} is year of the ${animal}</p>`);
        res.end();
    } else {
        fs.readFile("index.html", (error, data) => {

            if (error) { // error finding/reading file
                res.statusCode = 404; // 404 = NOT FOUND
                res.write("<h1>File Not Found</h1>");
                console.log(error);  // for debugging

            } else {  // no errors, get the file
                res.statusCode = 200; // 200 = OK
                // data contains the file contents
                // write the file's contents to the response body
                res.write(data);
            }
            // all done either way, send the response        
            res.end();
        });
    }
}).listen(port, () => {
    console.log(`Server running on port ${port}`);
})

