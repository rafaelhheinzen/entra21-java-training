    const result = document.getElementById("result")
    const sumBtn = document.getElementById("sumBtn")


    //Sum Button function
    sumBtn.addEventListener("click", ()=>{
            let number1 = document.getElementById("number1").value
            let number2 = document.getElementById("number2").value

            n1 = Number(number1)
            n2 = Number(number2)
            add(n1, n2)
    })


    //Sum function
    function add(n1, n2){
        let numberResult = n1 + n2;
        result.innerHTML = numberResult
    }


