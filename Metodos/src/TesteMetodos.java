import java.util.Scanner;

public class TesteMetodos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("escreva numero 1");
        int n1 = scan.nextInt();
        System.out.println("escreva numero 2");
        int n2 = scan.nextInt();

        double resultado = somar(n1, n2);

        System.out.println("o resultado é: "+ resultado);

        scan.close();
    }

    public static double somar(int n1, int n2){

        return (double) n1 + n2;


    }

}
