/*
Name:  Carlos Rebelo
Assignment:  Assignment 2
Date:  2024-02-19

Page Description: This page is the main script for this website, it contains   
functions and variables that create and populate a table using JSON data.
Files: 
    index.html: the news page for WingNut Watercolors
    table.json: contains json data used to populate table
*/

"use strict";

// Creating table element
const table = document.createElement("table");
//Adding event listener to execute code after DOM has been fully loaded
document.addEventListener("DOMContentLoaded", function() {
    //Selecting and storing first p in the first article
    const firstParInArt1 = document.body.querySelector(
        "article:first-of-type > p:first-of-type");
        
    //creating table caption, table row 1, and the 3 table headings
    const tableCaption = document.createElement("caption");
    const tableRow1 = document.createElement("tr");
    const tableHeading1 = document.createElement("th");
    const tableHeading2 = document.createElement("th");
    const tableHeading3 = document.createElement("th");
    //adding text content to caption
    tableCaption.textContent = "Available Colours";
    //adding text content to table headings
    tableHeading1.textContent = "Colour Code";
    tableHeading2.textContent = "Colour Name";
    tableHeading3.textContent = "Pigment Number";
    //appending caption to table
    table.append(tableCaption);
    //appending each heading to the first table row
    tableRow1.append(tableHeading1);
    tableRow1.append(tableHeading2);
    tableRow1.append(tableHeading3);
    //appending row 1 to table
    table.append(tableRow1);
    //Inserting table as next sibling for the first p in the first article
    firstParInArt1.after(table);
    //calling getTable fucntion to populate table with data
    getTable();
    
})
//creating function to populate table
function getTable() {
    //fetching data from data folder
    fetch("data/table.json")
    //converting fetched data to json
    .then(response => response.json())
    .then(data => {
        //iterating through each object
        for(let link of data) {
            //creating a new row and 3 table data elements for each object
            let tr = document.createElement("tr");
            let td1 = document.createElement("td");
            let td2 = document.createElement("td");
            let td3 = document.createElement("td");
            //Changing text content of each table data based on link attributes
            td1.textContent = link.colourCode;
            td2.textContent = link.colourName;
            td3.textContent = link.pigmentNumber;
            //appending the table data elements to the table row
            tr.append(td1,td2,td3);
            //appending the row to the table
            table.append(tr);
        }
    })
}