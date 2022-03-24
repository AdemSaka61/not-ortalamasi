import java.util.Scanner;


public class notOrtalaması {
    public static void main(String[] args) {

        int mat, fiz, kim, turk, muz, note;

        Scanner input = new Scanner(System.in);


        System.out.print("Matematik Notunu Giriniz :");
        mat = input.nextInt();

        System.out.print("Fizik Notunu Giriniz :");
        fiz = input.nextInt();


        System.out.print("Kimya Notunu Giriniz :");
        kim = input.nextInt();


        System.out.print("Türkçe Notunu Giriniz :");
        turk = input.nextInt();


        System.out.print("Müzik Notunu Giriniz :");
        muz = input.nextInt();


        double avarage;

        if (mat == (0 - 100)) {
            avarage = (mat + fiz + kim + turk + muz) / 5;
        } else {
            avarage = (fiz + kim + turk + muz) / 4;
        }
        if (kim == (0 - 100)) {
            avarage = (mat + fiz + kim + turk + muz) / 5;
        } else {
            avarage = (mat + fiz + turk + muz) / 4;
        }
        if (fiz == (0 - 100)) {
            avarage = (mat + fiz + kim + turk + muz) / 5;
        } else {
            avarage = (mat + kim + turk + muz) / 4;
        }
        if (turk == (0 - 100)) {
            avarage = (mat + fiz + kim + turk + muz) / 5;
        } else {
            avarage = (mat + fiz + kim + muz) / 4;
        }
        if (muz == (0 - 100)) {
            avarage = (mat + fiz + kim + turk + muz) / 5;
        } else {
            avarage = (mat + fiz + kim + turk) / 4;
        }

        if (avarage < 55) {
            System.out.println("Sınıfta Kaldınız.");
        } else {
            System.out.println("Sınıfı geçtiniz, tebrikler.");
        }
        System.out.print(avarage);

    }
}
