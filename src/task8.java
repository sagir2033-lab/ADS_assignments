import java.util.Scanner;
public class task8 {
    public static String isDigits(String s) {
        if (s.isEmpty()) return "Yes";
        if (!Character.isDigit(s.charAt(0))) return "No";
        return isDigits(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isDigits(s));
    }
}