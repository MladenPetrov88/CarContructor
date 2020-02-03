package Task9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Car car;
        while (count-- > 0) {
            String[]temp = scanner.nextLine().split("\\s+");
            String carName = temp[0];
            if (temp.length == 1) {
               car = new Car(carName);
            } else if (temp.length == 3) {
               car = new Car(carName, temp[1], Integer.parseInt(temp[2]));
            } else {
                try {
                    int horsePower = Integer.parseInt(temp[1]);
                  car = new Car(carName, horsePower);
                } catch (NumberFormatException ex) {
                  car =  new Car(carName, temp[1]);
                }
            }
            System.out.println(car);

        }
    }
}
