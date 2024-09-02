# CompoundWordFinder


## Overview

The CompoundWordFinder is a Java program that finds the longest and second-longest compounded words from an alphabetically sorted input list of words provided in a text file. A compounded word is a word that can be produced by combining two or more other words from the same list. It also measures and displays the time taken to process the input file.

### Design Decisions and Approach

**Read Words from the Input File**
The program reads words from Input_01.txt/Input_02.txt file using a BufferedReader. Each word is added to both words(w) (for processing) and wordSet(ws).

**Sort Words by Length**
The words are sorted in descending order based on their length to prioritize finding the longest compounded word first.

**Find the Longest and Second-Longest Compounded Words with the help of a function func()**
Two variables, longestComp and secondLongestComp, are initialized to store the longest and second-longest compounded words, respectively.
The program iterates through the sorted list of words and checks each word to see if it is a compounded word using the func() method.

**Measure Processing Time**
The time taken to process the file is measured in nanoseconds using System.nanoTime() before and after the word-processing loop
