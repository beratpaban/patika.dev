const http = require('http');


const server = http.createServer((req,res)=>{
    const url=req.url;
    if(url==='/'){
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write('<h2>INDEX SAYFASINA HOSGELDINIZ!</h2>');
    }else if(url==='/hakkimda'){
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write('<h2>HAKKIMDA SAYFASINA HOSGELDINIZ!</h2>');
    }else if(url==='/iletisim'){
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write('<h2>ILETISIM SAYFASINA HOSGELDINIZ!</h2>');
    }else{
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write('<h2 style="color:red;">Sayfa Bulunamadı!</h2>');
    }
    console.log('İstek geldi');
    res.end();
});

const port = 5001;

server.listen(port,()=>{
    console.log(`Sunucu port ${port}'de başlatıldı!`);
});