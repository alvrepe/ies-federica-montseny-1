public class Vehiculo {
    private String tipo;
    private int velocidadMax;
    private String color;
    private String matricula;

    public Vehiculo(String tipo, int velocidadMax, String color, String matricula){
        this.tipo = tipo;
        this.velocidadMax = velocidadMax;
        this.color = color;
        this.matricula = matricula;
    }

    public String getTipo (){
        return tipo;
    }

    public int getVelocidadMax(){
        return velocidadMax;
    }

    public String getColor(){
        return color;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidadMax(int velocidadMax){
        this.velocidadMax= velocidadMax;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setMatricula( String matricula){
        this.matricula = matricula;
    }


    public void info() {
        System.out.println("El vehiculo de tipo " + tipo + ", con una velocidad maxima de " + velocidadMax + " Km/h. Lo tenemos en color " + color + " y su matricula es " + matricula );
    }




}
