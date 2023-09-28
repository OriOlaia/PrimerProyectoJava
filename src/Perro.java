public class Perro {
    
    int id;
    String nombre;
    String nombre2;
    
    public Perro() {
    }

    public Perro(int id, String nombre, String nombre2) {
        this.id = id;
        this.nombre = nombre;
        this.nombre2 = nombre2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public static void main(String[] args) {
        System.out.println("");
    }

}
