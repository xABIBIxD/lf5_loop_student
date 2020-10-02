**Lösung Inhaltsverzeichnis**

```
public class TableOfContents {
    public String createEntry(String heading, String page){
        int numberOfPoints;
        String entry="";
        if(heading.length() + page.length() <50) {
            numberOfPoints = 50 - heading.length() - page.length();
            entry=heading;
        }
        else{
            return entry;
        }

        for(int i =1; i<=numberOfPoints; i++)
            entry+=".";
        entry+=page;
        return entry;
    }
}
```
```
import java.util.Scanner;

public class TableOfContentsUI {
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
```