
class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        stack<int> s;
        int i = 0;
        for (int j = 0; j < pushed.size(); j++) {
            s.push(pushed[j]); // push the current element from pushed array onto the stack
            while (!s.empty() && s.top() == popped[i]) { // keep popping elements from the stack as long as the top element matches the current element from popped array
                s.pop();
                i++;
            }
        }
        return i == popped.size(); // if all elements from the popped array have been matched with popped elements from the stack, then it is a valid pop sequence
    }
};
