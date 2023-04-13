
class Solution {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack = Stack<Int>()
        var i = 0
        for (j in pushed.indices) {
            stack.push(pushed[j]) // push the current element from pushed array onto the stack
            while (!stack.empty() && stack.peek() == popped[i]) { // keep popping elements from the stack as long as the top element matches the current element from popped array
                stack.pop()
                i++
            }
        }
        return i == popped.size // if all elements from the popped array have been matched with popped elements from the stack, then it is a valid pop sequence
    }
}