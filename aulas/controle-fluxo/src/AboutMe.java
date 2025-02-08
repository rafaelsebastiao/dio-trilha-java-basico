import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
        
            System.out.print("Digite seu sobrenome: ");
            String sobreNome = scanner.next();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();

            
            //imprimindo dados do usuário
            System.out.printf("\n\nOlá, me chamo %s %s\n", nome,    sobreNome);
            System.out.printf("Tenho %d anos\n", idade);
            System.out.println("Minha altura é " + altura);
            
            scanner.close();
        }catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos!");
        }

        

       
    }
}