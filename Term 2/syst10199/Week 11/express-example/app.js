"use strict";
const express = require("express");
const app = express();
app.set("port", process.env.PORT || 3000);

app.listen(app.get("port"), () => {
    console.log(`Server running on port: ${app.get('port')}`);
  });

  app.use((req, res, next) => {                    
    console.log(`${req.method} request made to: ${req.url}`);    
    // uncomment if you'd like to see the request headers:
    console.log(req.headers);
    next(); // invoke next function                                  
});
app.use(express.urlencoded({extended: false}));
app.post("/express", (req, res) => {
    // prints whatever is in the request body
    console.log(`POST request to /express contains: ${req.body.name}`);
    res.send("<h1>This was a POST Request</h1>");
});
app.get("/express", (req,res) => {
    res.send("<h1>Hello Express</h1>");
});