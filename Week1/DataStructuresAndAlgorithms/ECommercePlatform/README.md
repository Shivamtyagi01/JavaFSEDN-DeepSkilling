# E-COMMERCE PLATFORM SEARCH FUNCTION

# Big O Notation and Search Operation Analysis

## Big O Notation

Big O Notation is used to analyze the **time and space complexity** of algorithms based on input size (n). It helps us understand how an algorithm performs as the input grows.

    - It gives an upper bound on the performance of an algorithm.

## Search Operation Complexities

### Best Case - O(1)
    - The element is found immediately.
    - Examples:
    - Element is the first item in a linear search.
    - Binary search hits the middle element.w
    - HashMap or HashSet (on average) gives constant time lookup.

### Average Case - O(log n)
    - Common in binary search (on a sorted array).
    - The search space is divided by half in each iteration.

###   Worst Case - O(n)
    - Happens in linear search when:
    - The element is at the end.
    - Or not present at all.
    - Can also occur in hash-based structures (in rare cases of collision).

## Summary

- **Linear Search**: Simple but slow for large datasets (O(n) worst case).
- **Binary Search**: Fast and efficient (O(log n)), but only works on **sorted data**.
- **HashMap/HashSet**: Offers near-instant lookups (O(1) average), great for key-based search.

## PROJECT STRUCTURE
    --BinarySearch.java //performing binary search on the products
    --LinearSearch.java // performing linear search for searching of the products
    --Main.java     //storing the elements and calling binarya and linear search
    --Product.java //storing all the properties of the product object

## SAMPLE OUTPUT ::
    Enter product name to search: laptop
    Linear Search Result: ID: 1, Name: Laptop, Category: Electronics
    Binary Search Result: ID: 1, Name: Laptop, Category: Electronics

## CONCLUSION ::

### Time Complexity Comparison:

- **Linear Search** has a time complexity of **O(n)**. It checks each element one by one and does not require the data to be sorted.
- **Binary Search** has a time complexity of **O(log n)**, but it only works when the array is sorted. It reduces the search space by half in each step.

### Which Algorithm is More Suitable?

For an e-commerce platform:

- **Linear Search** is simple to implement and works well for **small datasets**, but becomes inefficient as the number of products increases.
- **Binary Search** is much faster and more efficient for **large datasets**, but it requires the product list to be **sorted** before searching.
- In real-world e-commerce systems, even faster techniques like **HashMaps**, **Search Indexing** are used for high-speed and scalable search functionality.

### Conclusion:

If the product list is **unsorted and small**, linear search is sufficient.  
But for a **larger or sorted product list**, **binary search** is a better choice due to its logarithmic performance.  
For best performance in real applications, using advanced search techniques like indexing or hash-based searching is recommended.


