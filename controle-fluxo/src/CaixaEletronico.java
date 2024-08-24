public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        

        double saldo = 25.0;
        double valorSolicitado = 26;


        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }

        System.out.println("Seu saldo é " + saldo + " Reais");
    }
}
