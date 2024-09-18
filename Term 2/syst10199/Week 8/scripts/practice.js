document.addEventListener("DOMContentLoaded", () => {
    let form = document.querySelector("#form");
    let div = document.querySelector("form div:first-of-type");
    form.onclick = function(event) {
        event.target.style.backgroundColor = 'yellow';
      
        // chrome needs some time to paint yellow
        setTimeout(() => {
          alert("target = " + event.target.tagName + ", this=" + this.tagName);
          event.target.style.backgroundColor = ''
        }, 0);
    div.onclick = function (event) {
        console.log(event.target.tagName+" div")
    }
      };
});
