import java.util.Scanner;
public class practice5 {
    public static void main(String[] args) {
        
        Scanner myobj=new Scanner(System.in);
        int radius=myobj.nextInt();
        int height=myobj.nextInt();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println(volume);
    }
}
