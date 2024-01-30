public class Complex {

 private double x; 
 private double y; 

    public Complex() {
        this(0, 0); 
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public void input() {
      
        System.out.print("Enter the real part (x): ");
        x = scanner.nextDouble();
        System.out.print("Enter the imaginary part (y): ");
        y = scanner.nextDouble();
    }

  
    public void display() {
        System.out.println("Complex Number: " + x + " + " + y + "i");
    }

   
    public Complex add(Complex other) {
        double sumX = this.x + other.x;
        double sumY = this.y + other.y;
        return new Complex(sumX, sumY);
    }

    
    public Complex multiply(Complex other) {
        double productX = (this.x * other.x) - (this.y * other.y);
        double productY = (this.x * other.y) + (this.y * other.x);
        return new Complex(productX, productY);
    }

    public static void main(String[] args) {
        
        Complex complex1 = new Complex(3, 4);
        Complex complex2 = new Complex(1, 2);

        System.out.println("Complex Number 1:");
        complex1.display();

        System.out.println("\nComplex Number 2:");
        complex2.display();

        Complex sum = complex1.add(complex2);
        System.out.println("\nSum of Complex Numbers:");
        sum.display();

        Complex product = complex1.multiply(complex2);
        System.out.println("\nProduct of Complex Numbers:");
        product.display();
    }
}
