package exercicio04;

//todo 4) Descubra a lógica e complete o próximo elemento:
//a) 1, 3, 5, 7, ___
//b) 2, 4, 8, 16, 32, 64, ____
//c) 0, 1, 4, 9, 16, 25, 36, ____
//d) 4, 16, 36, 64, ____
//e) 1, 1, 2, 3, 5, 8, ____
//f) 2,10, 12, 16, 17, 18, 19, ____

public class LogicaProximoElemento {

    public static void main(String[] args) {
        // Sequências
        int[] a = {1, 3, 5, 7, 9}; // Sequência de números ímpares
        int[] b = {2, 4, 8, 16, 32, 64, 128}; // Sequência onde cada número é o dobro do anterior
        int[] c = {0, 1, 4, 9, 16, 25, 36, 49}; // Sequência de quadrados perfeitos
        int[] d = {4, 16, 36, 64, 100}; // Sequência de quadrados perfeitos de números pares
        int[] e = {1, 1, 2, 3, 5, 8, 13}; // Sequência de Fibonacci
        int[] f = {2, 10, 12, 16, 17, 18, 19, 20}; // Sequência irregular crescente

        // Calcular e imprimir o próximo elemento de cada sequência
        // a) Sequência de números ímpares: 1, 3, 5, 7, 9, ...
        // Padrão: adição de 2. O próximo número após 9 é 9 + 2 = 11.
        System.out.println("Próximo elemento da sequência a: " + (a[a.length - 1] + 2));

        // b) Sequência onde cada número é o dobro do anterior: 2, 4, 8, 16, 32, 64, 128, ...
        // Padrão: multiplicação por 2. O próximo número após 128 é 128 * 2 = 256.
        System.out.println("Próximo elemento da sequência b: " + (b[b.length - 1] * 2));

        // c) Sequência de quadrados perfeitos: 0, 1, 4, 9, 16, 25, 36, 49, ...
        // Padrão: cada número é o quadrado de um número inteiro. O próximo número após 49 é 7^2 = 49,
        // então o próximo número é 8^2 = 64.
        System.out.println("Próximo elemento da sequência c: " + ((int)Math.sqrt(c[c.length - 1]) + 1) * ((int)Math.sqrt(c[c.length - 1]) + 1));

        // d) Sequência de quadrados perfeitos de números pares: 4, 16, 36, 64, 100, ...
        // Padrão: quadrado de números pares (2^2, 4^2, 6^2, 8^2, 10^2). O próximo número após 100 é 12^2 = 144.
        System.out.println("Próximo elemento da sequência d: " + ((int)Math.sqrt(d[d.length - 1]) + 2) * ((int)Math.sqrt(d[d.length - 1]) + 2));

        // e) Sequência de Fibonacci: 1, 1, 2, 3, 5, 8, 13, ...
        // Padrão: a soma dos dois últimos números. O próximo número após 13 é 8 + 13 = 21.
        System.out.println("Próximo elemento da sequência e: " + (e[e.length - 1] + e[e.length - 2]));

        // f) Sequência irregular crescente: 2, 10, 12, 16, 17, 18, 19, 20, ...
        // Padrão: incremento de 1. O próximo número após 20 é 20 + 1 = 21.
        System.out.println("Próximo elemento da sequência f: " + (f[f.length - 1] + 1));
    }
}
