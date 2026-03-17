package Week6;

public class ListApp {
    /**
     * Constructor for objects of class ListApp
     */
    public ListApp() {
    }

    public static void main(String[]args) {
        ArrayList myList = new ArrayList();
        myList.add(1,100);
        myList.add(2,200);
        myList.add(3,300);
        myList.add(4,400);
        System.out.println(myList.toString());

        myList.remove(4);
        System.out.println(myList.toString());

        SLList myList1 = new SLList();
        myList1.add(1,"String 1");
        myList1.add(2,"String 2");
        myList1.add(3,"String 3");
        myList1.add(4,"String 4");
        System.out.println(myList1.toString());

        myList1.remove(4);
        System.out.println(myList1.toString());

        String item = "String 4";
        System.out.println("Searching for: " + item + " result: " + myList1.search(item));
    }
}
