import java.awt.*;

public class Main {
    public static void main (String[] args) {
        //gets the random string from RandGen
        String testOut2 = RandGen.genRandInput();

        //These can be changed to perform alternative tests.
        String validInputa = "accc";
        String validInputb = "bccc";
        String validInputc = "ac";
        String invaldInputa = "abcca";

        //gets the result from DFAProcessor for the random
        boolean testout1 = DFAProcessor.acceptDFA(testOut2);

        //gets the result from the DFAProcessor for the non-random
        boolean nonRandomTestOut1 = DFAProcessor.acceptDFA(validInputa);
        boolean nonRandomTestOut2 = DFAProcessor.acceptDFA(validInputb);
        boolean nonRandomTestOut3 = DFAProcessor.acceptDFA(validInputc);
        boolean nonRandomTestOut4 = DFAProcessor.acceptDFA(invaldInputa);

        //Prints out the verdict for the known inputs:
        if (nonRandomTestOut1 == true && nonRandomTestOut2 == true && nonRandomTestOut3 == true && nonRandomTestOut4 == false) {
            System.out.println(validInputa);
            System.out.println("is Valid. \n");

            System.out.println(validInputb);
            System.out.println("is Valid. \n");

            System.out.println(validInputc);
            System.out.println("is Valid. \n");

            System.out.println(invaldInputa);
            System.out.println("is not Valid. \n");
        } else {
            System.out.println("This shouldn't of happened.");
        }

        //Prints out the verdict of DFAProcessor for the random inputs
        if (testout1 == true){
            System.out.println("The randomly generated String: ");
            System.out.println(testOut2);
            System.out.println("is Valid! \n");
        } else if (testout1 == false){
            System.out.println("The randomly generated String: ");
            System.out.println(testOut2);
            System.out.println("is NOT part of this language!! >:/ \n");
        }

    }
}
