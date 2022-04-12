import java.util.Scanner;

public class Main {
    private static String cleanPhoneNumberForm;

    public static void main(String[] args) {

        System.out.println("Введите номер телефона: ");
        String phoneNumb = new Scanner(System.in).nextLine();
        String cleanPhoneNumb = phoneNumb.replaceAll("[^0-9]", "");
        if (cleanPhoneNumb.length() >= 11) {
            cleanPhoneNumberForm = cleanPhoneNumb.substring(0, 11);
            if (cleanPhoneNumberForm.charAt(0) == '7') {
                System.out.println(cleanPhoneNumberForm);
            }
            if (cleanPhoneNumberForm.charAt(0) == '8') {
                String temp = cleanPhoneNumberForm.replaceFirst("[8]", "7");
                System.out.println(temp);
            } else {
                System.out.println("Неверный первый символ");
            }
        } else if (cleanPhoneNumb.length() < 10) {
            System.out.println("Неправильный формат ввода");
        } else if (cleanPhoneNumb.length() == 10) {
            cleanPhoneNumberForm = "7" + cleanPhoneNumb;
            System.out.println(cleanPhoneNumberForm);
        } else {
            System.out.println(cleanPhoneNumb);
        }
    }
}
