import java.util.Scanner;
public class Main {
    private static String cleanPhoneNumb;
    public static void main(String[] args) {
        all();
    }

    public static void all() {
        cleanString();
        if (cleanPhoneNumb.length() == 10) {
            stringLengthLimit10();
        } else if (cleanPhoneNumb.length() == 11) {
            stringLengthLimit11();
        } else {
            errorPrint();
            return;
        }
        formattingPhone();
    }

    public static void cleanString() {
        System.out.println("Введите номер телефона: ");
        cleanPhoneNumb = new Scanner(System.in).nextLine();
        cleanPhoneNumb = cleanPhoneNumb.replaceAll("\\D", "");
    }

    public static void stringLengthLimit10() {
            cleanPhoneNumb = "7" + cleanPhoneNumb;
    }

    public static void stringLengthLimit11() {
            if (cleanPhoneNumb.charAt(0) == '8') {
                cleanPhoneNumb = cleanPhoneNumb.replaceFirst("[8]", "7");
            }
    }

    public static void print() {
        System.out.println(cleanPhoneNumb);
    }

    public static void errorPrint() {
        System.out.println("Неправильный формат ввода");
    }
    public static void formattingPhone(){
        String temp = "(" + cleanPhoneNumb.substring(1,4) + ")" + cleanPhoneNumb.substring(4,11);
        temp = "+" + cleanPhoneNumb.charAt(0) + temp;
        System.out.println(temp);
    }
}
