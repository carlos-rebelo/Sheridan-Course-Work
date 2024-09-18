"use strict";
document.addEventListener("DOMContentLoaded", () => {
    
    // register the Foo button to fire click events
    // when the user clicks the Foo button, execute the 
    // clickFoo() function (you could have also used an anonymous
    // function)
   /*  let foo = document.body.querySelector("#fooButton");
    foo.addEventListener("click", () => {
        alert("Hello World")
    })
    foo.addEventListener("click", () => {
        alert("Hello World 2")
    }) */
    // add these lines to your init() function:
    let text = document.body.querySelector("section span");

// pick one:
// using event properties 
//text.onmouseover = mouseHandler;
//text.onmouseout = mouseHandler;
// OR 
// using addEventListener():
    text.addEventListener("mouseover", mouseHandler,);
    text.addEventListener("mouseout", mouseHandler);
});
// add this function to your JavaScript file (e.g. near the end)
function mouseHandler(event) { // add event parameter
    console.log("type of event: ", event.type);  // add this
    console.log("event target: ", event.target);  // add this
    let tip = document.body.querySelector("section > div > p:last-of-type");
    tip.classList.toggle("hide");
}
// named event handler function:
/* function clickFoo() {
    document.body.querySelector("main > div:last-child").textContent
        = "You clicked the button!";
}

function clickH1() {
    document.body.querySelector("main > div:last-child").textContent = 
    "You clicked the H1";
} */
