//cargar estatico el mensaje y la llave

var mensaje = "habia una vez un patito que decia miau mia y queria mimir";

var password = "qwertyui"
//parte importante
var cifrado = CryptoJS.AES.encrypt(mensaje, password);

var descifrado = CryptoJS.AES.decrypt(cifrado, password);

document.getElementById("demo0").innerHTML = mensaje;
document.getElementById("demo1").innerHTML = cifrado;
document.getElementById("demo2").innerHTML = descifrado;
document.getElementById("demo3").innerHTML = descifrado.toString(CryptoJS.enc.Utf8);