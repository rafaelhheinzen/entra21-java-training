    const result = document.getElementById("result")
    const subtractResult = document.getElementById("subtractResult")


    //Sum Button function
    const sumBtn = document.getElementById("sumBtn")
    sumBtn.addEventListener("click", ()=>{
            let number1 = document.getElementById("sumNumber1").value
            let number2 = document.getElementById("sumNumber2").value

            n1 = Number(number1)
            n2 = Number(number2)
            add(n1, n2)
    })


    //Sum function
    function add(n1, n2){
        let numberResult = n1 + n2;
        result.innerHTML = numberResult
    }




    //Subtract Button function
    const subtractBtn = document.getElementById("subtractBtn")
    subtractBtn.addEventListener("click", ()=>{
        let number1 = document.getElementById("subtractNumber1").value
        let number2 = document.getElementById("subtractNumber2").value

        n1 = Number(number1)
        n2 = Number(number2)
        subtract(n1, n2)

    })


    function subtract(n1, n2){
        let numberResult = n1 - n2;
        subtractResult.innerHTML = numberResult
    }
