import java.util.*;
import java.Scanner;
class animal { 
    public static void main(String[] args)
    {
        System.out.println("I am an animal");
        dog d= new dog();
        d.eatit();
        
    }
}
    class dog{
        void eatit(){
        System.out.println("He is eating it");
    
    }
}
