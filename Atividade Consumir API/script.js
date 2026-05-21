const responseShow = document.getElementById("responseShow")

    //Function buscarCep()
    function buscarCep(){
        const cep = document.getElementById("cep")
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
