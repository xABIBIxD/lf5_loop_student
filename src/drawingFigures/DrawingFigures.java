package drawingFigures;

public class DrawingFigures {

    public void drawSquare(char sign, int numberOfSigns){
        int numberOfSpaces;
        // First Line with Stars
	    for (int i = 0; i < numberOfSigns ; i++){
            System.out.print(sign + " ");
        }
        // next line
        System.out.println("");
        // middle lines with stars
	    for (int x = 0; x < (numberOfSigns - 2) ; x++){
            System.out.print(sign + " ");
            numberOfSpaces = numberOfSigns - 2;
            // middle empty spaces
            for (int j = 0 ; j < numberOfSpaces ; j ++){
                System.out.print("  ");
            }
            // last star in one row
            System.out.println(sign);
        }
        // Last line with stars
        for(int k = 0; k < numberOfSigns ; k++){
            System.out.print(sign + " ");
        }
    }

    public void drawRhombus(int diameter){
        // first row
        for (int s=1; s<=diameter/2; s++) {
            System.out.print(' ');
        }
        System.out.println('.');

        // upper part
        for (int z=1; z<=diameter/2-1; z++) {
            for (int s=1; s<=diameter/2-z; s++) {
                System.out.print(' ');
            }
            System.out.print('/');
            for (int s=1; s<=z*2-1; s++) {
                System.out.print(' ');
            }
            System.out.println('\\');
        }

        // middle row
        System.out.print('.');
        for (int s=1; s<=diameter-2; s++) {
            System.out.print(' ');
        }
        System.out.println(".");

        // lower part
        for (int z=1; z<=diameter/2-1; z++) {
            for (int s=1; s<=z; s++) {
                System.out.print(' ');
            }
            System.out.print('\\');
            for (int s=1; s<=diameter-2-z*2; s++) {
                System.out.print(' ');
            }
            System.out.println("/");
        }

        // last row
        for (int s=1; s<=diameter/2; s++) {
            System.out.print(' ');
        }
        System.out.println('.');
    }
}
