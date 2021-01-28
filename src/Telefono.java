public class Telefono {
    private String telefono;
    private int unidades;
    private double precio;


    public Telefono(String nombre, int unidades, double precio) {
        this.telefono = nombre;
        this.unidades = unidades;
        this.precio = precio;
    }

    public String getNombre() {
        return telefono;
    }

    public int getunidades() {
        return unidades;
    }

    public double getprecio() {
        return precio;
    }

    public void info() {
        System.out.println("El telefono " + telefono + " tiene un precio de " + precio + " euros");
    }

    public void comprar(int cantidad) {
      if (cantidad <= unidades ){
          unidades = unidades - cantidad;
          double precioTotal = precio * cantidad;
          System.out.println("Compraste " + cantidad + " moviles " + telefono + " su precio total es de " + precioTotal + " euros " );
      }else{
          System.out.println("Lo sentimos. Del movil " + telefono + " solo quedan " + cantidad);
      }
    }

    public boolean hayStock(int unidades){
        return getunidades() >= unidades;
    }



    public boolean stockRestante() {

        return getunidades() > 0;
    }

    public void comprar() {
        if (!stockRestante()) {
            System.out.println("no hay stock");
        } else {
            unidades--;
            System.out.println("Compraste el " + telefono + " a " + precio + " euros. Quendan  " + getunidades());
        }
    }

}