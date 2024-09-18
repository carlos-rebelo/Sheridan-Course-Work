"use strict";

const path = require("path");
exports.renderIndex = (req, res) => {
    res.render("index", {radius: req.params.radius});
};