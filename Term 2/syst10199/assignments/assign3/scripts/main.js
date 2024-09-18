"use strict";

let formHandler = {
    minNameLength: 4,
    minPassLength: 8,
    maxBioLength: 200,
    handleEvent(event) {
        // event.target is the form
        const input1 = event.target.username.value.trim();
        const input2 = event.target.pword.value.trim();
        const input3 = event.target.plan.value;
        const input4 = event.target.gender.value;
        const input5 = event.target.sports.checked;
        const input6 = event.target.videogames.checked;
        const input7 = event.target.music.checked;
        const errorDiv = document.querySelector("#name-div");
        const errorDiv2 = document.querySelector("#pass-div");
        const errorDiv3 = document.querySelector("#plan-div");
        const errorDiv4 = document.querySelector("#gender-div");
        const errorDiv5 = document.querySelector("#interests-div");
        const confirmDiv = document.querySelector("#confirm-div");
        const passRegEx = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\W)(?!.* ).{8,16}$/;

        const inputs = [false,false,false,false,false];

        if (input1.length < this.minNameLength) {
            errorDiv.classList.remove("hide");
            errorDiv.textContent = `Error: Username must be at least ${this.minNameLength} characters.`;
            event.preventDefault();
        }
        else {
            errorDiv.classList.add("hide");
            inputs[0] = true;
        }
        if (passRegEx.test(input2) == false) {
            errorDiv2.classList.remove("hide");
            errorDiv2.textContent = `Error: Password must be at least 
            ${this.minPassLength} characters, include at least one uppercase 
            letter, one lowercase letter, one number, and one special character.`;
            event.preventDefault();
        }
        else {
            errorDiv2.classList.add("hide");
            inputs[1] = true;
        }
        if (input3 == "") {
            errorDiv3.classList.remove("hide");
            errorDiv3.textContent = `Error: A subscription plan must be selected.`;
            event.preventDefault();
        }
        else {
            errorDiv3.classList.add("hide");
            inputs[2] = true;
        }
        if (input4 == "") {
            errorDiv4.classList.remove("hide");
            errorDiv4.textContent = `Error: A gender must be selected.`;
            event.preventDefault();
        }
        else {
            errorDiv4.classList.add("hide");
            inputs[3] = true;
        }
        if (input5 == false && input6 == false && input7 == false) {
            errorDiv5.classList.remove("hide");
            errorDiv5.textContent = `Error: An interest must be selected.`;
            event.preventDefault();
        }
        else {
            errorDiv5.classList.add("hide");
            inputs[4] = true;
        }
        let allTrue = inputs.every(element => element === true);
        if (allTrue) {
            confirmDiv.classList.remove("hide");
            confirmDiv.textContent = "Congrats! all input fields are valid";
            event.preventDefault();
        }
        else {
            confirmDiv.classList.add("hide");
        }
    }
};
document.addEventListener("DOMContentLoaded", () => {
    const genderOther = document.forms.demoform.querySelector("#other");
    genderOther.onclick = () => {
        const label = document.createElement("label");
        const otherInput = document.createElement("input");
        otherInput.type = "text";
        otherInput.name = "otherInput";
        otherInput.id = "otherInput";
        label.textContent = "(Please Specify)";
        label.for = "otherInput";
        label.append(otherInput);
        genderOther.after(label);
    }
    document.forms.demoform.addEventListener("submit", formHandler);
});