const assentos = {}
const assentosText = document.querySelector(".assentosText")
const checkout = document.querySelector(".checkout")
let numeroDeAssentos = 150
let cost = 0

for(let i = 1; i < numeroDeAssentos; i++){
    let assento = document.createElement("button")
    assentos[`${i}`] = "Disponível"
    assento.innerText = assentos[`${i}`]
    assento.id = i
    assento.className = "assentoBtn"

    assentosText.appendChild(assento)
    


    const assentoBtn = document.getElementById(i)
    let clicked = false
    assentoBtn.addEventListener("click", ()=>{
        if(clicked == false){
            cost += 10
            assento.innerText = "Indisponível"
            assentoBtn.style.backgroundColor = "red"
            clicked = true
            checkout.innerHTML = `Total: ${cost}$`
        }else if(clicked == true){
            cost -= 10
            assento.innerText = assentos[`${i}`]
            assentoBtn.style.backgroundColor = "green"
            clicked = false
            checkout.innerHTML = `Total: ${cost}$`
        }

    

})

}

console.log(assentos)

