import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String userOptn;
        Ticket nuevaCompra = new Ticket();
        //Menu
        String menu = "Lista de Productos\n" + //
        "--------------------- \n" + //
        "|-Higiene \n" + //
        "--------------------- \n" + //
        "|---1)Jabon en barra \n" + //
        "|---2)Talco \n" + //
        "|---3)Pasta dental\n" + //
        "\n" + //
        "---------------------\n" + //
        "|-Cosmetica\n" + //
        "--------------------- \n" + //
        "|---4)Labial \n" + //
        "|---5)Agua micelar \n" + //
        "|---6)Crema hidratante\n" + //
        "\n" + //
        "---------------------\n" + //
        "|-Perfumeria\n" + //
        "--------------------- \n" + //
        "|---7)Paco Rabanne \n" + //
        "|---8)Carolina Herrera \n" + //
        "|---9)Victoria's Secret\n";
        System.out.println(menu);
        //Fin menu

            do{
                System.out.println("seleccione un producto para agregar en la lista o presione 'm' para ver el menu, \nsi quiere ver lo que lleva en su carrito presione 'i', si lo que desea finalizar la compra presione 'f' para finalizar la compra");
                userOptn = input.nextLine();
    
                switch (userOptn) {
                    case "1":
                        Higiene jabon = new Higiene(0, 42, "Jabon en barra");
                        nuevaCompra.agregarProducto(jabon.getPrecio(), jabon.getId(), jabon.getNombre());
                    break;

                    case "2":
                        Higiene talco = new Higiene(1, 50, "Talco");
                        nuevaCompra.agregarProducto(talco.getPrecio(), talco.getId(), talco.getNombre());
                    break;

                    case "3":
                        Higiene pasta = new Higiene(2, 63, "Pasta dental");
                        nuevaCompra.agregarProducto(pasta.getPrecio(), pasta.getId(), pasta.getNombre());
                    break;

                    case "4":
                        Perfumeria labial = new Perfumeria(3, 250, "Lavial");
                        nuevaCompra.agregarProducto(labial.getPrecio(), labial.getId(),labial. getNombre());    
                    break;
                        
                    case "5":
                        Perfumeria agua = new Perfumeria(4, 300, "Agua micelar");
                        nuevaCompra.agregarProducto(agua.getPrecio(), agua.getId(), agua.getNombre());    
                    break;

                    case "6":
                        Perfumeria crema = new Perfumeria(5, 343, "Crema hidratante");
                        nuevaCompra.agregarProducto(crema.getPrecio(), crema.getId(), crema.getNombre());
                    break;

                    case "7":
                        Cosmetica paco = new Cosmetica(6, 2900, "Paco Rabanne");
                        nuevaCompra.agregarProducto(paco.getPrecio(), paco.getId(), paco.getNombre());
                        nuevaCompra.descuentoPerfumeria();
                    break;

                    case "8":
                        Cosmetica carolina = new Cosmetica(7, 3150, "Carolina Herrera");
                        nuevaCompra.agregarProducto(carolina.getPrecio(),carolina.getId(),carolina.getNombre());
                        nuevaCompra.descuentoPerfumeria();
                    break;

                    case "9":
                        Cosmetica victoria = new Cosmetica(8, 2500, "Victoria's Secret");
                        nuevaCompra.agregarProducto(victoria.getPrecio(), victoria.getId(), victoria.getNombre());
                        nuevaCompra.descuentoPerfumeria();
                    break;

                    case "i":
                        nuevaCompra.mostrarProductosDelCarrito();
                    break;

                    case "m":
                        System.out.println(menu);
                    break;

                    case "f":
                        nuevaCompra.GetTicket();
                        System.out.println("¡GRACIAS POR SU COMPRA!");
                        String salir = input.nextLine();
                    break;

                    default:
                        System.out.println("Opcion no valida, por favor ingrese una de las opciones validas.");
                    break;
                }
            }while(!userOptn.equals("x"));
    }
}