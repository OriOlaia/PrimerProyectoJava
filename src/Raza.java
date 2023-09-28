public class Raza {
    public static void main(String[] args) {
        
        Perro p1 = new Perro();
        Perro p2 = new Perro(5,"Pointer", "Ingles");

        System.out.println("El Id del perro 2 es: " + p2.getId());
        System.out.println("El nombre del perro 2 es: " + p2.getNombre());
        System.out.println("El tipo del perro 2 es: " + p2.getNombre2());

    }
    
}
