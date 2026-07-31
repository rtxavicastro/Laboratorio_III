import java.util.Scanner;

//Ejercicio 6: Crear clase Cuenta con saldo privado.
class Cuenta{
    private double saldo;

    public Cuenta(double saldo){
        this.saldo = saldo;
    }

    //Ejercicio 9: Evitar saldo negativo.
    public void setSaldo(double saldo){
        if(saldo < 0){
            System.out.println("No se puede ingresar un saldo negativo.");
        }else{
            this.saldo = saldo;
        }
    }

    //Ejercicio 7: Crear método depositar.
    public void depositar(double monto){
        if(monto < 0){
            System.out.println("No puede depositar un monto negativo.");
        }else{
            saldo = saldo + monto;
        }
    }

    //Ejercicio 8: Crear método retirar con validación.
    public void retirar(double monto){
        if(monto > saldo){
            System.out.println("No puede retirar un monto mayor al saldo actual.");
        }else if(monto < 0){
            System.out.println("No puede retirar un monto negativo");
        }else{
            saldo = saldo - monto;
        }
    }

    //Ejercicio 10: Mostrar saldo.
    public void mostrarSaldo(){
        System.out.println("Saldo actual: "+saldo);
    }
}
public class claseCuenta {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(0);

        System.out.print("Ingrese el saldo inicial: ");
        double saldo = entrada.nextDouble();
        cuenta.setSaldo(saldo);
        cuenta.mostrarSaldo();

        System.out.print("Ingrese el monto a depositar: ");
        double monto = entrada.nextDouble();
        cuenta.depositar(monto);
        cuenta.mostrarSaldo();

        System.out.print("Ingrese el monto a retirar: ");
        monto = entrada.nextDouble();
        cuenta.retirar(monto);
        cuenta.mostrarSaldo();
    }
}
