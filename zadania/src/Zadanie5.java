public class Zadanie5 {
    public static void main(String[] args) {
        int[] tab = new int[100];
        for (int i = 0; i < 100; i++) {
            tab[i] = i + 1;
        }
        for (int element1 : tab) {
             if (element1 % 3 == 0 && element1 % 5 == 0) {
                System.out.println(element1 + "fizz buzz");
            }
            else if (element1 % 3 == 0) {
                System.out.println(element1 + "fizz");
            }
            else if (element1 % 5 == 0) {
                System.out.println(element1 + "buzz");
            }
            else {
                System.out.println(element1);
            }
        }
    }
}
