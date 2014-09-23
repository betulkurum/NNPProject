/*
 * Simple array 1.
 */

package initarray;

/**
 *
 * @author asauletkhan
 */
public class Initarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int a = 10;
        int array[] = new int[a];
        
        //calculating the value
        for (int counter=0; counter<array.length; counter++)
            array[counter] = 2 + 2*counter;
        System.out.printf(" %3s%6s\n", "Index", "Value");
        
         
        for (int counter=0; counter<array.length; counter++)
        System.out.printf(" %3d%6d\n", counter, array[counter]);
        
                
        
    }
    
}
