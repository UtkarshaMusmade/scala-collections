import java.util.Vector;

public class VectorEx {
    public static void main(String s[]){
        Vector v = new Vector();
        System.out.println("size before adding"+v.size());
        System.out.println("capacity before adding"+v.capacity());
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);
        v.add(11);
        System.out.println("size after adding"+v.size());
        System.out.println("capacity after adding"+v.capacity());    }
}
