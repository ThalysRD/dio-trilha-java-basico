public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1 + 1 +1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = + numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        numero = numero + 1;

        System.out.println(numero);

        numero ++;

        System.out.println(numero);

        System.out.println(++numero);

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(!!variavel);

        int a,b;

        a = 5;
        b = 6;

        String resultado =  a == b ? "Verdadeiro" : "False";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2 ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2 ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2 ? " + simNao);
    
        String nome1 = "Thalys";
        String nome2 = "Thalys";

        System.out.println(nome1 == nome2);

        nome2 = new String("Thalys");

        System.out.println(nome1 == nome2);

        System.out.println(nome1.equals(nome2));


        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("um das duas condições é verdadeiras");
        }


   }
}
