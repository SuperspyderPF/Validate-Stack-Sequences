
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int j = 0; j < pushed.length; j++) {
            stack.push(pushed[j]); // push the current element from pushed array onto the stack
            while (!stack.empty() && stack.peek() == popped[i]) { // keep popping elements from the stack as long as the top element matches the current element from popped array
                stack.pop();
                i++;
            }
        }
        return i == popped.length; // if all elements from the popped array have been matched with popped elements from the stack, then it is a valid pop sequence
    }
}