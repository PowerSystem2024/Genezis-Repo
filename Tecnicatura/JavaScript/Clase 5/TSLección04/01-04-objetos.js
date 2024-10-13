let x = 10: //Variable de tipo primitiva
console.log(x.length); undefined
console.log('Tipos primitivos');
//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma:'ES',
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ //metodo o funcion en JavaScript
        return this.nombre+ ' '+this.apellido;
    },
    get nombreEdad(){ //Este es el metodo get
        return this.nombre+', Edad: '+ this.edad;
    }
    

console.log(persona.nombre); Carlos
console.log(persona.apellido); Gil
console.log(persona.email); cgil@gmail.com
console.log(persona.edad); 30
console.log(persona); ... ', apellido: 'Gil, email: 'cgil@gmail.com', edad 30
console.log(persona.nombreCompleto()); Carlos Gil
console.log('Ejecutando con un objeto');
let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5492618282821';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); Gil //Accedemos como si fuera un arreglo
console.log('usamos el ciclo for in');
//for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad); 
    console.log(persona[propiedad]); 
}
console.log('cambiamos y eliminamos un error');
persona.apellida = 'Betancud'; //Cambiamos un valor del objeto
delete persona.apellida; //Eliminamos un error
console.log(persona); ..', apellido; 'Gil', email 'cgil@gmail.com', edad; 30'

//Distintas formas de imprimir un objeto
//Numero 1: la mas sencilla: concatenar cada valor de cada propiedad
console.log('Distinta formas de imprimir un objeto: forma 1');
console.log(persona.nombre+', '+persona.apellido); Carlos, Gil

//Numero 2: Atraves del ciclo for in
console.log('Distinta formas de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]); 
}

//numero 3: La funcion Object.values()
console.log('Distinta formas de imprimir un objeto: forma 3'); 
let personaArray = object.values(persona);
console.log(personaArray); [ 'Carlos', 'Gil', 'cgil@gmail.com', 30]

//Numero 4: Utilizaremos el metodo JSON.stringify
console.log('Distinta formas de imprimir un objeto: forma 4'); 
let personaString = JSON.stringify(persona);
console.log(personaString); {"nombre":"Carlos","apellido":"Gil","email":"cgil@gmail.com"}

console.log('Comenzamos a utilizar el metodo get');  
console.log(persona,nombreEdad);

console.log('Comenzamos con el metodo get y set para idiomas'); 
persona.lang = 'en';
console.log(persona.lang); EN

function Persona3(nombre, apellido, email){ //Contructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}
let padre = new Persona3 ('Leo', 'Lopez', 'lopezl@gmail.com');
padre.nombre = 'Luis';
padre.telefono = '5492618282821';
console.log(padre);
console.log(padre.nombreCompleto()); //Utilizamos la funcion
let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono); //la propiedad no esta definida
console.log(madre.nombreCompleto());

//Diferentes formas de crear un objeto

//caso numero 1
let miObjeto =new Object(); //Esta una opcion forma1
//caso numero 2
let miObjeto2={}; //Esta opcion es breve y recomendada

//caso string 1
let miCadena1 = new String ('Hola'); //Sintaxis formal
//caso string 2
let miCadena2 = 'Hola'; //Esta es la sintaxis simplificada y recomendada

//caso con numeros 1
let miNumero = new Number(1); //Es formal no recomendable
//caso con numeros 2
let miNumero2 = 1; //Sintaxis recomendada

//caso boolean 1
let miBoolean =new Boolean(false); //Forma1
//caso boolean 2
let miBoolean2 =false; //Sintaxis recomendada

//caso arreglos 1
let miArreglo1 = new array(); //forma1
//caso arreglos 2
let miArreglo2 = []; //Sintaxis recomendada

//caso function 1
let miFuncion1 = new function(){}; //Todo despues del new es considerado objeto
//caso function 2
let miFuncion2 = function(){}; //Notacion simplificada y recomendada

//Uso de prototype
Persona3.prototype.telefono = '2618383832';
console.log (padre);
console.log(madre.telefono);
madre.telefono = '5492618383832';
console.log(madre.telefono); 

//Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+ ' '+this.apellido;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic. ', '5458877213986'));
console.log(persona4.nombreCompleto2.call(persona5. 'Ing.', '54782169873' ));

//Metodo Apply
let arreglo = ['Ing. ', '5458877213986']
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));