import java.util.Scanner;
public class AreaofCuboid {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Length of Sphere: ");
    double l = sc.nextDouble();

    System.out.print("Enter Breath of Sphere: ");
    double b = sc.nextDouble();

    System.out.print("Enter Heigth of Sphere: ");
    double h = sc.nextDouble();
         
    // volume of sphere = 2(l*b + b*h + l*h)
    double vol = 2*(l*b + b*h + l*h);

    System.out.print("Valume of Sphere : "+vol);
}
}
