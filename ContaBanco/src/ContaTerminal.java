import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos fazer um cadastro no banco com os dados que já possui.");
        System.out.println("Vamos lá!");

        System.out.println("Infrome o numero da conta");
        int numeroDaConta = scan.nextInt();
        System.out.println("Agora a agencia");
        String agencia = scan.next();

        scan.nextLine();

        System.out.println("Seu nome completo.");
        String nome = scan.nextLine();
        System.out.println("E por ultimo, informe o seu saldo.");
        double saldo = scan.nextDouble();

        System.out.println("Olá "+nome+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+numeroDaConta+ "e seu saldo "+saldo+" já está disponível para saque.");

        scan.close();


    }


}