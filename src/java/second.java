import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number:");
        int num1 = sc.nextInt();

        System.out.println("enter second number:");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 +"is greater");
        }else{
            System.out.println(num2 +"is greater");
        }
    }
}
