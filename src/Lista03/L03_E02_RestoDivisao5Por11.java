package Lista03;

public class L03_E02_RestoDivisao5Por11 {

    public static void main(String[] args) {
        System.out.println("---> LISTA 03 | EXERCÍCIO 02");
        System.out.println("---> Escrever números entre 1000 e 1999 que dão resto 5 ao serem divididos por 11\n");

        boolean restoCinco;

        for (int i = 1000; i < 2000; i++) {
            restoCinco = i % 11 == 5;

            if(restoCinco){
                System.out.print(i + ", ");
            }

            restoCinco = false;
        }
    }

}
