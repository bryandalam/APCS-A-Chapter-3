
// ****************************************************************
//   MultiplicationTable.java
//
//   Creates a multiplication table
//              
// ****************************************************************

 
public class MultiplicationTable
{
    public static void main(String[] args)
        {
          int startNum = 1;
          int nextNum = 1;
          
          while ( startNum < 14 && nextNum < 14) {
              System.out.print("\t" + startNum * nextNum);
              nextNum++;
              if (nextNum == 13) {
                  startNum++;
                  nextNum = 1;
                  System.out.println(" ");
                  
                }
              if (startNum == 13) {
                  System.exit(0);
                }
              
        }
}
}
 