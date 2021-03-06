[Wordle](https://www.powerlanguage.co.uk/wordle/) is an interesting puzzle so I looked deeper into it and here's what I found:
- Wordle works with two lists. It will only select puzzle from list 1 but will accept words from list 2 as valid words.
- [List 1](wordle.txt) contains only 2315 words from which all puzzle will be chosen
- The puzzle changes based on date so running it even from your local file system will also give the same puzzle
- You can use certain starting words to maximize your chance of success. Use any one of these: opera, adore, arose

The suggested first words were determined by analyzing the list. The chosen words contain maximum of the most used letters.
Also, all the letters are different and the words are from the list from which wordle puzzle will always be chosen.

I created a puzzle generator and a basic puzzle solver. Using the puzzle solver I solved for all possible words and I found that the steps to solve the puzzle:
- on average is 4 steps
- maximum is 10 steps
- minimum is 2 steps

## Algorithm
The pseudo-code required to solve each puzzle is simple:

1. In first step choose one of: opera, adore, arose

2. In each step look for words which:
    - do not contain any of the excluded letters
    - contains all included letters
    - contains included letters in known positions, if any, and not in positions where they do not occur

I have included Java code for solving the puzzle as well as testing it on all the words. Uncomment the System.out.println lines to see the solutions.

To solve the daily puzzle manually you can also use egrep with the word list.
