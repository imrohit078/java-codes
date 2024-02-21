import java.util.Scanner;

public class gret_3_num {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the 1st num : ");
        x = sc.nextInt();

        System.out.println(" Enter the 2nd num : ");
        y = sc.nextInt();

        System.out.println(" Enter the 3rd num : ");
        z = sc.nextInt();

        if (x>y && x>z){
            System.out.println("X is greater then  Y and Z");
        } 

        else if(y > z && y > x){
            System.out.println("Y is greater then Z and X");
        }
        else{
            System.out.println("Z is greater then X and Y");
        }

    }

}
