package Lista05;

public class L05_E08_NumerosPerfeitosRefatorado {
    public static void main(String[] args) {
        int numPerfeito = proximoPerfeito(28);
        System.out.println(numPerfeito);
    }

    public static int proximoPerfeito(int num) {
        do {
            num++;
        } while (!ehPerfeito(num));
        return num;
    }

    public static boolean ehPerfeito(int num) {
        int somaDivisores = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == num;
    }
}
