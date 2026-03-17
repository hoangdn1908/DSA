package Week6;

public class Demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1,1);
        list.add(2,2);
        list.add(3,3);
        list.add(4,4);
        list.add(5,5);
        System.out.println(list);
        list.add(3,6);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
