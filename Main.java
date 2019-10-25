package com.Troll_Coder;
import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;
import java.util.Arrays;

///////////////////////////////////////////////////////////////////////////
// The basic idea of ​​the algorithm:
//This is a code that consists of binary digits: 0 or 1.
//Therefore, if you change a guess at a specific place from 0 to 1 (or vice versa),
// the number of hits can either increase or decrease, assuming that all other
// places in the Guess remain the same.
//So we will use the following method:
//At each step, we will first update the last number of hits
// we received from the troll to our Last_Hits variable.
// Then we will change the code's bit
// where we are currently working, this place
// is called place_inCode in the program.
// For the purpose of changing a specific place in the guess effectively:
// We will represent our guess as an array variable,
// the first guess is 000..00 as the amount of N bits.
//
//We will change the particular place_inCode at each step from 0 to 1
// and send the guess back to the troll.
//That means 2 queries for each specific place in our array:
//One with 0 and then the same guess with 1 in that place.
//We'll get an answer from the troll.
//If the number of vulnerabilities he gave has
// increased from the last guess
// (compare  to the variable we stored)
// then we will leave the 1 because it means that the 1 is correct,
// otherwise we will change it back to 0.
//
//In both cases after we make the change we move on to the next one.
//We will do so until we get to the last place - the Nth Bit.
///////////////////////////////////////////////////////////////////////////

public class Main

{

    public static String convertArrayToStringMethod(int[] strArray)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strArray.length; i++)
        {
            stringBuilder.append(" "+strArray[i]);
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);


            ///////////////////////////////////////////////////////////////////////////
            // Receiving a code of N bits from Troll
            //Answer initiallized to False
            ///////////////////////////////////////////////////////////////////////////
           // boolean Code_Found=false;
            int N = in.nextInt();
            ///////////////////////////////////////////////////////////////////////////
            // Inserting i'th option Sequence of N bits long. given by Troll
            //Limitations: 1≤N≤100
            ///////////////////////////////////////////////////////////////////////////


            int Guess[]= new int[N];
            int Last_Hits=0;
            int place_inCode=0;
            ///////////////////////////////////////////////////////////////////////////
            // Variable place_inCode is the key to this answer,
            // giving us the stop condition
            ///////////////////////////////////////////////////////////////////////////

            for (int j = 0; j <N ; j++)
            {
                Guess[j]= 0;
            }

            ///////////////////////////////////////////////////////////////////////////
            // Initializing Current Guess to 0000...000(N size)
            ///////////////////////////////////////////////////////////////////////////

            System.out.println("Q"+convertArrayToStringMethod(Guess));
            System.out.flush();
            int Troll_hits = in.nextInt();
            //First query is outside the while
            while (place_inCode <N)
            {


                Last_Hits= Troll_hits;
                ///////////////////////////////////////////////////////////////////////////
                // Initialize Last hits.
                // here we do the 1st query with 0 bit
                ///////////////////////////////////////////////////////////////////////////


                Guess[place_inCode]= 1;
                System.out.println("Q"+convertArrayToStringMethod(Guess));
                System.out.flush();
                Troll_hits = in.nextInt();
                ///////////////////////////////////////////////////////////////////////////
                // Checking the Last hits.
                // here we do the 2st query with 1 bit
                ///////////////////////////////////////////////////////////////////////////

                if (Troll_hits > Last_Hits)
                    {
                        place_inCode++;
                    }

                else
                    {
                        Guess[place_inCode]=0;
                        place_inCode++;
                    }



                }
            //Out of While= We got the combination
        System.out.println("A"+convertArrayToStringMethod(Guess));





    }
    }



