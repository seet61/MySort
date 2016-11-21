package MySort;

/**
 * Created by dmitry.arefyev on 21.11.2016.
 */
public class MySort {
    public static void main(String[] args) {
        Box []data = {new Box(4,9), new Box(3, 3), new Box(8, 9), new Box(1, 2)};
        //Arrays.sort(data);

        for (Box di : data) {
            System.out.println("di: " + di);
        }
    }
}
