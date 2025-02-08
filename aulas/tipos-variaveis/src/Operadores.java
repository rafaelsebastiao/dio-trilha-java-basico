public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";
        
        concatenacao = 1 + 1  + 1 + "1"; //31
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1"; //1111
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; //1111
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); //13
        System.out.println(concatenacao);

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero *= -1;

        System.out.println(numero);
    }
}
