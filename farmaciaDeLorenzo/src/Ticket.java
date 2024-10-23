import java.util.*;

public class Ticket {
    private ArrayList<Integer> precioProducto;
    private ArrayList<Integer> idProducto;
    private ArrayList<String> nombreProducto;
    public int precioTotal = 0;
    public boolean descuentoPerfumeria = false;
    
    public void descuentoPerfumeria(){
        descuentoPerfumeria = true;
    }


    public Ticket(){
        precioProducto = new ArrayList<>();
        idProducto = new ArrayList<>();
        nombreProducto = new ArrayList<>();
    } 
     

    public void agregarProducto(int precio, int id, String nombre) {
        precioProducto.add(precio);
        nombreProducto.add(nombre);
        idProducto.add(id);
        precioTotal += precio;
    }

    public ArrayList<Integer> obtenerProductos() {
        return precioProducto;
    }
    public ArrayList<Integer> obtenerId() {
        return idProducto;
    }
    public ArrayList<String> obtenerName() {
        return nombreProducto;
    }

    //mostramos la cantidad de productos que quiere comprar
    public void mostrarProductosDelCarrito() {
        System.out.println("Productos en el carrito:");
        for (int i = 0; i < precioProducto.size(); i++) {
            System.out.println("Producto: " + nombreProducto.get(i) +", numero identificador: " + idProducto.get(i) +", Precio $" + precioProducto.get(i));
        }
        System.out.println(precioTotal);
    }

    //mandamos el ticket con los descuentos
    public void GetTicket(){
        mostrarProductosDelCarrito();

        float descuentoIVA = precioTotal * 22 / 100;
        float descPerf = precioTotal * 5 / 100;
        float totalDescuento;
        
        if (descuentoPerfumeria == true) {
            totalDescuento = precioTotal - descPerf;
            System.out.println("Precio de la compra: " + precioTotal);
            System.out.println("Descuento de IVA: " + descuentoIVA);
            System.out.println("Descuento del 5% en Perfumeria: " + descPerf);
            System.out.println("Precio final: " + totalDescuento);
        }else{
            totalDescuento = precioTotal - descuentoIVA;
            System.out.println("Precio de la compra: " + precioTotal);
            System.out.println("Descuento de IVA: " + descuentoIVA);
            System.out.println("Precio final: " + totalDescuento);
        }
    }
   
}