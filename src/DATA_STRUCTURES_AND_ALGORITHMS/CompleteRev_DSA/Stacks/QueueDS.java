package DATA_STRUCTURES_AND_ALGORITHMS.CompleteRev_DSA.Stacks;

import java.util.*;

public class QueueDS {
    public static void main(String[] args) {
        // Queue is an interface implemented by deque interface which is implemented by ArrayDeque class.
        Queue<Integer> que = new ArrayDeque<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        System.out.println(que.peek());
    }
}
