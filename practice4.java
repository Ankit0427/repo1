import java.util.Scanner;
public class practice4 {
    public static void main(String[] args) {
        
        Scanner myobj= new Scanner(System.in);
        int rad=myobj.nextInt();
        double area= Math.PI * Math.pow(rad, 2);
        System.out.println(area);
    }
}
