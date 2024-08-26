Question:
What is the purpose of the HackingVault program in Java, and how does it simulate a scenario where two hacker threads compete to crack a vault's password, while a police thread acts as a timer? Explain how each component of the program works together to achieve this.

Explanation:
The HackingVault program is a simulation of a race between two hacker threads to crack a randomly generated vault password, with a police thread acting as a timer to catch the hackers if they don't succeed within a certain time frame.

Components of the Program:

#Vault Class:

This class represents the vault that contains a password. The password is randomly generated between 0 and 99999 when a Vault object is instantiated.
The isCorrectPassword(int pass) method checks if the provided password matches the vault's password. It simulates a small delay (1 millisecond) to represent the time taken to check the password.

#HackerThread Class:

This is an abstract class that extends Thread. It provides a blueprint for hacker threads that attempt to crack the vault's password.
It has a reference to the Vault object and overrides the start() method to print a message when the thread starts.

#AscendingThread Class:

This class extends HackerThread and attempts to crack the vault's password by brute-forcing from 0 upwards to 99999.
If the correct password is found, it prints the success message and terminates the program using System.exit(0).

#DescendingThread Class:

This class extends HackerThread and attempts to crack the vault's password by brute-forcing from 99999 downwards to 0.
Similar to AscendingThread, it prints the success message and terminates the program if it finds the correct password.

#PoliceThread Class:

This class extends Thread and acts as a timer. It counts up to 20 seconds, printing each second's count.
If the hackers haven't cracked the vault within 20 seconds, it prints a "Game Over" message and terminates the program using System.exit(0).

How It Works Together:
The program begins by generating a random password for the vault.
Three threads are created: an AscendingThread, a DescendingThread, and a PoliceThread.
The hacker threads (AscendingThread and DescendingThread) start running simultaneously, each trying to crack the vault's password using different approaches (ascending and descending).
The PoliceThread acts as a countdown timer, giving the hackers 20 seconds to find the correct password.
If either hacker thread finds the correct password, the program prints the success message and exits.
If the police timer runs out before the hackers crack the password, the program prints "Game Over" and exits.
This program demonstrates multithreading in Java, thread synchronization (through a race condition), and how different threads can interact within a shared environment.