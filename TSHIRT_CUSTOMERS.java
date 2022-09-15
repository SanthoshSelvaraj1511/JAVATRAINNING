package Day2;

import java.util.Locale;
import java.util.Scanner;

public class TSHIRT_CUSTOMERS {
    public void customers() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {



                System.out.println("CUSTOMER " + i);

                System.out.println("Enetr the TSHIRT colour :");
                String colour = sc.nextLine();
                System.out.println("T-SHIRT Colour " + colour);

                System.out.println("Enetr the TSHIRT count :");
                int count = sc.nextInt();
                System.out.println("T-SHIRT Count " + count);

                System.out.println("Enetr the TSHIRT size :");
                char size = sc.next().charAt(0);
                System.out.println("T-SHIRT Size " + size);
            }
        }
    }
