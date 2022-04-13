import java.util.Scanner;

public class Main {
    public static String phoneNumb;
    private static String cleanPhoneNumb;

    public static void main(String[] args) {
        cleanString();
        stringLengthLimit11();
        stringLengthLimit10();
    }

    public static void cleanString() {
        System.out.println("Введите номер телефона: ");
        phoneNumb = new Scanner(System.in).nextLine();
        cleanPhoneNumb = phoneNumb.replaceAll("\\D", "");
    }

    public static void stringLengthLimit10() {
        if (cleanPhoneNumb.length() == 10) {
            cleanPhoneNumb = "7" + cleanPhoneNumb;
            print();
        }
    }

    public static void stringLengthLimit11() {
        if (cleanPhoneNumb.length() == 11) {
            if (cleanPhoneNumb.charAt(0) == '8') {
                cleanPhoneNumb = cleanPhoneNumb.replaceFirst("[8]", "7");
                print();
            } else if (cleanPhoneNumb.charAt(0) == '7') {
                print();
            } else {
                errorPrint();
            }
        }
    }

    public static void print() {
        System.out.println(cleanPhoneNumb);
    }

    public static void errorPrint() {
        System.out.println("Неправильный формат ввода");
    }
}

