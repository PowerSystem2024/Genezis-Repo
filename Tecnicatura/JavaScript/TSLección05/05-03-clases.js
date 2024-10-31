//let persona3 = new Persona('Carla', 'Ponce'); esto no se debe hacer: Persona is not defined

class Persona{ //Clase padre

    static contadorPersona = 0; //Atributo estático
    //email = 'Valor default email'; //Atributo no estático

    static get MAX_OBJ(){ //Este método simula una constante
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersona < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersona;
        }
        else{
            console.log('Se ha alcanzado el máximo de objetos de la clase Persona');
        }
        //console.log('Se incrementa el contador: ' +Persona.contadorObjetosPersona);
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    
    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this.idPersona+' '+this._nombre+' '+this._apellido;
    }
    //Sobreescribiendo el método de la clase padre (Object)
    toString(){ //Regresa un String
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecución
        //El método que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log('Hola desde este método static');
    }

    static saludar2(persona){
        console.log(persona.nombre+' '+persona.apellido);
    }
}
class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }

    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+', '+this._departamento;
    }
}

let persona1 = new Persona('Martín', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
persona1.apellido = 'Gonzalez Pereira';
console.log(persona1.apellido); 
//console.log(persona1);
let persona2 = new Persona('Jose', 'Gimenez');
console.log(persona2._nombre);
persona2.nombre = 'María Laura';
console.log(persona2.nombre);
persona2.apellido = 'Sumaran Martinez';
console.log(persona2.apellido);
//console.log(persona2);

let empleado1 = new Empleado('María', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//Object.prototype.toString Esta es la manera de acceder a atributos y métodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); no se utiliza desde elobjeto
Persona.saludar();

Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); No se puede acceder a atributos de clases no instanciadas
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersona)
let persona3 = new Persona('Carla', 'Ponce');
console.log(persona3.toString());
console.log(Persona.contadorPersona)

console.log(Persona.MAX_OBJ);
//Persona.MAX_OBJ = 10; No se puede modificar, ni alterar
console.log(Persona.MAX_OBJ);

let persona4 = new Persona('Bruno', 'Diaz');
console.log(persona4.toString());
let persona5 = new Persona('Samuel', 'De Luque');
console.log(persona5.toString());
