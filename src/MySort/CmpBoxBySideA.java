package MySort;

import java.util.Comparator;

/**
 * Сравнение по первому элементу массива
 * Created by dmitry.arefyev on 21.11.2016.
 */
public class CmpBoxBySideA implements Comparator{
    public int compare(Object o1, Object o2) {
        Box b1 = (Box) o1;
        Box b2 = (Box) o2;
        return b1.a-b2.a;
    }
}
