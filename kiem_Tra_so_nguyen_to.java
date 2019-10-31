import java.util.Scanner;

public class kiem_Tra_so_nguyen_to {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap So De Kiem Tra");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println("K phai so nguyen to");
        } else {
            int i = 2;
            boolean check = true;

            for (i = 3; i < 10000; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                    break;
                }

            }

            if (check) {
                System.out.println(num + "La so nguyen to");
            } else {
                System.out.println(" khong phai so nguyen to");
            }

        }


    }
}
