//Ejercicio 16: Crear clase Estudiante.
class Estudiante{
    private String nombre;
    //Ejercicio 17: Agregar notas privadas.
    private double[] notas;

    public Estudiante(String nombre, double[] notas){
        this.nombre = nombre;

        if(notas != null){
            for(int i = 0; i< notas.length; i++){
                if(notas[i] < 0 || notas[i] > 100){
                    System.out.println("Las notas solo pueden ser entre 0 y 100");
                    notas[i] = 0.0;
                    this.notas = notas;
                }
            }
        }
        this.notas = notas;
    }

    //Ejercicio 20: Validar notas entre 0 y 100.
    public void setNotas(double[] notas){
        if(notas != null){
            for(int i = 0; i< notas.length; i++){
                if(notas[i] < 0 || notas[i] > 100){
                    System.out.println("Las notas solo pueden ser entre 0 y 100");
                    notas[i] = 0.0;
                    this.notas = notas;
                }
            }
        }
        this.notas = notas;
    }

    //Ejercicio 18: Calcular promedio.
    public void calcularPromedio(){
        double suma = 0;
        for(int i = 0; i< notas.length; i++){
            suma = notas[i]+suma;
        }
        double promedio = suma / notas.length;
        //Ejercicio 19: Mostrar resultado.
        System.out.println("El promedio del estudiante "+nombre+" es de: "+promedio);
    }

    public void getNotas(){
        for(int i=0; i< notas.length;i++){
            System.out.println("Nota no. "+(i+1)+": "+notas[i]);
        }
    }

    public void mostrarEstudiante(){
        System.out.println("Nombre: "+ nombre);
        getNotas();
    }
}

public class claseEstudiante {
    public static void main(String[] args){

        double[] notas1 = {67, 89, 100, 89};
        Estudiante est = new Estudiante("Selvyn", notas1);
        est.mostrarEstudiante();
        est.calcularPromedio();

        double[] notas2 = {0, 67, 11, 99};
        Estudiante est2 = new Estudiante("Jimena", notas2);
        est2.mostrarEstudiante();
        est2.calcularPromedio();
    }
}
