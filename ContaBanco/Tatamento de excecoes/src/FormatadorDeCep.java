public class FormatadorDeCep {
    public static void main (String[] args){
        try {
            String cepFormatado = formatarCep("80321520");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException ex) {
            System.out.println("O cep n contem o numero de caracteries correto '8'.");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "23.765-064";


    }
}
