package MySort;

/**
 * Created by dmitry.arefyev on 21.11.2016.
 */
public class Box implements Comparable {
    int a,b;

    public Box(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a=" + a + " b=" + b;
    }

    @Override
    public int compareTo(Object obj) {
        Box box = (Box) obj;
        return this.a*this.b - box.a*box.b;
    }
}
