import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {


        //algorytm do generowania tablicy z losowymi liczbami
        int[] tab = new int[100];
        for (int i = 0; i < 100; i++) {
            Random losowacz = new Random();
            tab[i] = losowacz.nextInt(0, 100);

            System.out.println(tab[i]);
        }

// liczenie średniej
            int suma = 0;
            for (int liczba : tab) {
                suma += liczba;
            }
        System.out.println(suma);
       double srednia = suma/100.0;
        System.out.println("Średnia " + srednia);
        }



}

