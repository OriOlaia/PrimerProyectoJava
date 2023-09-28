//EJEMPLO DE HERENCIA
//CLASE HIJO (FELINO PADRE)
public class Gato extends Felino {
    String personalidad;
    String ojos;

    public Gato() {
        
    }
    
    public Gato(String color, int edad, int tamano, String personalidad, String ojos) {
        super(color, edad, tamano);
        this.personalidad = personalidad;
        this.ojos = ojos;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }
    
}
