
function circleArea(radius){
    let area = radius*radius* Math.PI;
    console.log(`Dairenin alanı: ${area}`);
}

function circleCircumference(radius){
    let circumference = 2* Math.PI * radius;
    console.log(`Dairenin çevresi: ${circumference}`);
}

module.exports = {
    circleArea,
    circleCircumference,
  };

