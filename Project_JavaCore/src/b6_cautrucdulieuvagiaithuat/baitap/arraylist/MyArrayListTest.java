package b6_cautrucdulieuvagiaithuat.baitap.arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.print();
        list.add(1,"D");
        list.print();
        System.out.println("List size: "+list.size());
        System.out.println("Value at index 2: "+list.get(2));
        System.out.println("Index of 'B': "+list.indexOf("B"));
        System.out.println("Remove value at index 1: " +list.remove(1));
        list.print();
        System.out.println("List contains 'A'? : "+list.contains("A"));
        System.out.println("Clone list: "+list);
        System.out.println("New list: "+list.clone());
        list.clear();
        System.out.println("Clear list! List size = "+list.size());


    }
}
