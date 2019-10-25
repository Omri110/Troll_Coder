# Troll Coder 
game simillar to 'Bulls and Cows' with given N digits code

The basic idea of the algorithm:
This is a code that consists of binary digits: 0 or 1.
Therefore, if you change a guess at a specific place from 0 to 1 (or vice versa),
 the number of hits can either increase or decrease, assuming that all other
 places in the Guess remain the same.
So we will use the following method:
At each step, we will first update the last number of hits
 we received from the troll to our Last_Hits variable.
 Then we will change the code's bit
 where we are currently working, this place
is called place_inCode in the program.
For the purpose of changing a specific place in the guess effectively:
 We will represent our guess as an array variable,
 the first guess is 000..00 as the amount of N bits.

We will change the particular place_inCode at each step from 0 to 1
 and send the guess back to the troll.
That means 2 queries for each specific place in our array:
One with 0 and then the same guess with 1 in that place.
We'll get an answer from the troll.
If the number of vulnerabilities he gave has
 increased from the last guess
 (compare  to the variable we stored)
 then we will leave the 1 because it means that the 1 is correct,
 otherwise we will change it back to 0.

In both cases after we make the change we move on to the next one.
We will do so until we get to the last place - the Nth Bit.
