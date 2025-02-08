import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number teste = Double.valueOf("a.27");
        Number valor;
        try{
            valor = NumberFormat.getInstance().parse("a1.75");

        }catch(ParseException e){
          
        }
        
      

    }
}
