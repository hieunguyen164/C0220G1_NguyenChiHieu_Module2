package b6_cautrucdulieuvagiaithuat.baitap.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<Student> myList = new MyLinkedList<>();

        Student student1 = new Student(1, "A");
        Student student2 = new Student(2, "B");
        Student student3 = new Student(3, "C");
        Student student4 = new Student(4, "D");
        Student student5 = new Student(5, "E");

        System.out.println("My list: ");
        myList.addFirst(student1);
        myList.addFirst(student2);
        myList.add(2, student3);
        myList.addLast(student4);
        myList.addLast(student5);
        for (int i = 0; i < myList.size(); i++) {
            Student student = myList.get(i);
            System.out.print(student.getName() + "\t");
        }
        ;

        System.out.println();
        myList.remove(2);
        System.out.println("Remove value at index 2: ");
        for (int i = 0; i < myList.size(); i++) {
            Student student = myList.get(i);
            System.out.print(student.getName() + "\t");
        }


        System.out.println();
        System.out.println("Remove 'Student4' with name 'D':");
        myList.remove(student4);
        for (int i = 0; i < myList.size(); i++) {
            Student student = myList.get(i);
            System.out.print(student.getName() + "\t");
        }

        System.out.println();
        System.out.println("List contain 'student1' with name 'A'? " + myList.constains(student1));
        System.out.println("List contains 'student4' with name 'D'? " + myList.constains(student4));

        System.out.println("Student1 index = " + myList.indexOf(student1));
        System.out.println("Student2 index = " + myList.indexOf(student2));
        System.out.println("Clone myList:");
        MyLinkedList<Student> cloneLinkedList = myList.clone();
        System.out.println("Main list id: " + myList);
        for (int i = 0; i < myList.size(); i++) {
            Student student = myList.get(i);
            System.out.print(student.getName() + "\t");
        }
        System.out.println();
        System.out.println("Clone list id: " + cloneLinkedList);
        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student student = cloneLinkedList.get(i);
            System.out.print(student.getName() + "\t");
        }

    }
}

