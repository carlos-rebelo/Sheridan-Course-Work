"use strict";

const port = 3000,
    http = require("http"),
    fs = require("fs");

const customReadFile = (path, res) => {

    if (fs.existsSync(path)) {
      
        fs.readFile(path, (error, data) => {
    
            if (error) {
                console.log(error);
                sendErrorResponse(res, path);
                return;
            } 
            res.write(data);
            res.end();
            });
        } else {  
            sendErrorResponse(res, path);
        }
    };  
      
    const sendErrorResponse = (res, path) => {
        res.writeHead(404, {
            "Content-Type": "text/html"
        });
        res.write(`<h1>File Not Found!</h1><p>${path}</p>`);
        res.end();
    };

    http.createServer((req, res) => {
        let contentType = ""; 
        let path = "";
        let fileName = req.url.split("/").pop();
        if (req.url.indexOf(".html") >= 0) {
            contentType = "text/html";
            path = `./views/${fileName}`;
          } else if (req.url.indexOf(".css") >= 0) {
            contentType = "text/css";
            path =  `./public/css/${fileName}`;
          } else if (req.url.indexOf(".jpg") >= 0) {
            contentType = "image/jpg";
            path =  `./public/images/${fileName}`;
          } 
          console.log(contentType);
          console.log(path);
          console.log(fileName);
          if (contentType === "") {
            sendErrorResponse(res, path);
          } else {
          
          }
          if (contentType === "") {
            sendErrorResponse(res, path);
          } else {
            res.writeHead(200, {
              "Content-Type": contentType
            });
            customReadFile(path, res); 
          }

    }).listen(port, () => {
        console.log(`The server is listening on port number: ${port}`);
        
    });
    