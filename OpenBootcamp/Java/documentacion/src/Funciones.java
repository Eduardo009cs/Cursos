public class Funciones {
    public static void main(String[] args) {
        // holaMundo();
        // holaMundo();

        holaMundo("Eduardo");

        String hola = devolverHola();
        System.out.println(hola);

    }

    /*
    * Protected: Sirve para clases que estan en un mismo paquete
    * Private: Solo sirve en una sola clase
    * Public: Se puede usar en cualquier clase
    * void: No recibe */
    public static void holaMundo() {
        System.out.println("Hola mundo desde un método");
        System.out.println("Hola mundo desde un método");
    }

    private static void holaMundo(String name){
        System.out.println("Hola " + name);
    }
    private static void holaMundo(String name, String surname){
        System.out.println(name);
        System.out.println(surname);
    }
    private static String devolverHola(){
        return "Hola";
    }
    private static int suma(int a, int b){
        return a + b;
    }
}
