import axios from 'axios';

// Verileri çekmek için asenkron bir fonksiyon oluşturuyoruz.
async function getData(userId) {
    try {
        // Kullanıcı verilerini çekiyoruz
        const userResponse = await axios.get(`https://jsonplaceholder.typicode.com/users/${userId}`);
        const userData = userResponse.data;

        // Kullanıcının post'larını çekiyoruz
        const postsResponse = await axios.get(`https://jsonplaceholder.typicode.com/posts?userId=${userId}`);
        const userPosts = postsResponse.data;

        // Kullanıcı verileri ve post'ları birleştirerek istenen objeyi oluşturuyoruz
        const result = {
            id: userData.id,
            name: userData.name,
            username: userData.username,
            email: userData.email,
            address: userData.address,
            phone: userData.phone,
            website: userData.website,
            company: userData.company,
            posts: userPosts
        };

        return result;
    } catch (error) {
        console.error("Veri alınamadı:", error);
        return null;
    }
}

// Fonksiyonu kullanarak veriyi çekiyoruz
getData(1)
    .then(data => {
        if (data) {
            console.log(data);
        }
    });
