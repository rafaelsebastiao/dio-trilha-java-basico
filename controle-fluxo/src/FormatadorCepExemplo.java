public class FormatadorCepExemplo {
    public static void main(String[] args) {
        
        try{
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);

        }catch(InvalidCepException e){
            System.out.println("O cep não corresponde com as regras de negócio!");
        }
    }

    public static String formatarCep(String cep) throws InvalidCepException{
        if(cep.length() != 8){
            throw new InvalidCepException();
        }

        return "23-765-064";
    }
}
