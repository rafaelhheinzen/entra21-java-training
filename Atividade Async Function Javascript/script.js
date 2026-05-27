const responseShow = document.getElementById("responseShow")

    //Function buscarCep()
/*   function buscarCep(){
        const cep = document.getElementById("cep")
        const body = document.getElementById("body")


        if(cep.value === "Chuck Norris"){
            body.style.backgroundImage = "url('https://static1.cbrimages.com/wordpress/wp-content/uploads/2019/01/JJ-McQuade-Lone-Wolf-McQuade.jpg')"
        }else{
        fetch(`http://viacep.com.br/ws/${cep.value}/json/`)
        .then(dados => {
            return dados.json()})
        .then(resposta => {
            responseShow.innerHTML = `
            <h2>CEP: ${resposta.cep}</h2>
            <p>Logradouro: ${resposta.logradouro}</p>
            <p>Complemento: ${resposta.complemento}</p>
            <p>Unidade: ${resposta.unidade}</p>
            <p>Bairro: ${resposta.bairro}</p>
            <p>Cidade: ${resposta.localidade}</p>
            <p>Estado: ${resposta.estado}</p>
            <p>UF: ${resposta.uf}<p>
            <p>Região: ${resposta.regiao}</p>
            <p>IBGE: ${resposta.ibge}</p>
            <p>DDD: ${resposta.ddd}<p>
            
            `
        }) 


        }
    }
*/

    
    async function buscarCep() {
        const cep = document.getElementById("cep")
        const body = document.getElementById("body")

        let data = await fetch(`http://viacep.com.br/ws/${cep.value}/json/`)
        let resposta = await data.json()
        console.log(resposta)
        responseShow.innerHTML = `
        <h2>CEP: ${resposta.cep}</h2>
            <p>Logradouro: ${resposta.logradouro}</p>
            <p>Complemento: ${resposta.complemento}</p>
            <p>Unidade: ${resposta.unidade}</p>
            <p>Bairro: ${resposta.bairro}</p>
            <p>Cidade: ${resposta.localidade}</p>
            <p>Estado: ${resposta.estado}</p>
            <p>UF: ${resposta.uf}<p>
            <p>Região: ${resposta.regiao}</p>
            <p>IBGE: ${resposta.ibge}</p>
            <p>DDD: ${resposta.ddd}<p>
            
            `

        const p = document.createElement("p")
        p.innerHTML = "*Eu estou sendo printado depois do resultado da busca do CEP por causa da Async Wait Function!*"
        p.style.fontWeight = "bold"
        responseShow.appendChild(p)
    }
