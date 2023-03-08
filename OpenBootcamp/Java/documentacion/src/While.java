public class While {
    public static void main(String[] args) {
        boolean check = true;
        int count = 0;
        while(count < 10){
            count++;//condicion
            if(count == 6){
                //continue;//Continua con la siguiente iteración. Salta el valor 6 y continua con la siguiente iteración
                break; //Rompe el bucle cuando count llega a 6
            }
            System.out.println("Hola mundo " + count);

        }
        System.out.println("Fin");
    }
}
