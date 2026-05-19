let isLogged = false;

const loginBtn = document.getElementById("loginBtn");
const adminMessage = document.getElementById("adminMessage");

loginBtn.addEventListener("click", function () {
    const name = document.getElementById("name").value;
    const password = document.getElementById("password").value;

    if (name === "rafaellindo" && password === "rafael123") {
        alert("logado!");
        isLogged = true;
        window.location = "index.html"
        if(isLogged === true){
            adminMessage.innerHTML = "Welcome admin!"
        }
    } else {
        alert("false");
        isLogged = false;
    }
});