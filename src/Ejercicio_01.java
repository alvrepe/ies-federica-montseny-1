public class Ejercicio_01 {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    public Ejercicio_01(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

   private void firma() {
        System.out.println("Soy " + nombre + " " + apellido + " y mi DNI/NIF es " + dni);
    }

    public void saludo() {
        System.out.println("Hola");
        firma();
    }


    public void despedida() {

        System.out.println("Hasta la proxima!");
        firma();
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    }

