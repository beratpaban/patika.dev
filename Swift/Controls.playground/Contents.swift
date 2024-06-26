var password = "123456"

if password == "123456"{
    print("Şifre doğru, hoşgeldiniz")
}else{
    print("Şifre yanlış, tekrar deneyiniz")
}

enum PasswordOption{
    case zayif
    case dogru
    case uyusmuyor
}

var passwordTwo: PasswordOption = .dogru

switch password {
case "123":
    print("Şifreniz çok zayıf, şifrenizi değiştirin!")
case "12346":
    print("Şifreniz yeterince iyi")
default:
    print("Şifreler uyuşmuyor")
}


switch passwordTwo {
case .zayif:
    print("Şifreniz çok zayıf, şifrenizi değiştirin!")
case .dogru:
    print("Şifreniz yeterince iyi")
case .uyusmuyor:
    print("Şifreler uyuşmuyor")
}

