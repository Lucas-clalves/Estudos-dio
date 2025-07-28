import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Escreva seu nome.");
            String nome = scan.next();

            System.out.println("Escreva seu sobrenome");
            String sobreNome = scan.next();

            System.out.println("Escreva sua idade.");
            int idade = scan.nextInt();

            System.out.println("Escreva sua altura.");
            double altura = scan.nextDouble();
        }
        catch (InputMismatchException e){
        System.err.println("a idade e altura devem ser numericos. o formato da altura deve ser ex:'1.85'");

        }


    }
}