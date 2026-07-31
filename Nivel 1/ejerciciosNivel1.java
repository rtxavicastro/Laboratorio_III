import java.util.InputMismatchException;
import java.util.Scanner;

public class ejerciciosNivel1{

    public static void validacionNum(){
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.print("Ingrese un numero: ");
            int num = entrada.nextInt();
            if(num < 0){
                throw new IllegalArgumentException("Error: El numero ingresado es negativo.");
            }
        }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            //Ejercicio 8: Manejar excepción en método.
            System.out.println("Error: Debe ingresar un valor numerico.");
        }
    }

    //Ejercicio 14: Crear excepción personalizada simple.
    public static class EsNegativo extends RuntimeException{
        public EsNegativo(String mensaje){
            super(mensaje);
        }
    }

    public static int DivisionSegura(int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre cero.");
            return 0;
        }
    }

    public static void MayorQueCien(int num){
        if(num <= 100){
            throw new IllegalArgumentException("El numero "+num+" debe de ser mayor a 100");
        }
        System.out.println("El numero "+num+" es mayor a 100");
    }

    public static String crearEmail(Scanner entrada){
        System.out.print("Ingrese su email: ");
        return entrada.nextLine();
    }

    //Ejercicio 21: Crear método que valide email simple.
    public static void validEmail(String email){
        if(email == null || !email.contains("@") || !email.contains(".")){
            throw new IllegalArgumentException("Formato de email no valido.0");
        }
        System.out.println("Email guardado correctamente: "+email);
    }

    //Ejercicio 22: Validar longitud de texto con excepción.
    public static void lengthEmail(String email){
        if(email == null || email.trim().length() < 5){
            throw new IllegalArgumentException("Email es muy corto (minimo de caracteres: 5)");
        }
        System.out.println("Email validado correctamente: "+email);
    }

    //Ejercicio 23: Controlar error en entrada de usuario.
    public static int leerOpcion(Scanner entrada){
        //Ejercicio 24: Reintentar lectura si ocurre error.
        while(true){
            try{
                System.out.print("Escriba la opcion a elegir: ");
                return entrada.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Debe de ingresar una opcion valida.");
                entrada.nextLine();
            }
        }
    }

    public static void main(String[] args) throws Exception{
        //Ejercicio 1: Capturar excepción al dividir entre cero.
        try{
            int div = 100/0;
        }catch(ArithmeticException e){
            System.out.println("Error: un numero no puede ser dividido entre cero.");
        }

        //Ejercicio 2: Validar entrada numérica con try-catch.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        String numero = entrada.nextLine();
        try{
            int num = Integer.parseInt(numero);
        }catch(NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
        }

        //Ejercicio 3: Manejar error al convertir texto a número.
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextLine();
        try{
            int num = Integer.parseInt(numero);
        }catch(NumberFormatException e){
            //Ejercicio 4: Mostrar mensaje personalizado en excepción.
            System.out.println("Error: El valor ingresado no es un numero entero.");
        }finally{
            //Ejercicio 5: Usar finally para mostrar mensaje final.
            System.out.println("Fin del programa...");
        }

        //Ejercicio 6: Pedir número y validar que sea positivo (con excepción).
        try{
            System.out.print("Escriba un numero: ");
            int num = entrada.nextInt();
            if(num < 0){
                throw new IllegalArgumentException("El numero ingresado es negativo.");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Error: el valor introducido debe ser numerico");
        }

        //Ejercicio 7: Crear método que lance excepción si número es negativo.
        validacionNum();

        //Ejercicio 9: Validar edad (no negativa).
        try{
            System.out.print("Ingresa tu edad: ");
            int edad = entrada.nextInt();
            if(edad < 0){
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Error: El valor ingresado debe ser un entero.");
        }

        entrada.nextLine();

        //Ejercicio 10: Validar contraseña mínima (usar excepción).
        try{
            System.out.print("Ingrese una contraseña: ");
            String contra = entrada.nextLine();
            int minimo = contra.length();
            if(minimo < 5){
                throw new IllegalArgumentException("Error: la contraseña debe contener como minimo 5 caracteres.");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Ejercicio 11: Leer arreglo y capturar índice fuera de rango.
        int[] numeros = {1,2,3};
        try{
            System.out.print("Escriba la posicion del elemento del arreglo que desea ver: ");
            int num = entrada.nextInt();
            if(num < 0){
                //Ejercicio 13 Usar throw manualmente.
                throw new EsNegativo("El numero no puede ser negativo.");
            }
            System.out.println("El valor del arreglo de la posicion ingresada es: "+numeros[num]);
        }catch(ArrayIndexOutOfBoundsException e){
            //Ejercicio 12: Manejar múltiples excepciones (catch múltiples).
            System.out.println("El dato de la posicion ingresada no existe.");
        }catch(InputMismatchException e){
            System.out.println("La posicion ingresada debe ser un numero.");
        }catch(EsNegativo e){
            //Ejercicio 15: Lanzar excepción personalizada.
            System.out.println(e.getMessage());
        }

        entrada.nextLine();

        //Ejercicio 16: Validar que texto no esté vacío.
        System.out.print("Escriba algo: ");
        String palabra = entrada.nextLine();
        if(palabra != null && !palabra.isEmpty()){
            try{
                //Ejercicio 17: Manejar error al acceder a charAt.
                char caracter = palabra.charAt(2);
                System.out.println("El caracter en la posicion 3 es: "+caracter);
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("Error: el caracter en la posicion 3 no existe en la palabra ingresada.");
            } 
        }else{
            System.out.println("El texto esta vacio");
        }

        //Ejercicio 18: Validar división segura con método.
        System.out.print("Ingrese un numerador: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese un denominador: ");
        int num2 = entrada.nextInt();
        int resultado = DivisionSegura(num1, num2);
        System.out.println("El resultado de la division es: "+resultado);

        //Ejercicio 19: Validar número mayor a 100.
        try{
            MayorQueCien(101);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Ejercicio 20: Simular error controlado con throw.
        try{
            MayorQueCien(23);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Ejercicio 25: Crear pequeño menú con manejo de errores.
        int opcion = 0;
        String email="";
        do{
            
            System.out.println("\n========== MENU PRINCIPAL ==========");
            System.out.println("1. Crear un nuevo email");
            System.out.println("2. Validar requisitos delemail");
            System.out.println("3. Validar longitud");
            System.out.println("4. Salir del programa");
            opcion = leerOpcion(entrada);
            entrada.nextLine();

            switch(opcion){
                case 1:
                    email = crearEmail(entrada);
                    System.out.println("Email creado exitosamente!");                  
                break;
                case 2:
                    try{
                        validEmail(email);
                    }catch(IllegalArgumentException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                break;
                case 3:
                    try{
                        lengthEmail(email);
                    }catch(IllegalArgumentException e){
                        System.out.println("Error: "+ e.getMessage());
                    }
                break;
                case 4:
                    System.out.println("Cerrando programa...");
                break;
                default:
                    System.out.println("Opcion ingresada no valida. Intente de nuevo.");
            }
        }while(opcion != 4);
    }
}