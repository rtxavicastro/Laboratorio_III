import java.util.ArrayList;

public class claseFigura{

    public static void main(String[] args){
        ArrayList<Figura> figuras = new ArrayList<>();

        //Ejercicio 16: Usar varias figuras en lista.
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(8));
        figuras.add(new Cuadrado(3));
        figuras.add(new Circulo(2));

        //Ejercicio 17: Calcular áreas con polimorfismo.
        for(int i = 0; i< figuras.size(); i++){
            Figura fig = figuras.get(i);
            fig.area();
            System.out.println("EL area es: "+fig.area());
        }
    }
}