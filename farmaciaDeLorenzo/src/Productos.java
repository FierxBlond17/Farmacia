public class Productos {
    private int id;
    private int precio;
    private String nombre;

    Productos(int id, int precio, String nombre){
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
}
