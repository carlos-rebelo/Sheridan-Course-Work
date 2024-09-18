"use strict";

let formHandler = {
    confirmNum: 0,
    minPassLength: 6,
    maxPassLength: 10,
    minAge: 16,
    maxAge: 100,
    handleEvent(event) {
        // event.target is the form
        let input1 = event.target.pword.value;
        let input2 = event.target.name.value.trim();
        let input3 = event.target.pwordConfirm.value;
        let input4 = event.target.agenum.value;
        let errorDiv = document.querySelector("#pass-div");
        let errorDiv2 = document.querySelector("#name-div");
        let errorDiv3 = document.querySelector("#passConfirm-div");
        let errorDiv4 = document.querySelector("#age-div");
        let confirmDiv = document.querySelector("#confirm-div");
        if (input4 < this.minAge || input4 > this.maxAge) {
            errorDiv4.classList.remove("hide");
            errorDiv4.textContent = `Error: age must be between ${this.minAge} and ${this.maxAge}.`;
            event.preventDefault();
        }
        else {
            errorDiv4.classList.add("hide");
            this.confirmNum += 1;
        }
        if (input3 != input1) {
            errorDiv3.classList.remove("hide");
            errorDiv3.textContent = `Error: Passwords must match`;
            event.preventDefault();
        }
        else {
            errorDiv3.classList.add("hide");
            this.confirmNum += 1;
        }
        if (input2 == "") {
            errorDiv2.classList.remove("hide");
            errorDiv2.textContent = `Error: Username field must be filled`;
            event.preventDefault();
        }
        else {
            errorDiv2.classList.add("hide");
            this.confirmNum += 1;
        }
        if (input1.length < this.minPassLength || input1.length > this.maxPassLength) {
            errorDiv.classList.remove("hide");
            errorDiv.textContent = `Error: password must be ${this.minPassLength} to ${this.maxPassLength} characters.`;
            event.preventDefault();
        } else {
            errorDiv.classList.add("hide");
            this.confirmNum += 1;
        }
        if (this.confirmNum >= 4) {
            confirmDiv.classList.remove("hide");
            confirmDiv.textContent = `All fields are valid`;
            event.preventDefault()
            this.confirmNum = 4;
        }
    }
};
document.addEventListener("DOMContentLoaded", () => {
    document.forms.demoform.addEventListener("submit", formHandler);
});