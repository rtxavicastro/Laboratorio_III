//ejercicio 21: Crear clase Empleado.
class Empleado{
    private String nombre;
    //Ejercicio 22: Encapsular salario.
    private double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        setSalario(salario);
    }

    //Ejercicio 23: Validar salario positivo.
    public void setSalario(double salario){
        if(salario < 0){
            System.out.println("El salario no puede ser negativo.");
            this.salario = 0.0;
        }else{
            this.salario = salario;
        }
    }

    //Ejercicio 24: Mostrar datos.
    public void mostrarDatos(){
        System.out.println("Nombre de empleado: "+nombre);
        System.out.println("Salario: "+salario);
    }
}

public class claseEmpleado{
    public static void main(String[] args){

        //Ejercicio 25: Crear varios objetos.
        Empleado emp = new Empleado("Xavier", 5250);
        emp.mostrarDatos();

        Empleado emp2 = new Empleado("Maria", -2332);
        emp2.mostrarDatos();

        Empleado emp3 = new Empleado("Jimena", 9000);
        emp3.mostrarDatos();
    }
}