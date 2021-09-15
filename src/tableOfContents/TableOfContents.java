package tableOfContents;

public class TableOfContents {
    public String createEntry(String heading, String page) {
       String apfel = ".";
       int Kevin = 50-heading.length()-page.length();
       for (int i = 0; i<Kevin;i++){
           heading+=apfel;
       }
       return heading+page;
    }
}
