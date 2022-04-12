import java.util.Scanner;

public class Main {
    private static String phoneNumb;
    private static String cleanPhoneNumb;
    public static void main(String[] args) {
        cleanString();
        print();
    }
    public static void cleanString() {
        System.out.println("Введите номер телефона: ");
        String phoneNumb = new Scanner(System.in).nextLine();
        String cleanPhoneNumb = phoneNumb.replaceAll("\\D", "");
        stringLengthLimit11();
    }
    {
        errorPrint();
    }
    public static void stringLengthLimit10() {
        if (cleanPhoneNumb.length() == 10) {
            cleanPhoneNumb = "7" + cleanPhoneNumb;
        }
    }
    public static void stringLengthLimit11() {
        if (cleanPhoneNumb.length() == 11) {
            if (cleanPhoneNumb.charAt(0) == '8') {
                cleanPhoneNumb = cleanPhoneNumb.replaceFirst("[8]", "7");
            } else {
                stringLengthLimit10();
            }
        }
    }
    public static void print() {
        System.out.println(cleanPhoneNumb);
    }
    public static void errorPrint() {
        System.out.println("Неправильный формат ввода");
        return;
    }
}

