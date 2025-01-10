const fs = require("fs");

// dosya okuma işlemi
// fs.readFile("password.txt","utf8",(err,data)=>{
//     if(err) console.error(err)
//     console.log("Okundu"); 
// });

// dosya yazma işlemi .txt
fs.writeFile("example.txt","KODLUYORUZZZ","utf8",(err)=>{
    if(err) console.error(err);
    console.log("Dosya Başarılı bir şekilde oluşturuldu");
});

// dosya yazma işlemi .json
fs.writeFile("data.json","{'name' : 'berat', 'age' : 24 }","utf8",(err)=>{
    if(err) console.error(err);
    console.log("Dosya Başarılı bir şekilde oluşturuldu");
});

//dosyaya veri ekleme işlemi
fs.appendFile("example.txt","\nyeni satır",'utf8',(err,data)=>{
    if(err) console.error(err);
    console.log('Veri dosyaya başarılı bi şekilde eklendi');
});

//dosya silme işlemi
// fs.unlink('data.json',(err)=>{
//     console.error(err);
//     console.log('Dosya silindi!');
// });

//klasör oluşturma
// fs.mkdir('uploads/img',{recursive:true},(err)=>{
//     if(err) console.error(err);
//     console.log('klasörler oluşturuldu');
// });

//klasör silmek
fs.rm('uploads/',{recursive:true},(err)=>{
    if(err) console.error(err);
    console.log('klasörler silindi')
})