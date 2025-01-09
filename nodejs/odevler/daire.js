const arguments = process.argv.slice(2);
const pi = 3.14;
let area=1;
function calculateArea(radius){
    area = pi*radius*radius
    console.log(`Yarıçapı ${radius} olan dairenin alanı: ${area}`)
}

calculateArea(arguments[0]*1)