public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        

        double saldo = 25.0;
        double valorSolicitado = 22.0;


        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Seu saldo é " + saldo + " Reais");
    }
}
