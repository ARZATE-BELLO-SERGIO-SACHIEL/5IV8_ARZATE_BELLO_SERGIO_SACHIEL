const conexion = require('../db/db')

exports.save=(req,res)=>{
    const nombre = req.body.nombre;
    const appat = req.body.appat;
    const apmat = req.body.apmat;
    console.log(nombre+" - "+edad+" - "+raza);

    conexion.query('INSERT INTO musu SET ?',{nombre:nombre, edad:appat, raza_idraza:apmat}, (error, results)=>{
        if(error){
            console.log(error);
        }else{
            res.redirect('/');
        }
    })

}

exports.update=(req,res)=>{
    const id=req.body.id;
    const nombre = req.body.nombre;
    const appat = req.body.appat;
    const apmat = req.body.apmat;
    conexion.query('UPDATE perro SET ? WHERE idusu= ?', [{nombre:nombre, edad:appat, raza_idraza:apmat}, id], (error,results)=>{
        if(error){
            console.log(error);
        }else{
            res.redirect('/');
        }
    })
}