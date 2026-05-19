const submitBtn = document.getElementById("submitBtn")
const show = document.getElementById("show")

function storeData(){


    // Pega o valor dos inputs
    const nome = document.getElementById("nomeField").value
    const email = document.getElementById("emailField").value

    // Verifica se um dos campos está vazio
    if(!nome || !email){
        alert("Você tem que adicionar valores!")
        return;
    }

    // Cria um objeto chamado user com propriedades: nome e email
    const user = {
        nome,
        email
    }

    // Pega usuários existentes *utiliza-se JSON.parse pois o localStorage por padrão não consegue ler estrutura de objetos em JSON
    let users = JSON.parse(localStorage.getItem("users")) || [];

    // Adiciona novo usuário a array "users"
    users.push(user)

    // Salva array atualizado, transformando users em string
    localStorage.setItem("users", JSON.stringify(users));

    // Renderiza tela de usuários toda vez que um é adicionado
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
    let userNumber = 0

    // Limpa a tela antes de renderizar usuários
    show.innerHTML = "";

    // Pega a array
    const users = JSON.parse(localStorage.getItem("users")) || [];

    // Para cada usuário fará o que está dentro desse escopo
    users.forEach((user, index) =>{
        const div = document.createElement("div")
        div.id = "userDiv"

        // Soma 1 a variável userNumber para cada usuário
        userNumber++

        div.innerHTML = `
        <p>${userNumber} | Nome: ${user.nome} | Email: ${user.email}</p> <button id="button" onClick="deleteUser(${index})">X</button>
        `
        show.appendChild(div)
    });
}

// Botão submit para registrar clientes
if(submitBtn){
submitBtn.addEventListener("click", storeData);
}


//Renderiza tela de usuários ao abrir
renderData();

