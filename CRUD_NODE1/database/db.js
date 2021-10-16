const mysql = require('mysql');

const conexion = mysql.createConnection({
  host: "fanny.db.elephantsql.com",
  user: "gnbnwebm",
  password: "fwM0yOElgpKvEw_wzdN7tLUri3k8SrQj",
  database: "gnbnwebm",
  port: 5432
})

conexion.connect((error)=>{
    if(error){
        console.error('El error de conexión es: '+error);
        return
    }
    console.log('Conexión exitosa');
})

module.exports = conexion;
