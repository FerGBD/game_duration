import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the initial time:");
        int it = sc.nextInt();
        System.out.print("Type the final time:");
        int ft = sc.nextInt();
        int dur;
        // dur = duration; it = initial time; ft = final time
            if(it < ft){
            dur = ft - it;
                System.out.println("The game lasted " + dur + " hour" );
            }else{
            dur = 24 - it + ft;
                System.out.println("The game lasted " + dur + " hour(s)" );
            }

            sc.close();

    }
}