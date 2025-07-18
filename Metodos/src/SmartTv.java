import java.util.Scanner;

public class SmartTv {
    static boolean ligada = false;
    static int canal = 1;
    static int volume = 25;


    public static void ligar(){
        ligada = true;
        System.out.println("Tv ligada");
        System.out.println("Bem vindo!");
    }

    public static void desligar() {
        ligada = false;
    }

    public static void almentarVolume(){
        volume++;
        System.out.println("Volume definido para: "+volume);
    }

    public static void diminuirVolume(){
        volume--;
        System.out.println("Volume definido para: "+volume);
    }

    public static void almentarCanal(){
        canal++;
        System.out.println("Canal atual: "+canal);
    }

    public static void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: "+canal);
    }

    public static void mudarCanal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe para qual canal deseja mudar.");
        canal = scan.nextInt();
        System.out.println("Canal atual: "+canal);
        scan.close();
    }


}

