import java.util.Scanner;

public class Switch {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        //int age = scanner.nextInt();
        String age = scanner.nextLine();
        switch(age) {
            case "ноль":
                System.out.println("ты родился");
                break;
            case "семь":
                System.out.println("ты пошел в школу");
                break;
            case "Восемнадцать":
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("не подошло");
        }
    }
}