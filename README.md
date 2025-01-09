# Groovy `return` in `eachWithIndex` Loop Bug

This example demonstrates a common misunderstanding in Groovy regarding the `return` statement within loops.  The `return` keyword inside the `eachWithIndex` loop only exits the loop itself, not the enclosing `myMethod` function.  This is different from some other languages where a return in a nested loop might stop the entire method's execution. 

The provided `bug.groovy` file shows the buggy code, while `bugSolution.groovy` offers a corrected version using `break` to exit the loop and achieve the desired behavior.  This is a subtlety that can easily lead to unexpected behavior in Groovy code if not understood.