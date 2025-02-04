import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        String mensagemFinal = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        System.out.println(mensagemFinal);
        scanner.close();
    }
}
