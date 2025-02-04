import java.util.Scanner;
import java.util.Locale;

/**
 *<h1>ContaTerminal</h1>
 *<p>Classe que recebe dados via terminal contendo as características de conta em banco conforme atributos abaixo: </p>
 * 

 *<p><strong>Atributo</strong> <strong>Tipo</strong> <strong>Exemplo</strong></p>
 * <ul>
 *     <li><strong>Número</strong>: Inteiro (Exemplo: 1021)</li>
 *     <li><strong>Agência</strong>: Texto (Exemplo: 067-8)</li>
 *     <li><strong>Nome Cliente</strong>: Texto (Exemplo: MARIO ANDRADE)</li>
 *     <li><strong>Saldo</strong>: Decimal (Exemplo: 237.48)</li>
 * </ul>
 * <p>*</p>
 * <p>*</p>
 * <p>*</p> 
 * 
 * 
 * 
 *@author Rafael Sebastião
 *@version 1.0.0
 *@since 04/02/2025

 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        int numero = scanner.nextInt();


        //Leitura do buffer "\n"
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
