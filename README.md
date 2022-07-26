# Morse-Code-Interpreter-with-Binary-Trees
Implementing Binary trees to interpret morse code


To implement this interpreter, you will use the outline of our code for BinTree, but you will have to rewrite portions of it. The first thing your program will do is to represent the Morse Code as a binary tree. The data field of each node will be the letter represented by the code. A dot (.) will cause a branch to the left, and the dash(-) will cause a branch to the right. 

The input of the program is in two files:
Morse.txt contains the chart on the next page. Each line consists of a letter, the code string length, and the code string. Use the chart by reading this file to load your binary tree.
Messages.txt is a file that you will write, which contains the strings to be decoded. This will serve as your set of test cases for this assignment. Letters are to be separated by a space, words are separated by a slash (/), and the end of a line is noted with an asterisk (*).


Example:
Messages.txt
Program Output
--. --- / ...- .. -.- .. -. --. ... *
-.. .- - .- / ... - .-. ..- -.-. - ..- .-. . ... *
GO VIKINGS
DATA STRUCTURES


I will evaluate your program by pasting my own set of Morse-encoded messages into your file and verifying that your program can correctly translate them.

Part 1: Build the tree and write a recursive method to traverse and print it in InOrder (with no spaces between the letters). The program should display your name before printing the contents of the tree on a separate line.

Part 2: Read the lines of Morse code from the Messages.txt file and decode them and print the messages. Separate your words in your output.

For reference, Morse code for the 26 letters is on the next page. It is the same information contained in Morse.txt.




Letter
Length
Code




E 
1
.




T 
1
-




I 
2
..




A 
2
.-




N 
2
-.




M 
2
--




S 
3
...




U 
3
..-




R 
3
.-.




W 
3
.--




D 
3
-..




K 
3
-.-




G 
3
--.




O 
3
---




H 
4
....




V 
4
...-




F 
4
..-.




L 
4
.-..




P 
4
.--.




J 
4
.---




B 
4
-...




X 
4
-..-




C 
4
-.-.




Y 
4
-.--




Z 
4
--..




Q 
4
--.-




