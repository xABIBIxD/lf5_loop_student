package tableOfContext;
import java.util.Scanner;

public class TableOfContextUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String header, page;
        System.out.print("Geben Sie die Überschrift ein: ");
        header = sc.next();
        System.out.print("Geben Sie die Seite ein: ");
        page = sc.next();
        TableOfContext toc = new TableOfContext();
        System.out.print(toc.createEntry(header, page));
    }
}
