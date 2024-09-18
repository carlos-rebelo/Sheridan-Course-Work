"use strict";

document.addEventListener("DOMContentLoaded", function () {
    //Accessing Form Elements
    /* console.log(document.forms);
    console.log(document.forms[0]);
    console.log(document.forms.demoform);

    let form = document.forms.demoform;
    console.log(form.elements);
    console.log(form.elements[0]);
    console.log(form.elements.name);

    console.log("All elements");
    for (let element of form.elements) {
        console.log(element);
    }
    console.log("Fieldset and its eleemtns");
    let fieldset = document.forms[0].elements[0];
    for (let element of fieldset.elements) {
        console.log(element);
    }
    console.log("Fieldsets parent form");
    console.log(fieldset.form); */
    //Accessing form properties/attributes
    /* let form = document.forms.demoform;
    form.username.value = "Foobar";
    form.termnum.value = 2;
    form.petsrgood.checked = true;
    form.pocket[2].checked = true;
    form.animal.value = 2; */
    // execute after DOM content has finished loading:
/* let planets = ["Earth", "Mars", "Mercury", "Venus"];
let form = document.forms.demoform;
// div to hold the new field
let div = document.createElement("div");
// accessible label
let lbl = document.createElement("label");
lbl.setAttribute("for", "planet"); // lbl.for works but doesn't appear in DOM
let lblText = document.createTextNode("Current Planet:");
// create the select
let select = document.createElement("select");
select.id = "planet";  // make sure value matches the lbl.for
select.name = "userplanet";

// create each option and add to select
for (let p of planets) {
    let opt = new Option(p, p.toLowerCase());
    select.append(opt);
}
select.options[0].selected = true; // select first one just in case
lbl.append(lblText); // add label text to label
lbl.append(select); // nest select inside label
div.append(lbl); // add label to div
form.lastElementChild.before(div); */
})
"use strict";

let formHandler = {
    minUserLength: 6,
    maxUserLength: 10,
    handleEvent(event) {
        // event.target is the form
        let input = event.target.username.value;
        let errorDiv = document.querySelector(".error");

        if (input.length < this.minUserLength || input.length > this.maxUserLength) {
            errorDiv.classList.remove("hide");
            errorDiv.textContent = `Error: username must be ${this.minUserLength} to ${this.maxUserLength} characters.`;
            event.preventDefault();
        } else {
            errorDiv.classList.add("hide");
        }
    }
};
document.addEventListener("DOMContentLoaded", () => {
    document.forms.demoform.addEventListener("submit", formHandler);
});