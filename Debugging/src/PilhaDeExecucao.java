public class PilhaDeExecucao {
    public static void main(String[] args){
        System.out.println("inicio do metodo main");
        a();
        System.out.println("fim main");
    }
    static void a(){
        System.out.println("entrou no metodo a");
        b();
        System.out.println("fim metodo a");
    }
    static void b(){
        System.out.println("entrando no metodo b");
        for(int i =0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("fim do metodo b");
    }
    static void c(){
        System.out.println("entrando metodo c");
        Thread.dumpStack();
        System.out.println("fim metodo c");
    }
}
