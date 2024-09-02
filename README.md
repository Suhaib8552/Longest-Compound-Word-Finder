# Longest-Compound-Word-Finder

# CompoundWordFinder

## Overview

The `CompoundWordFinder` is a Java program designed to identify the longest and second-longest compounded words from a list of alphabetically sorted words provided in a text file. A compounded word is defined as a word that can be formed by combining two or more other words from the same list. The program also measures and displays the time taken to process the input file.

### Design Decisions and Approach

1. **Efficient Data Handling**: 
   - The words are read from the file into a `List` and a `Set`. The `List` is used for processing, while the `Set` provides quick lookup capabilities to check if a word exists in the list.
   
2. **Optimized Search**:
   - The words are sorted by length in descending order to ensure that the longest compounded word is found first. This minimizes the number of checks needed to identify the second-longest word.
   
3. **Recursive Decomposition**:
   - The program uses a recursive approach to determine if a word is compounded by checking if it can be split into smaller words that exist in the set.

4. **Performance Considerations**:
   - The time taken to process the input file is measured using `System.nanoTime()` to provide precise timing information.

## Steps to Execute

1. **Prepare the Input File**:
   - Ensure you have a text file named `Input_02.txt` containing your list of words, with one word per line.

2. **Compile the Program**:
   - Open a terminal or command prompt and navigate to the directory containing the `CompoundWordFinder.java` file.
   - Compile the program using the following command:
     ```bash
     javac CompoundWordFinder.java
     ```

3. **Run the Program**:
   - Execute the program with:
     ```bash
     java CompoundWordFinder
     ```

4. **View the Results**:
   - The program will output the longest compounded word, the second-longest compounded word, and the time taken to process the input file.

## Example Output

```plaintext
Longest compound word: somecompoundword
Second longest compound word: anothercompoundword
Time taken: 123456 ms
```
