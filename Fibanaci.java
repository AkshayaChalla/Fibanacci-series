import java.util.Scanner;
public class Fibanaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value upto where u want fibanacci series :");
        int n = sc.nextInt();
        //int n = 10;
        int first = 0 , second = 1;
        System.out.println("Fibanacii sereis up to" + n + "terms");
        for(int i=0; i<=n ; i++){
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();

    }
    
}
