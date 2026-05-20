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
        <div id="viewDiv-${index}" class="userContainer">
        <p>${user.numero} | Nome: <span  onclick="andrew()" style="color: red">${user.nome}</span> | Email: ${user.email}</p><button onClick="showEditDiv(${index})">Editar</button><button id="button" onClick="deleteUser(${index})">X</button>
        </div>

        <div id="editDiv-${index}" class="userContainer">
        <input type="text" value="${user.numero}">
        <input type="text" id="editNome-${index}" value="${user.nome}">
        <input type="text" id="editEmail-${index}" value="${user.email}">
        <button onClick="saveEdit(${index})">Salvar</button>
        <button onClick="cancelEdit(${index})">Cancelar</button>
        </div>
        `
        }else{
        div.innerHTML = `
        <div id="viewDiv-${index}" class="userContainer">
        <p>${user.numero} | Nome: ${user.nome} | Email: ${user.email}</p><button onClick="showEditDiv(${index})">Editar</button><button id="button" onClick="deleteUser(${index})">X</button>
        </div>

        <div id="editDiv-${index}" class="userContainer" style="display:none;">
        <input type="text" value="${user.numero}">
        <input type="text" id="editNome-${index}" value="${user.nome}">
        <input type="text" id="editEmail-${index}" value="${user.email}">
        <button onClick="saveEdit(${index})">Salvar</button>
        <button onClick="cancelEdit(${index})">Cancelar</button>
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


function showEditDiv(index){
    const viewDiv = document.getElementById(`viewDiv-${index}`)
    viewDiv.style.display = "none";

    const editDiv = document.getElementById(`editDiv-${index}`)
    editDiv.style.display = "block";
}

function saveEdit(index){
    let users = JSON.parse(localStorage.getItem("users")) || [];

    // Captura os valores dos inputs específicos desta linha
    const novoNome = document.getElementById(`editNome-${index}`).value;
    const novoEmail = document.getElementById(`editEmail-${index}`).value;

    // Validação simples
    if (!novoNome || !novoEmail) {
        alert("Por favor, preencha todos os campos.");
        return;
    }


    users[index].nome = novoNome
    users[index].email = novoEmail

    localStorage.setItem("users", JSON.stringify(users));

    renderData();
}

function cancelEdit(index){
    document.getElementById(`viewDiv-${index}`).style.display = "block";
    document.getElementById(`editDiv-${index}`).style.display = "none";
}
