import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите номер телефона: ");
        String phoneNumb = new Scanner(System.in).nextLine();
        String cleanPhoneNumb = phoneNumb.replaceAll("\\D", "");
        if (cleanPhoneNumb.length() == 11) {

            if (cleanPhoneNumb.charAt(0) == '8') {
                cleanPhoneNumb = cleanPhoneNumb.replaceFirst("[8]", "7");
            }
            System.out.println(cleanPhoneNumb);
        } else if (cleanPhoneNumb.length() == 10) {
            cleanPhoneNumb = "7" + cleanPhoneNumb;
            System.out.println(cleanPhoneNumb);
        } else {
            System.out.println("Неправильный формат ввода");
            return;
        }
    }
}

