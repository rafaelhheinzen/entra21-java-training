let isLogged = false;

const loginBtn = document.getElementById("loginBtn");
const adminMessage = document.getElementById("adminMessage");

function checkLogin(){
if(isLogged === true){
    adminMessage.innerHTML = "Welcome admin!"
}else{
    alert("Not logged in!")
}
}

loginBtn.addEventListener("click", function () {
    const name = document.getElementById("name").value;
    const password = document.getElementById("password").value;

    if (name === "rafael" && password === "rafael123") {
        isLogged = true;
        window.location = "index.html"
        checkLogin()

    } else {

        isLogged = false;
            checkLogin()
    }
});