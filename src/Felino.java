//EJEMPLO DE HERENCIA
//CLASE PADRE
public class Felino {
    
    int tamano;
    String color;
    int edad;

    public Felino() {
    }

    public Felino(String color, int edad, int tamano) {
        this.color = color;
        this.edad = edad;
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

}
