public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();

        smartTv.aumentarVolume();

        smartTv.status();
        smartTv.mudarCanal(13);

        smartTv.status();
        
        smartTv.ligar();

        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        
        smartTv.desligar();

        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);


    }
}
