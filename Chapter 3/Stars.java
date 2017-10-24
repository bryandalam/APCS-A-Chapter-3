
// ****************************************************************
//   Stars.java
//
//   Creates Star patterns
//              
// ****************************************************************
public class Stars
{
    public static int numStars;
    public static int numSpaces = 10 - numStars;
    public static int rowLength = 10;
    public static int rowNum;
    public static int currentRow = 0;
    public static String spaces = new String(" ");
    public static String stars = new String("*");
    public static String pattern = new String("");
    public static void main(String[] args) {
        printA();
        System.out.println();
        printB();
        System.out.println();
        printC();
        System.out.println();
        printD();
        
        
    }
    public static void printItem(String it, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(it);
        }
          
        }
    public static void printA() {
        int numStars = 10;
        int numSpaces = 0;
        for (int numRows = 10;numRows >= 0; numRows--){
            printItem("*", numRows);
            printItem(" ", 10-numSpaces);
            numSpaces++;
            System.out.println();
        }
            
    }
    public static void printB() {
        int numStars = 1;
        int numSpaces = 9;
        for (int numRows = 10;numRows >= 0; numRows--) {
            if (numStars == 11) {
                numStars = 10;
            }
            printItem(" ", numSpaces);
            printItem("*", numStars);
            numStars++;
            numSpaces--;
            System.out.println();
        }
    }
    public static void printC() {
        int numStars = 10;
        int numSpaces = 0;
        for (int numRows = 10; numRows >= 0; numRows--) {
            printItem(" ", numSpaces);
            printItem("*", numRows);
            numSpaces++;
            System.out.println();
        }
    }
    public static void printD() {
        int numStars = 1;
        int numSpaces = 8;
        int nineCount = 0;
        for (int numRows = 10; numRows >= 0; numRows--) {
            printItem(" ", numSpaces/2);
            printItem("*", numStars);
            printItem(" ", numSpaces/2);
            if (nineCount == 0) {
                numStars =numStars + 2;
                numSpaces = numSpaces - 2;
            }
            if (numStars == 9) {
                nineCount++;
                numStars = 9;
                numSpaces = 0;
            }
            if (nineCount == 3) {
                numStars = numStars - 2;
                numSpaces = numSpaces + 2;
            }
            System.out.println();
        }
    }
    
}

    
        
        

 