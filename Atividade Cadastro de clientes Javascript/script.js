const submitBtn = document.getElementById("submitBtn")
const show = document.getElementById("show")
const body = document.getElementById("body")


function storeData(event){

const showP = document.getElementById("showP")

// Pega usuários existentes
let users = JSON.parse(localStorage.getItem("users")) || [];

// Número automático
const numero = users.length + 1;

// Pega o valor dos inputs
const nome = document.getElementById("nomeField").value
const email = document.getElementById("emailField").value

// Verifica se um dos campos está vazio
if(!nome){
    return;
}else if(!email){
    return;
}else{
    event.preventDefault()

    const p = document.createElement("p")

    p.innerHTML = "<p>Usuário criado com sucesso!</p>"

    p.id = "feedbackMessage"

    showP.appendChild(p)

    setTimeout(() => p.style.display = "none", 1000)
}

// Cria objeto user
const user = {
    numero,
    nome,
    email
}

// Adiciona usuário
users.push(user)

// Salva
localStorage.setItem("users", JSON.stringify(users));

// Renderiza
renderData();

}

function deleteUser(index){
    let users = JSON.parse(localStorage.getItem("users")) || [];
    users.splice(index, 1)
    localStorage.setItem("users", JSON.stringify(users));
    renderData();
}

function renderData(){
    // Verifica se o elemento "show" esta presente na página, se não interrompe o código
    if(!show) return;

    //Define a variável que representará o número do usuário

    // Limpa a tela antes de renderizar usuários
    show.innerHTML = "";


    // Pega a array
    const users = JSON.parse(localStorage.getItem("users")) || [];

    // Para cada usuário fará o que está dentro desse escopo
    users.forEach((user, index) =>{
        const div = document.createElement("div")
        div.id = "userDiv"

        // Soma 1 a variável userNumber para cada usuário
        if(user.nome === "Andrew Garfield"){
        div.innerHTML = `
        <div class="userContainer">
        <p>${user.numero} | Nome: <span  onclick="andrew()" style="color: red">${user.nome}</span> | Email: ${user.email}</p> <button id="button" onClick="deleteUser(${index})">X</button>
        </div>
        `
        }else{
        div.innerHTML = `
        <div class="userContainer">
        <p>${user.numero} | Nome: ${user.nome} | Email: ${user.email}</p> <button id="button" onClick="deleteUser(${index})">X</button>
        </div>
        `
        }

        show.appendChild(div)
    });
}

// Botão submit para registrar clientes
if(submitBtn){
submitBtn.addEventListener("click", storeData);
}


function andrew(){
body.style.backgroundImage = 'url("https://wallpapercave.com/wp/wp9974212.jpg")';
}

//Renderiza tela de usuários ao abrir
renderData();

