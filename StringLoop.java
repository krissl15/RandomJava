
package stringloop;

import java.util.HashMap;

/**
 * This class contains a method that detects the
 * first recurring character in a string.  
 * @author Kristoffer
 * @version 1.0
 */
public class StringLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringLoop kuk = new StringLoop();
        kuk.looper();
    }

    /**
     * @return the first recurring character
     */
    public String looper() {
        String s = "bcaa";
        String rebound = "";
        HashMap<String, Integer> m = new HashMap<>();
        for (String c : s.split("")) {
            if (m.containsKey(c)) {
                rebound = c;
                System.out.println(c);
            } else {
                m.put(c, 1);
            }
        }//for end
        return rebound;
    }
}//class end        
