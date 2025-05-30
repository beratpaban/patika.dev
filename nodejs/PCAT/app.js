const express = require('express');
const mongoose = require('mongoose');
const fileUpload = require('express-fileupload');
const methodOverride = require('method-override');

const photoController = require('./controllers/photoControllers');
const pageController = require('./controllers/pageControllers');

const app = express();

//connect db
mongoose.connect('mongodb://localhost/pcat-test-db', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

app.set('view engine', 'ejs');
const port = 3000;

//middleware
app.use(express.static('public'));
app.use(express.urlencoded({ extended: true }));
app.use(express.json());
app.use(fileUpload());
app.use(
  methodOverride('_method', {
    methods: ['POST', 'GET'],
  })
);

app.get('/', photoController.getAllPhotos);
app.get('/photos/:id', photoController.getPhoto);
app.post('/photos', photoController.createPhoto);
app.put('/photos/:id', photoController.updatePhoto);
app.delete('/photos/:id', photoController.deletePhoto);

app.get('/photos/edit/:id', pageController.getEditPage);
app.get('/about', pageController.getAboutPage);
app.get('/add', pageController.getAddPage);

app.listen(port, (req, res) => {
  console.log(`Sunucu ${port} portunda başlatıldı.`);
});
