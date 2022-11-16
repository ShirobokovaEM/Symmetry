
package javaapplication32;
public class JavaApplication32 {
    
    public static void main(String[] args) {
       
        int[] m = {1,2,3,3,2,1};
        if(symArray(m)) System.out.println("symmetrical");
        else System.out.println("No symmetrical");
    }

    private static boolean symArray(int[] m) {       
        for (int i = 0; i < m.length/2; i++) {
            if(m[i] != m[m.length - 1 - i])
                return false;            
        }
        return true;
    }
    
}
