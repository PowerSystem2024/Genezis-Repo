let x = 10; //Variable de tipo primitiva
console.log(x.lenght);
console.log('Tipos primitivos');
//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'es',
    get lang(){
        return this.idioma.toUpperCase(); //Convierte las minúsculas a mayúsculas
    },  
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ //método o función en JavaScript
        return this.nombre+' '+this.apellido;
    },
    get nombreEdad(){ //Este es el método get
        return 'El nombre es: '+this.nombre+', Edad: '+this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto');
let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'San Martín 375';
persona2.telefono = '54782374678236';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); //Accedemos como si fuera un arreglo
console.log('Usamos el ciclo for in');
//for in y accedemos al objeto como si fuera un arreglo
for (propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error');
persona.apellida = 'Garino'; //Cambiamos dinamicamente un valor del objeto
delete persona.apellida; //Eliminamos el error
console.log(persona);

//Distintas formas de imprimir un objeto
//Número 1: la más sencilla: concatenar cada valor de cada propiedad 
console.log('Distintas formas de imprimir un objeto: forma 1');
console.log(persona.nombre+', '+persona.apellido);

//Número 2: A través del ciclo for in
console.log('Distintas formas de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Número 3: La función Object.values()
console.log('Distintas formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: Utilizaremos el método JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamos a utilizar el método get');
console.log(persona.nombreEdad);

console.log('Comenzamos con el método get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){ //constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}
let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com');
padre.nombre = 'Luis'; //modificamos el nombre
padre.telefono = '54261798643987';
console.log(padre);
console.log(padre.nombreCompleto()); //Utilizamos la función
let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono); //la propiedad no esta definida
console.log(madre.nombreCompleto());


//Diferentes formas de crear un objeto

//caso objeto 1
let miObjeto = new Object(); //Esta es una opción formal
//caso objeto 2
let miObjeto2 = {}; //Esta opción es breve y recomendada

//caso String 1
let miCadena1 = new String('Hola'); //Sintaxis formal
//caso String 2
let miCadena2 = 'Hola'; //Esta es la sintaxis simplificada y recomendada

//caso con números 1
let miNúmero = new Number(1); //Es formal no recomendada
let miNúmero2 = 1; //Sintaxis recomendada

//caso boolean 1
let miBoolean1 = new Boolean(false); //Formal
//caso boolean 2
let miBoolean2 = false; //Sintaxis recomendada

//caso Arreglos 1
let miArreglo1 = new Array(); //Formal
//caso Arreglos 2
let miArreglo2 = []; //Sintaxis recomendada

//caso function 1
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto
//caso function 2
let miFuncion2 = function(){}; //Notación simplificada y recomendada

//Uso de prototype
Persona3.prototype.telefono = '2618383832'
console.log(padre);
console.log(madre.telefono);
madre.telefono = '542618383832';
console.log(madre.telefono);

//Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', 542618383834));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '542618585856'));

//Método Apply
let arreglo = ['Ing.', '542618686865'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));












