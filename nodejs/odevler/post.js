const cars = [
    {brand: 'BMW', model:'3.20i',year:'2024'},
    {brand: 'Mercedes', model:'CLA',year: 'UNKNOWN'},
    {brand: 'Audi', model:'A5',year:'2023'}
];

const listCars=()=>{
    cars.map((car)=>{
        console.log(`Car brand: ${car.brand} and model: ${car.model}`);
    });
};

const addCar=(newCar)=>{

   const promise= new Promise((resolve,reject)=>{
    if(newCar){
        cars.push(newCar);
        resolve(cars);
    }
    else{
        reject('Ekelem hatası!')
    }
   
   });
   return promise
}

async function showAllCars(){
   try{
    await addCar( {brand: 'Porsche', model:'911 GT3 RS',year:'2023'});
    listCars();
   }catch(err){
    console.error(err);
   }
}

showAllCars();