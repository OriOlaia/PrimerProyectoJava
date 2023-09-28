//TODA LA INFO DE LOS ANIMALES
public class Raza {
    public static void main(String[] args) {
        
        Perro p1 = new Perro(); //Sin valor
        Perro p2 = new Perro(5,"Pointer", "Ingles"); //Con valor

        System.out.println("El Id del perro 2 es: " + p2.getId());
        System.out.println("El nombre del perro 2 es: " + p2.getNombre());
        System.out.println("El tipo del perro 2 es: " + p2.getNombre2());

        //aca agrego nuevo valor que estaba vacío

        p1.setId(88);
        p1.setNombre("Golden");
        p1.setNombre2("Retrevier");

        System.out.println("--------------------");
        System.out.println("El Id del perro 1 es: " + p1.getId());
        System.out.println("El nombre del perro 1 es: " + p1.getNombre());
        System.out.println("El tipo del perro 1 es: " + p1.getNombre2());

        //aca cambio de valor
        p2.setId(6000);

        System.out.println("--------------------");
        System.out.println("El Id del perro 2 es: " + p2.getId());
        System.out.println("El nombre del perro 2 es: " + p2.getNombre());
        System.out.println("El tipo del perro 2 es: " + p2.getNombre2());

        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("FELINO");

        Leon leo = new Leon();
        leo.getVelocidad();
        leo.getTamano();

        Gato gat = new Gato();
        gat.getOjos();
        gat.getEdad();


    }
    
}
