"use strict";

/*
fetch(): performs a request for a file
- does this behind the scenes - asynchonously -
the browser doesnt have to wait for a response
- a promise: ill go get this file, and i promise i will notify you when i have 
all the data from the file and then you can process it. In the meantime do what
youre doing!

fetch(resource).then(doThing).then(doAnotherthing).catch(errorHandling)
*/

document.addEventListener("DOMContentLoaded",  () => {
    getMenu();
});

function getMenu() {
    //cant run fetch locally, must be uploaded to server
    fetch("data/menu.json")
    //converting fetched data to json data, by default its text
    .then(response => response.json())
    //auto stores that into data, the printing into console
    .then(data => {
        let nav = document.createElement("nav");
        for (let link of data) {
            let a = document.createElement("a");
            a.href = link.file;
            a.textContent = link.name;
            nav.append(a);
        }
        document.body.querySelector("header").append(nav);
    })
    .catch(error => console.log(error));
}