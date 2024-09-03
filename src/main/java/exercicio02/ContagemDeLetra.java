package exercicio02;

import java.util.Scanner;

//todo 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou
// minúscula, além de informar a quantidade de vezes em que ela ocorre.
//IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode
// ser previamente definida no código;
public class ContagemDeLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Recebe a entrada do usuario
        //Solicita ao usúario que insira uma string
        System.out.println("Digite a Letra que deseja encontrar:");
        String entrada = scanner.nextLine(); // lê a string

        scanner.close(); //fecha o scanner para evitar vazamento de recursos

        // converte a string para minuscula para facilitar a contagem
        String entradaMinuscula = entrada.toLowerCase();
        char letraParaVerificar = 'a';  // define a letra a ser verificada
        int contador = 0; // inicia o contador

        for (int i = 0; i < entradaMinuscula.length(); i++) { // loop para verificar a string
            if (entradaMinuscula.charAt(i) == letraParaVerificar) {
                contador++; // a cada letra encontrada executa o incremento
            }
        }
        // resultado
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string");
        } else {
            System.out.println("A letra 'a' não aparece na string");
        }
    }
}
