function User(props){
    return( 
    <h1>
        {
        props.isLoggedIn
        ? `${props.name} ${props.surname} Hoşgeldiniz!`
        : "Giriş Yapmadınız"
        }
        {
            props.friends.map((friend)=> <div>{friend}</div>)
        }
    </h1>
    );
}
export default User;