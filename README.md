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
- The program checks if the array is empty. If it is, it safely returns 'Integer.MIN_VALUE'.
- Otherwise, it scans the entire array to locate and return the maximum integer value present.

What was fixed:
- Removed the code that throws an 'IllegalArgumentException' on an empty or null array.
- Replaced it with a conditional return statement that supplies 'Integer.MINVALUE', which 
- satisfies the requirement of the test suite.

What you learned:
- Software specifications define how edge cases must be handled. While throwing an exception
- is common for invalid arguments, returning a sentinel value like 'Integer.MIN_VALUE' can
- be an explicit requirement to keep the program running smoothly.

Commit message:
- Iteration 3: final version passing all tests

---

## Final Reflection

How did AI responses change across prompts? 
- The AI transitioned from a highly generalized guess to targeted algorithmic work as the
- instructions became explicit. Once contextual constraints regarding edge-case handling were
- added, it provided a precise, tailored solution.
How did testing affect your changes?
- Testing served as the definitive source of truth. it exposed the functional mismatches
- between generic implementation and the project's true criteria. By running the test after
- each rewrite, I could see exactly what requirements were unmet, driving the debugging
- cycle forward.
What did version control help you understand?
- Version control clearly documented the evolution of the method. It underscored how software
- development relies on steady, incremental improvements. Moving methodically from initial
- guess to functional baseline, and finally to a completely correct, robust implementation.