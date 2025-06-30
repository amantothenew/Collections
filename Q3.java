// Q3) Design a Data Structure SpecialStack that supports all the stack operations
// like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
// which should return minimum element from the SpecialStack. (Expected complexity O(1))

import java.util.Stack;

class SpecialStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    int maxSize;

    SpecialStack(int size) {
        this.maxSize = size;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + x);
            return;
        }
        mainStack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        int removed = mainStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }

        return removed;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return minStack.peek();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public boolean isFull() {
        return mainStack.size() == maxSize;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return mainStack.peek();
    }
}
