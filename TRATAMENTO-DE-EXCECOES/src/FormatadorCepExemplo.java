public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("23765064");
        System.out.println(cepFormatado);
        } catch (CepInvalidExcepcion e) {
            System.out.println("O cep não corresponde as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidExcepcion {
        if(cep.length() != 8){
            throw new CepInvalidExcepcion();
        }
        return "23.765-064";
    }
}
