"use strict";
//connecting controller
const homeController = require("./controllers/calculatorController");
// making express required
const express = require("express");
// starting up express
const app = express();
// requiring path to allow easier path usage
const path = require("path");

//setting view engine to ejs
app.set("view engine", "ejs");
//setting port to 3000
app.set("port", process.env.PORT || 3000);
//using middleware to serve static files (css)
app.use(express.static(path.join(__dirname, "public")));
//routing controller function for addition
app.get("/add/:num1/:num2", homeController.add);
//routing controller function for subtraction
app.get("/subtract/:num1/:num2", homeController.subtract);
//routing controller function for multiplication
app.get("/multiply/:num1/:num2", homeController.multiply);
//routing controller function for division
app.get("/divide/:num1/:num2", homeController.divide);
//routing controller function for error handling
app.get("*", homeController.renderError);

app.listen(app.get("port"), () => {
    console.log(`Server running on http://localhost:${app.get("port")}`)
});