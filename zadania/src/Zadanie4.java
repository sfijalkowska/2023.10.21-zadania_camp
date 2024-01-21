import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for (int i = 0; i < 100; i++) {
            Random losowacz = new Random();
            tab[i] = losowacz.nextInt(0, 101);

            System.out.print(tab[i] + " ");
        }
        //algorytm wyszukiwania największej liczby
        int max = tab[0];
        for(int i = 1 ; i < 100; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println();
        System.out.println("max " + max);
    }
}
