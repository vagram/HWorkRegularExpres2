import java.util.Scanner;

public class Main {
    private static String phoneNumb;
    private static String cleanPhoneNumb;
    public static void main(String[] args) {
        cleanString();
        stringLengthLimit10();
        stringLengthLimit11();
    }
    public static void cleanString() {
        System.out.println("Введите номер телефона: ");
        phoneNumb = new Scanner(System.in).nextLine();
        cleanPhoneNumb = phoneNumb.replaceAll("\\D", "");
    }
    {
        errorPrint();
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
            } else {
                stringLengthLimit10();
            }
        }
    }
    public static void print() {
        System.out.println(cleanPhoneNumb);
        return;
    }
    public static void errorPrint() {
        System.out.println("Неправильный формат ввода");
        return;
    }
}

