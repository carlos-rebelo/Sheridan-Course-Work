"use strict";

const express = require("express"),
app = express(),
homeController = require("./controllers/homeController.js");
app.set("port", process.env.PORT || 3000);
app.set("view engine", "ejs");
app.get("/circle/:radius", homeController.renderIndex);

app.listen(app.get("port"), () => {
    console.log(`Server running on http://localhost:${app.get("port")}`);
});          