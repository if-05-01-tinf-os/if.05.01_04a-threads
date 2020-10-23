### if.05.01 TINF Operting Systems

# Assignment 5: Threads
## Objective
The goal of this week's assignment is to make you familiar with threadsn in Java.

## Required Tasks
Write the following program

### Fibonacci Sequence
Write a Java program computing the Fibonacci Numbers. Use the IntelliJ Project `FibonacciParallel` as a basis. This project already contains a single threaded Java solution (`Fibonacci.getNumberSingle(n)`). Extend this project by implementing the method `getNumberMulti(n)`. This method should use two worker threads. One for the calculation of fib(*n* - 1) and the second for calculating fib(*n*-2).

Note that the unit tests contain one test `testLarge` which is ignored. The reason is that this test takes a few more seconds to run and might be annoying when run during development. At the end, however, you are expected to run this test for a final justification of your solution.

- Extend the Java Project such that it uses two worker threads.
- Try and examine the run time performance of both solutions. Which is more efficient.
- Can you explain why which version is more efficient?
