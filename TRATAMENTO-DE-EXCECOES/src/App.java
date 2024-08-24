import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura em metros");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo: " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura  + "m" );
        scanner.close();
        } catch (InputMismatchException e){
            System.out.println("O campo idade e altura precisam ser numéricos");
        }
    }
}
