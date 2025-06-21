# Exercise 7: Financial Forecasting

## 1. Understanding Recursive Algorithms

**Recursion** is a technique where a method calls itself to solve smaller instances of a problem. It is especially useful in problems where a large task can be broken down into similar sub-tasks.

### Key Properties:
- **Base Case:** The condition where recursion stops.
- **Recursive Case:** The function calls itself with a reduced/simpler input.

> Example: Calculating compound growth, Fibonacci sequence, factorial, etc., are classic recursive use cases.

In financial forecasting, recursion can model how a value evolves over time with a constant or changing growth rate.

## 2. Setup

Create a method that predicts the **future value (FV)** of an investment given:
- Present Value (PV)
- Growth Rate (r)
- Number of Years (n)

### Formula (Compound Growth):
    FV = PV * (1 + r)^n

### Base Case :
    year == 0 then return pv

## 3. Implementation - Code Structure 
    --FinancialForecast.java //contains main method as well as recursive code for the given problem of financial forecast

## Sample Output
    Future Value (Recursive): 16105.100000000008
    
## 4. Analysis
    --Time Complexity - O(N)
                    -One recursive call for each year, so total n calls.

    --Space Complexity - O(N)
                    -Due to the function call stack. Each call waits for the next one to return.
    
    NOTE : For very large values of n , this can lead to StackOverflowError

    ----OPTIMIZATION TECHNIQUES ::
        --Use Iteration Instead of Recursion
            -Preferred for performance and memory efficiency.

        --Memoization
            -Useful only if the growth rate varies each year and repeated sub-calculations occur.