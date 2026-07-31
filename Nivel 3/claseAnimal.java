//Ejercicio 1: Crear clase Animal.
class Animal{
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    //Ejercicio 3: Agregar método sonido().
    public void sonido(){
        System.out.println("No tiene sonido");
    }
}

//Ejercicio 2: Crear clase Perro que herede.
class Perro extends Animal{
    public Perro(String nombre){
        super(nombre);
    }

    //Ejercicio 4: Sobrescribir método.
    @Override
    public void sonido(){
        System.out.println(nombre + " esta ladrando.");
    }
}

public class claseAnimal {
    public static void main(String[] args){
        //Ejercicio 5: Crear objeto y probar.
        Perro perro1 = new Perro("Benji");
        perro1.sonido();
    }
}
