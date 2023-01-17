package LE3Q1;

public class Driver_DoublyLinkedList {
    public static void main(String args[]){
        myHeader(3,1);

        //creating DoublyLinkedList reference variable called myFirstName
        DoublyLinkedList<MyStudent> DasolList= new DoublyLinkedList<MyStudent>();
        //creating five MyStudent reference variable and instantiating them
        MyStudent s0 = new MyStudent();
        MyStudent s1 = new MyStudent("Harry", 67.35);
        MyStudent s2 = new MyStudent("Luna", 87.5);
        MyStudent s3 = new MyStudent("Vincent", 60.5);
        MyStudent s4 = new MyStudent("Hermione", 89.2);

        //adding first four student to the linked list
        DasolList.addLast(s0);
        DasolList.addLast(s1);
        DasolList.addLast(s2);
        DasolList.addLast(s3);

        System.out.println("The list Content: \n" + DasolList.toString());

        //using findNode to find info for s2 and s4 from DasolList, doubly linked list
        DoublyLinkedList.Node<MyStudent> finds1 = DasolList.findNode(s2);
        DoublyLinkedList.Node<MyStudent> finds2 = DasolList.findNode(s3);

        //adding between the doubly linked list
        DasolList.addBetween(s4, finds1, finds2);

        System.out.println("The list Content: \n" + DasolList.toString());

        myFooter(3,1);
    }
    //This is myHeader method containing my name and student number
    public static void myHeader(int labE_number, int q_number){
        System.out.println("=====================================================");
        System.out.printf("Lab Exercise %d-Q%d \n", labE_number, q_number);
        System.out.println("Prepared By: Dasol Lim");
        System.out.println("Student Number: 251224110");
        System.out.println("Goal of this Exercise: Checking the code-execution time!");
        System.out.println("=====================================================");
    }
    //This is myFooter containing a good-bye message
    public static void myFooter(int labE_number, int q_number) {
        System.out.println("=====================================================");
        System.out.printf("Completion of Lab Exercise %d-Q%d is successful! \n", labE_number, q_number);
        System.out.println("Signing off - Dasol Lim");
        System.out.println("=====================================================");
    }
}
