//Ejercicio 13: Crear clase Cuadrado.
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    //Ejercicio 14: Implementar método área.
    @Override
    public double area(){
        return lado * lado;
    }
}
