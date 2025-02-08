public class SmartTv {
    boolean ligada = false;
    int canal = 1;    
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    void dimunirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
    }

    public void dimunuirVolume(){
        volume--;
    }
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
    
    public void status(){
        System.out.println("TV ligada? " + ligada);
        System.out.println( "Canal atual: "+ canal);
        System.out.println("Volume: " + volume);
    }
}
