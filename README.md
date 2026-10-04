# Reflection – AI Number Program Lab

##  Student Name:
Artries John Pangilinan

##  GitHub Repository Link:
https://github.com/aJ-yP/cmsc115_unit8_lab2.git

## Iteration 1

What the AI code does:
- It checks if the array is null or empty and returns 0.
- Otherwise, it uses a for-each loop to calculate the sum of all elements in the array and
- returns the sum.

Tests passed/failed:
- testBasicArray(): FAILED (returned 26 instead of 9)
- testNegativeNumbers(): FAILED (returned -64 instead of -1)
- testSingleValue(): PASSED (returned 42, which sum of single element is its own value)
- testEmptyArray(): FAILED (Returned 0 instead of Integer.MIN_VALUE)

What surprised you:
- The prompt made the AI guess what behavior was expected. Because it assumed a summation
- function, 3 out of 4 tests failed.

Commit message:
- Iteration 1: AI-generated implementation

---

## Iteration 2

What changed:
- The code was updated to search for the maximum value instead of a sum.
- It initialized 'max' with the first element of the array and iterates through to find
- the largest value.
- It throws an 'IllegalArgumentException' if an array is null or empty.

What improved:
- The logic for finding the maximum value is correct, allowing arras with normal, negative,
- or single numbers to pass.
- 3 out of 4 tests now pass perfectly.

What still failed and why:
- testEmptyArray(): FAILED
- The method throws 'IllegalArgumentException' if an array is null or empty.
- However, the test expects it to return 'Integer.MIN_VALUE' rather than throwing an exception,
- causing a test crash.

Commit message:
- Iteration 2: largest value implementation

---

## Iteration 3

Final behavior:
-

What was fixed:
-

What you learned:
-

Commit message:
-

---

## Final Reflection

- How did AI responses change across prompts?
- How did testing affect your changes?
- What did version control help you understand?