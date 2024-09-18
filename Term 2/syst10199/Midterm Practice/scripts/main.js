"use strict";

document.addEventListener("DOMContentLoaded", () => {
    /* const art = document.body.querySelector("article");
    const table = document.createElement("table");
    const caption = document.createElement("caption")
    let numRows = prompt("How many rows would you like in the table?");
    caption.textContent = `Table with ${numRows} rows`;
    table.append(caption)
    for(let i = 0; i < numRows; i++) {
        const tr = document.createElement("tr");
        const td = document.createElement("td");
        td.textContent = `Row #${i}`;
        tr.append(td);
        table.append(tr);
    }
    art.after(table) */
    let nav = navMaker();
    document.body.querySelector("h2").after(nav);
})
let navLinks = [
    {
        text: "Sheridan",
        url: "https://sheridancollege.ca"
    },
    {
        text: "SLATE",
        url: "https://slate.sheridancollege.ca"
    },
    {
        text: "Email",
        url: "http://studentmail.sheridancollege.ca/"
    },
    {
        text: "HelpDesk",
        url: "https://sheridancollege.service-now.com/sp"
    }
];
function navMaker() {
    let nav = document.createElement("nav");
    nav.className = "demo-nav";
    navLinks.forEach(link => {
        let a = document.createElement("a");
        a.textContent = link.text;
        a.href = link.url;
        nav.append(a);
    });
    return nav;

    }


class Inventory {
    constructor(id, name , price, quantity, rop) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.rop = rop;
    }
    
    get getStatus() {
        if(this.quantity === 0) {
            return 'OUT OF STOCK';
        }
        else if(this.quantity <= this.rop) {
            return 'LOW';
        }
        else {
            return '';
        }
    }
    toString = () => {
    return `${this.id}: ${this.name} (${this.quantity}) ${this.getStatus}`;
    };

}
let carlos = new Inventory(123, "Carlos", 2.99, 5, 5);

console.log(carlos);
console.log(carlos.id);
console.log(carlos.name);
alert(carlos)