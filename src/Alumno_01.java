public class Alumno_01 {
   private String nombre;
    private String apellidos;
    private String curso;
    private int edad;

//Constructor de clase
    public Alumno_01(String nombre, String apellidos, String curso, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.edad = edad;
    }
public Alumno_01(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = " ";
        this.edad = 18;
}
public String getNombre(){
        return nombre;
}
public  String getApellidos(){
        return  apellidos;
}
public  String getCurso(){
        return curso;
}
public int getEdad(){
        return edad;
}



public Alumno_01() {
        this ("no especificado", "no especoficado");
    }

        public void saluda () {
            System.out.println("hola soy " + nombre + " " + apellidos + " del curso " + curso + " y tengo " + edad);
        }

}
