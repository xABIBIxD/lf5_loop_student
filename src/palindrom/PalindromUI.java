package palindrom;

import java.util.Scanner;

public class PalindromUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrom p = new Palindrom();
        System.out.print("Palindrom eingeben: ");
        String text = sc.nextLine();
        System.out.println(p.isPalindrom(text));
        sc.close();
    }
}
