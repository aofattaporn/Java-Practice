package chapter9_GenericAndCollection;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.util.*;

public class work9_3List {
    public static void main(String[] args) {
//        ArrayList();
//        Stack();
//        Ques();
        InetAddress inet = InetAddress.getLoopbackAddress();
        System.out.println("IP : " + inet.getAddress());
        System.out.println("Host : " + inet.getHostName());

    }

    private static void CreatingList(){
        System.out.println("creating arraylist");
        int[] creatList3 = {10, 20, 30, 40, 50};
        List<Integer> creatList2 = Arrays.asList(1, 2, 3, 4, 5);
    }

    private static void ArrayList() {
        System.out.println("ArrayList()");

        // creating ArrayList command
        List<String> arl = new ArrayList<>();
        // Adding elements in ArrayList
        arl.add("a");
        arl.add("b");
        arl.add("c");
        arl.add("d");
        System.out.println(arl);
        arl.add(arl.size(), "|e|");
        arl.add("g");
        int size = arl.size();
        System.out.println("=================");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+ arl.get(i));
        }
        int idx = arl.indexOf("|e|");
        arl.set(idx, "f");
        arl.remove("a");
        Iterator iterable = arl.iterator();
        System.out.println("\n================");
        while (iterable.hasNext()) {
            System.out.print(" "+ iterable.next());
        }
    }

    private static void LinkedList() {
        LinkedList<String> linked = new LinkedList<>();
        linked.addFirst("first");
        linked.addLast("last");
        System.out.println(linked);
    }

    private static void Stack() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("STACK");
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        //
        stack.addAll(list);
        stack.push(6);
        System.out.println("Before pop() -> " + stack);
        System.out.print("read element from stack -> ");
        while (stack.empty() != true) {
            System.out.print(" " + stack.peek());
            stack2.addElement(stack.pop());
        }
        System.out.print("\nAfter pop() -> ");
        System.out.print(stack2);
    }

    private static void Ques() {
        System.out.println("Collection Ques");
        Queue<String> ques = new LinkedList<>();
        ques.offer("Android");
        ques.offer("ios");
        ques.offer("Window");
        System.out.println(ques);
        System.out.println("อ่านค่า elements จากหัว -> " + ques.peek());
        System.out.println("Before peek่ -> " + ques);
        ques.poll();
        System.out.println("Before peek่ -> " + ques);






    }
}
