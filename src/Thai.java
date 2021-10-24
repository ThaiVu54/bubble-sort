import java.util.*;

public class Thai {
    public static void main(String[] args) {
        int[] arr = {1, 24, 56, 23, 12, 56, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
//        Stack<Integer> myStack = new Stack<Integer>();
//        myStack.push(3);
//        myStack.push(2);
//        myStack.pop();
//        myStack.push(5);
//        myStack.push(4);
//
//        System.out.println(myStack);
//        Stack<Integer> stack = new Stack<Integer>();
//        Queue<Integer> queue = new LinkedList<Integer>();
//        for (int i = 1; i < 5; i = i + 2) {
//            stack.add(i);
//        }
//        for (int i = 1; i < 8; i = i + 3) {
//            queue.add(i);
//        }
//
//        int x, count = 0;
//        while (!queue.isEmpty()) {
//            if (stack.peek() <= queue.peek()) {
//                x = queue.poll();
//                stack.push(x);
//            } else {
//                x = stack.pop();
//                queue.add(x);
//                count++;
//            }
//        }
//
//        System.out.println(count);

}
