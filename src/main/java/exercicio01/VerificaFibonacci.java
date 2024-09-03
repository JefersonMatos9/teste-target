package exercicio01;

public class VerificaFibonacci {
    //Metodo que verifica se o número pertence a sequencia de Fibonacci
    public static boolean pertenceAFibonacci(int numero) {
        if (numero < 0) { // Números negativos não entram na sequência
            return false;
        }
        int numeroAnterior = 0; //Primeiro número da sequência de Fibonacci
        int numeroAtual = 1;  // Segundo número da sequência de Fibonacci

        // Loop para gerar a sequência fibonacci até o número atual ser maior ou igual ao número informado
        while (numeroAtual <= numero) {
            if (numeroAtual == numero) {
                return true; //Se o número atual for igual ele pertence a sequência
            }
            int novoNumero = numeroAnterior + numeroAtual; //Calcula o próximo número da sequencia
            numeroAnterior = numeroAtual; //Atualiza o número anterior para o atual
            numeroAtual = novoNumero; // Atualiza o número atual para o novo número
        }
        return false; // Se o loop terminar e número não for encontrado, ele não pertence a sequencia.
    }
}
