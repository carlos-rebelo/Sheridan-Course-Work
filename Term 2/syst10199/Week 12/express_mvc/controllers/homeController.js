
"use strict";

const path = require("path");
const menu = require("../models/menu.json");
exports.renderIndex = (req, res) => {
    res.render("index", { 
        dayInput: req.params.day, 
        dayMenu: menu[req.params.day]
    });
};