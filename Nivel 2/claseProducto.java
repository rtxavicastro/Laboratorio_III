import java.util.ArrayList;
import java.util.List;

//Ejercicio 11: Crear clase Producto.
class Producto{
    private String nombreProd;
    //Ejercicio 12: Encapsular precio.
    private double precio;

    public Producto(String nombreProd, double precio){
        this.nombreProd = nombreProd;
        setPrecio(precio);
    }

    public void setProducto(String nombreProd){
        this.nombreProd = nombreProd;
    }

    //Ejercicio 13: Validar precio positivo.
    public void setPrecio(double newPrecio){
        if(newPrecio < 0){
            System.out.println("El precio de un producto no puede ser menor a cero.");
            this.precio = 0.00;
        }else{
            this.precio = newPrecio;
        }
    }

    //Ejercicio 14: Crear método mostrar producto.
    public void mostrarProducto(){
        System.out.println("Producto: "+nombreProd);
        System.out.println("Precio: Q"+precio);
    }
}

public class claseProducto {
    public static void main(String[] args){
        //Ejercicio 15: Crear lista de productos.
        List<Producto> listProductos = new ArrayList<>();

        listProductos.add(new Producto("ASUS F16 Laptop 4050 RTX", 8100));
        listProductos.add(new Producto("Teclado Logitech G Pro", -2383));
        listProductos.add(new Producto("Mouse Razer V3", 2000));

        for(Producto prod: listProductos){
            prod.mostrarProducto();
        }
    }
}
