# RockPaperScissors
Rock Paper Scissors game app in Java

A simple console game where you play one round of Rock Paper Scissors against the computer. You enter a numeric choice, the computer randomly selects its move, and the program displays the winner.

Features
- Reads player input using java.util.Scanner.
- Generates the computer's choice using java.util.Random.
- Checks whether the player's integer choice is within the allowed range.
- Detects a tie, a player win, or a computer win.
  
Requirements
- A Java Development Kit (JDK) installed, with java and javac available in your terminal.
- No external libraries are required.
  
Setup and Run
1. Save the supplied Java code as day4/RockPaperScissor.java inside your project folder. The directory matches package day4;, and the filename must match the class name exactly.
2. Open a terminal in the project folder, which contains the day4 directory.
3. Compile the program:
   javac day4/RockPaperScissor.java
4. Run it from the same folder:
   java -cp . day4.RockPaperScissor
   
How to Play
Enter one of the following integers and press Enter:
Input	Move	Beats
0	Rock	Scissors
1	Paper	Rock
2	Scissors	Paper


The computer selects a move using new Random().nextInt(3), which returns 0, 1, or 2.
- Matching moves result in a tie.
- If your move beats the computer's move, you win.
- Otherwise, the computer wins.
Example Round
Suppose you enter 0 for Rock and the computer randomly chooses 2 for Scissors. Rock beats Scissors, so the result is:
You Win! - **Congratulations**
The program prints your numeric choice first, followed by the computer's numeric choice, before displaying the result. The computer's choice may differ on each run.
Result Messages
Outcome	Printed message
Tie	Its a tie!
Player wins	You Win! - **Congratulations**
Computer wins	Computer Wins!


The asterisks around Congratulations are printed literally in the console.
Input Validation
If you enter an integer below 0 or above 2, the program prints the following message and exits:
Invalid choice: Please run the game again and enter 0,1,2...
Non-integer input, such as rock or 1.5, is not handled and can terminate the program with an InputMismatchException.

Current Limitations
- Plays only one round per run; restart the program to play again.
- Displays numeric choices without labels identifying the player or computer.
- Does not track scores or offer an input retry.
  
Possible Improvements
- Display move names instead of numeric values.
- Add a replay option and score tracking.
- Handle non-integer input and allow retries.
  
Concepts Practiced
- Console input and output.
- Random number generation.
- Input validation.
- Comparison operators and logical operators (&& and ||).
- if, else if, and else statements.
