public class Tienda {

    private Telefono[] moviles;

    public Tienda(Telefono[] telefonos) {
        this.moviles = telefonos;
    }

    public boolean hayTelefonos(String nombreTelefono) {
        boolean existe = false;
        for (int i = 0; i < moviles.length; i++) {
            Telefono movil = moviles[i];
            if (nombreTelefono.equals(movil.getNombre())) {
                existe = true;
            }
        }
        return existe;

    }

    public Telefono getTefono(String nombreTelefono) {
        Telefono telefonoEncontrado = null;
        for (int i = 0; i < moviles.length; i++) {
            Telefono movil = moviles[i];

            if (movil.getNombre().equals(nombreTelefono)) {
                telefonoEncontrado = movil;
            }
        }
        return telefonoEncontrado;
    }

    public void pedido(String nombreTelefono, int cantidad) {
        if (hayTelefonos(nombreTelefono)) {
            Telefono movil = getTefono(nombreTelefono);
            movil.comprar(cantidad);
        } else {
            System.out.println("no hay telefonos de este tipo");
        }
    }

}

