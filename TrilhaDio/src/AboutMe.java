import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US); 
            System.out.println("Digite o seu nome: ");
            String nome = scan.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scan.next();

            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();

            System.out.println("Digite sua altura: ");
            Double altura = scan.nextDouble();

            System.err.println("Seu nome é " + nome + " " + sobrenome + ", você tem " + idade + "anos" + " e mede " + altura +"m.");
        }
    }
    
