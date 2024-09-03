package exercicio01;
//todo 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2
// valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar
// onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
// pertence ou não a sequência.
//IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        VerificaFibonacci verificaFibonacci = new VerificaFibonacci(); // Criando a instancia do objeto VerificaFibonacci
        Scanner scanner = new Scanner(System.in); // Scanner para a entrada do úsuario

        //Solicita que o úsuario informe um número
        System.out.println("Informe um número para verificar se pertence á sequência de Fibonacci.");
        int numero = scanner.nextInt();

        scanner.close();
        //Verifica se o número pertence a sequencia de Fibonacci e imprime o resultado
        if (verificaFibonacci.pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence á sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence á sequência de Fibonacci.");
        }
    }
}
