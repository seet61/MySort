package MySort;

import java.util.Arrays;

/**
 * Created by dmitry.arefyev on 21.11.2016.
 */
public class MySort {
    public static void main(String[] args) {
        Box []data = {new Box(4,9), new Box(3, 3), new Box(8, 1), new Box(1, 2)};
        Arrays.sort(data);

        System.out.println("Normal sort");
        for (Box di : data) {
            System.out.println("di: " + di);
        }

        System.out.println("Sort with first side");
        Arrays.sort(data, Box.bySideA());
        for (Box di : data) {
            System.out.println("di: " + di);
        }
    }
}
