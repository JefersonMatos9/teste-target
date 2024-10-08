package exercicio05;

// Todo 5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes.
// Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.
// Seu objetivo é descobrir qual interruptor controla qual lâmpada usando apenas duas idas até uma das salas das lâmpadas.

public class Exercicio05 {
    public static void main(String[] args) {

        identificarInterruptores();
    }

    public static void identificarInterruptores() {
        System.out.println("Para identificar qual interruptor controla qual lâmpada:");
        System.out.println("1. Ligue o Interruptor A e deixe-o ligado por alguns minutos.");
        System.out.println("2. Desligue o Interruptor A e ligue o Interruptor B.");
        System.out.println("3. Vá até a sala das lâmpadas.");
        System.out.println("4. A lâmpada que está apagada e quente é controlada pelo Interruptor A.");
        System.out.println("5. A lâmpada que está acesa é controlada pelo Interruptor B.");
        System.out.println("6. A lâmpada que está apagada e fria é controlada pelo Interruptor C.");
    }
}
