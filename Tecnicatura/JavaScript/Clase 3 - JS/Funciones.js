miFuncion(5,4);

let resultado = miFuncion(6,7);
console.log(resultado);

// Declaramos una función de tipo expresión o anonima
let x = function(a,b){return a + b};
resultado = x(5, 6);
console. log (resultado);

(function(a,b){
    console.log('Ejecutar la funcion: '+(a+b));
})(9,6);

console.log(typeof miFuncion);

function miFuncionDos(a,b){
    console.log(arguments.length);
}

miFuncionDos (5,7,3,6);

var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

//funcion flecaha
const summarFuncionFlecha = (a,b) => a + b;
resultado = summarFuncionFlecha(3,7);
console.log(resultado);

let sumar = function(a=4,b=8){
    console.log(arguments[0]);
    console.log(arguments[1]);
    return a + b + arguments[2];
}

resultado=sumar(3,2,9);
console.log(resultado);

//sumar agrumentos
let respuesta = sumarTodo (5,4,13,10,9)
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i];
    }
    return suma;
}

//tipos primitivos
let k = 10;
function cambiarValor(a){
    a = 20;
}

cambiarValor(k);
console.log(k);

//paso por referencias
const persona = {
    nombre: 'leonel',
    apellido: 'gaturro'
}

console.log(persona);
function cambiarValorObjeto(p1){
    p1.nombre = 'michelo';
    p1.apellido = 'gedardo';
}

cambiarValorObjeto(persona);
console.log(persona);