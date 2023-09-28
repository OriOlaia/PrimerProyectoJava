//EJEMPLO DE HERENCIA
//CLASE HIJO (FELINO PADRE)
public class Leon extends Felino {
    String pelaje;
    int velocidad;
    
    public Leon() {
    }
    
    public Leon(String color, int edad, int tamano, String pelaje, int velocidad) {
        super(color, edad, tamano);
        this.pelaje = pelaje;
        this.velocidad = velocidad;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    
}
