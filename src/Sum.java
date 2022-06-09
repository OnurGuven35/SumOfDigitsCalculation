import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int number;
        System.out.print("Lutfen Istediginiz Sayiyi Giriniz : ");
        number = inp.nextInt();

        if (number < 0) {
            System.out.print("Hatali Sayi Girdiniz, Lutfen Tekrar Deneyiniz ! ");
        } else {

            int b;
            int total = 0;

            while (number != 0) {
                b = number % 10;
                total += b;
                number /= 10;
            }

            System.out.print("Girdiginiz Sayinin Basamaklarinin Toplami : " + total);

        }
    }
}
