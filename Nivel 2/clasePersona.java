//Ejercicio 1: Crear clase Persona con atributos privados.
class Persona{
    private String nombre;
    private int edad;

    //Ejercicio 4: Crear constructor básico.
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Ejercicio 2: Crear getters y setters.
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Ejercicio 3: Validar edad en setter.
    public void setEdad(int edad){
        if(edad >=0){
            this.edad = edad;
        }else{
            System.out.println("La edad no puede ser negativa.");
        }
    }

    //Ejercicio 5: Mostrar datos con método.
    public void verDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
    }
}

public class clasePersona {
    
    public static void main(String[] args){
        Persona person = new Persona(null, 0);
        Persona person1 = new Persona(null, 0);

        person.setNombre("Selvyn");
        person.setEdad(23);
        person.verDatos();
        person1.setNombre("Jimena");
        person.setEdad(-20);
        person1.verDatos();
        
    }
}
