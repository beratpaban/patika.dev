const fs = require('fs');

//dosya yazma
fs.writeFile('employees.json','{"name": "Employee 1 Name", "salary": 2000}','utf8',(err)=>{
    if(err) console.error(err);
    console.log('Dosya başarılı bir şekilde oluşturuldu!');
});

//dosya okuma
fs.readFile('employees.json','utf8',(err,data)=>{
    if(err) console.error(err);
    console.log("employees.json:",data);

});

//dosya güncelleme
fs.appendFile('employees.json','{"name": "Employee 2 Name", "salary": 2500}','utf8',(err)=>{
    if(err) console.error(err);
    console.log('Veri Başarılı bir şekilde eklendi');
});

//dosya silme
fs.unlink('employees.json',(err)=>{
    console.error(err);
    console.log('Dosya başarıyla silindi!');
});