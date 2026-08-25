import java.util.Scanner;

public class inventario {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public inventario(){

    };

    public inventario(String codigo, String nombre, double precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock= stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "inventario{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
    //retorno
    public int vender(int cantidad){
            return (stock-=cantidad);
    }
    public double abastecer (int cantidad){
        return (stock+=cantidad);
    }
    public void mostrarTotal(){
        System.out.println("codigo: "+codigo);
        System.out.println("nombre: "+nombre);
        System.out.println("precio: "+precio);
        System.out.println("stock: "+stock);
        System.out.println(" ");
    }

}
