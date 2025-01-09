const arguments = process.argv.slice(2)

function showPrimeNumber(lownNum,highNum){

        for(let i =lownNum;i<=highNum;i++){
            let isPrime = true;
            for(let j = 2; j<=i;j++){
                if(i%j ===0 && j!==i){
                    isPrime=false;
                }
            }
            if(isPrime){
                console.log(i);
            }
        }
    
}

showPrimeNumber(arguments[0]*1,arguments[1]*1)
