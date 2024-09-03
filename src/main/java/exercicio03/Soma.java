package exercicio03;

//todo 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1;
// enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
//
//Ao final do processamento, qual será o valor da variável SOMA?


public class Soma {
    public static void main(String[] args) {

        int indice = 12;
        double soma = 0;
        double k = 1;

        //Loop enquanto K for menor que o indice
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        //Imprime o valor final da soma
        System.out.println("O valor da variavel soma é: " + soma);
    }
}