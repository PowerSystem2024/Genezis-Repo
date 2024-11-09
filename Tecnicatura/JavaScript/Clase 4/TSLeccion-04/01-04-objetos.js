let x = 10; // variable de tipo primitiva
console.log(x.length);

//Objeto
let persona = {
    nombre: 'Marcos',
    apellido: 'Rodriguez',
    edad: 27,
    nombreCompleto: function(){ // método o función en Javascript
        return this.nombre+' '+this.apellido;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.edad);
console.log(persona);

console.log(persona.nombreCompleto());

let persona2 = new Object();
persona2.nombre = 'Lionel';
persona2.apellido = 'Messi';
persona2.direccion = 'Miami 123';

console.log(persona2.direccion)

console.log(persona['apellido']);

for(atributo in persona){
    console.log(atributo);
    console.log(persona[atributo]);
}

persona.apellido = 'Palermo' // Cambiar dinamicamente un valor del objeto
console.log(persona)

//Distintas formas de imprimir un objeto

// 1: Contatenar cada valor de cada propiedad
console.log('Formas de imprimir un objeto por pantalla:');
console.log("Forma 1: Concatenación")
console.log(persona2.nombre+' '+persona2.apellido);

// 2: A traves del ciclo for in
console.log("Forma 2: Ciclo for in")
for(propiedad in persona2){
    console.log(persona2[propiedad]);
}

// 3: La función Object.values()
console.log("Forma 3: Función Object.values()")
let personaArray = Object.values(persona2);
console.log(personaArray)

// 4: Método JSON.Stringify
console.log("Forma 4: Método JSON.Stringify()")
let personaString = JSON.stringify(persona2);
console.log(personaString);







