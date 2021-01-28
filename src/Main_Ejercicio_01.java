public class Main_Ejercicio_01 {
    public static void main(String[] args) {

        Ejercicio_01 carlos = new Ejercicio_01("Carlos", "Martinez", "49019080P", 34);
        carlos.saludo();
        carlos.despedida();
        System.out.println(carlos.getNombre());
        System.out.println(carlos.getApellido());
        System.out.println(carlos.getDni());
        System.out.println(carlos.getEdad());
        carlos.setEdad(33); // modifica un dato
        System.out.println(carlos.getEdad());
    }
}