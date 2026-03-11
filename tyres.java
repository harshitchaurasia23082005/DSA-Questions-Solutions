import java.util.*;

public class tyres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dealerships = sc.nextInt();

        for (int i = 0; i < dealerships; i++) {

            int cars = sc.nextInt();
            int bikes = sc.nextInt();

            int tyres = (cars * 4) + (bikes * 2);

            System.out.println(tyres);
        }
    }
}