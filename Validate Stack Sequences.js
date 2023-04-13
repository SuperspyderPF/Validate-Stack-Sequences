
const validateStackSequences = function(pushed, popped) {
    const stack = [];
    let i = 0;
    for (let j = 0; j < pushed.length; j++) {
      stack.push(pushed[j]); // push the current element from pushed array onto the stack
      while (stack.length > 0 && stack[stack.length - 1] === popped[i]) { // keep popping elements from the stack as long as the top element matches the current element from popped array
        stack.pop();
        i++;
      }
    }
    return i === popped.length; // if all elements from the popped array have been matched with popped elements from the stack, then it is a valid pop sequence
  };