public class Main_Alumno_01 {
    public static void main(String[] args) {



        Alumno_01 carlos = new Alumno_01("Carlos", "Martinez", "1 º DAM", 34);
//        carlos.nombre = "Carlos";
//        carlos.apellidos = "Martinez";
//        carlos.curso = " 1º Desarrollo de aplicaciones multiplataforma";
//        carlos.edad = "34";


        Alumno_01 raul = new Alumno_01("Raul", "Albarran");
//        raul.nombre = "Raul";
//        raul.apellidos = "Albarran";
//        raul.curso = " 1º Desarrollo de aplicaciones multiplataforma";
//        raul.edad = "21";
        Alumno_01 alumno = new Alumno_01();

        alumno.saluda();
        raul.saluda();
        carlos.saluda();
        System.out.println(carlos.getEdad());
    }
}
