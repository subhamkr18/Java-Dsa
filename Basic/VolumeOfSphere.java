import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Sphere: ");
        //taking Input from user
        double r= sc.nextDouble();

        double pi= 3.14159;
        // Volume Of sphere = 4/3 *pi*r*r*r

        //4/3 = 1 !=1.33  4.0/3=1.33 thats correct
        double v= (4.0/3* pi* r*r*r) ;
        System.out.print("Volume of Sphere is: " + v);
    }
}
