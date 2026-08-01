import java.util.ArrayList;

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

//Ejercicio 6: Crear clase Gato que herede de Animal.
class Gato extends Animal{
    public Gato(String nombre){
        super(nombre);
    }

    //Ejercicio 7: Sobrescribir método sonido().
    @Override
    public void sonido(){
        System.out.println(nombre+" esta maullando");
    }
}

public class claseAnimal {
    public static void main(String[] args){
        //Ejercicio 5: Crear objeto y probar.
        Perro perro1 = new Perro("Benji");
        perro1.sonido();

        Gato gato1 = new Gato("Rufus");
        gato1.sonido();

        //Ejercicio 8: Crear lista de animales.
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Bobby"));
        animales.add(new Gato("Tammy"));
        animales.add(new Perro("Toby"));
        animales.add(new Gato("Milo"));

        //Ejercicio 9: Recorrer lista y ejecutar métodos.
        for(Animal a : animales){
            //Ejercicio 10: Ejecutar un mismo método en distintos objetos.
            a.sonido();
        }
    }
}
