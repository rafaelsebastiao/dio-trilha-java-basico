public class AboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobreNome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.printf("Olá, me chamo %s %s\n", nome, sobreNome);
        System.out.printf("Tenho %d anos\n", idade);
        System.out.printf("Minha altura é %.2f cm\n", altura);

    }
}
