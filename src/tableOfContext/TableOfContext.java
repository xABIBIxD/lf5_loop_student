package tableOfContext;

public class TableOfContext {
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
