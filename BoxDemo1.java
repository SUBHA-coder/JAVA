import java.util.*;
class Box{
    double length;
    double width;
    double height;

   
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

   
    double calculateVolume() {
        return length * width * height;
    }


    void setBoxDimensions(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
}

public class BoxDemo1 {
    public static void main(String[] args) {
        
        Box box1 = new Box(0, 0, 0);
        Box box2 = new Box(0, 0, 0);

        
        box1.length = 5.0;
        box1.width = 3.0;
        box1.height = 2.0;

        box2.length = 8.0;
        box2.width = 4.0;
        box2.height = 3.0;

        
        double volume1 = box1.calculateVolume();
        double volume2 = box2.calculateVolume();

        System.out.println("Volume of Box 1: " + volume1);
        System.out.println("Volume of Box 2: " + volume2);

        
        box1.setBoxDimensions(6.0, 4.0, 3.0);
        box2.setBoxDimensions(10.0, 5.0, 4.0);

        
        volume1 = box1.calculateVolume();
        volume2 = box2.calculateVolume();

        System.out.println("\nVolume of Box 1 (after modification): " + volume1);
        System.out.println("Volume of Box 2 (after modification): " + volume2);
    }
}
