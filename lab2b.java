import java.text.DecimalFormat;
import java.util.*;

public class lab2b {
    

        public static void main(String[] args) {
            System.out.println("NAME SUBHADIP DAS" + " " + "ROLL NO:2230210");

            System.out.println("x   |   y = e^(-x)");
            System.out.println("-------------------");
    
            for (double x = 0; x <= 1; x += 0.1) {
                double y = Math.exp(-x);


                DecimalFormat xyz = new DecimalFormat("#.##");
                String  p = xyz.format(y);
                System.out.println(p);
            }
        }
    }
    
    

