public class Usuario {
    public static void main(String[] args)throws Exception {
        SmartTv smartTv = new SmartTv();

        if(SmartTv.ligada == false) {
            System.out.println("TV ligada? " + SmartTv.ligada);
        }else{
            System.out.println("TV ligada? " + SmartTv.ligada);
            System.out.println("TV esta no canal: " + SmartTv.canal);
            System.out.println("Volume atual: " + SmartTv.volume);
            }

        SmartTv.ligar();
        System.out.println("TV ligada? " + SmartTv.ligada);

        SmartTv.desligar();
        System.out.println("TV ligada? " + SmartTv.ligada);

        SmartTv.ligar();
        System.out.println("TV ligada? " + SmartTv.ligada);

        SmartTv.almentarVolume();


        SmartTv.diminuirVolume();


        SmartTv.almentarCanal();


        SmartTv.diminuirCanal();


        SmartTv.mudarCanal();




    }
}
