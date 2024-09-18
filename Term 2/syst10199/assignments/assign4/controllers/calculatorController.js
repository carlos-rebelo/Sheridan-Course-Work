"strict mode";
const path = require("path");
//Function for addition, renders index and takes values inputed in request
exports.add = (req, res) => {
    res.render("index", {
        num1: req.params.num1,
        num2: req.params.num2,
        num3: Number(req.params.num1) + Number(req.params.num2),
        operator: "+"
    });
};
//Function for subtraction, renders index and takes values inputed in request
exports.subtract = (req, res) => {
    res.render("index", {
        num1: req.params.num1,
        num2: req.params.num2,
        num3: Number(req.params.num1) - Number(req.params.num2),
        operator: "-"
    });
};
//Function for multiplication, renders index and takes values inputed in request
exports.multiply = (req, res) => {
    res.render("index", {
        num1: req.params.num1,
        num2: req.params.num2,
        num3: Number(req.params.num1) * Number(req.params.num2),
        operator: "x"
    });
};
//Function for division, renders index and takes values inputed in request
exports.divide = (req, res) => {
    res.render("index", {
        num1: req.params.num1,
        num2: req.params.num2,
        num3: Number(req.params.num1) / Number(req.params.num2),
        operator: "/"
    });
};
//Function for error handling, renders error page and displays url entered
exports.renderError = (req, res) => {
    res.render("error", {
        url: req.url
    })
};