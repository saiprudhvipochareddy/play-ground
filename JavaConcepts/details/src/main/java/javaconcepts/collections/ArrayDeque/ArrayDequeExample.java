package javaconcepts.collections.ArrayDeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        //FIFO
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(20);
        arrayDequeAsQueue.addLast(100);

        var removeFirst = arrayDequeAsQueue.pollFirst();
        System.out.println(removeFirst);
        System.out.println("After removal: " + arrayDequeAsQueue);

        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        //LIFO
        arrayDequeAsStack.offerFirst(1);
        arrayDequeAsStack.offerFirst(20);
        arrayDequeAsStack.offerFirst(100);

        var removeFirstStack = arrayDequeAsStack.pollFirst();
        System.out.println(removeFirstStack);
        System.out.println("After removal: " + arrayDequeAsStack);
    }


}
