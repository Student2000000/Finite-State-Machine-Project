public class OrganizeOutput {
    /**
     * Creates the output for the DFA to the main.
     */
    public static void DFAOutPut() {
        //gets a random string from RandGen
        String testOutDFARand = RandGen.genRandInput();

        //These can be changed to perform alternative tests.
        String validInputa = "accc";
        String validInputb = "bccc";
        String validInputc = "ac";
        String invaldInputa = "abcca";

        //gets the result from DFAProcessor for the random
        boolean testout1 = DFAProcessor.acceptDFA(testOutDFARand);

        //gets the result from the DFAProcessor for the non-random
        boolean nonRandomTestOut1 = DFAProcessor.acceptDFA(validInputa);
        boolean nonRandomTestOut2 = DFAProcessor.acceptDFA(validInputb);
        boolean nonRandomTestOut3 = DFAProcessor.acceptDFA(validInputc);
        boolean nonRandomTestOut4 = DFAProcessor.acceptDFA(invaldInputa);

        System.out.println("\n");
        System.out.println("DFA Language: (a+b)c*");
        System.out.println("DFA Results: \n");

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
        if (testout1 == true) {
            System.out.println("The randomly generated String: ");
            System.out.println(testOutDFARand);
            System.out.println("is Valid! \n");
        } else if (testout1 == false) {
            System.out.println("The randomly generated String: ");
            System.out.println(testOutDFARand);
            System.out.println("is NOT part of this language!! >:/ \n");
        }
    }

    /**
     * Creates the output for the NFA in the main.
     */
    public static void NFAOutPut() {

        System.out.println("\n");
        System.out.println("NFA Language: (a | b)*abb");
        System.out.println("NFA Results: \n");

        //gets a random string from RandGen
        String testOutNFARand = RandGen2.RandGenTwoChar.genRandInput2();

        //These can be changed to perform alternative tests.
        String validInputaNFA = "aabb";
        String validInputbNFA = "babb";
        String validInputcNFA = "aaabb";
        String invaldInputaNFA = "bbabba";

        //gets the result from NFAProcessor for the random
        boolean testout1NFA = NFAProcessor.acceptNFA(testOutNFARand);

        //gets the result from the NFAProcessor for the non-random
        boolean nonRandomTestOut1NFA = NFAProcessor.acceptNFA(validInputaNFA);
        boolean nonRandomTestOut2NFA = NFAProcessor.acceptNFA(validInputbNFA);
        boolean nonRandomTestOut3NFA = NFAProcessor.acceptNFA(validInputcNFA);
        boolean nonRandomTestOut4NFA = NFAProcessor.acceptNFA(invaldInputaNFA);

        //Prints out the verdict for the known inputs:
        if (nonRandomTestOut1NFA == true && nonRandomTestOut2NFA == true && nonRandomTestOut3NFA == true && nonRandomTestOut4NFA == false) {
            System.out.println(validInputaNFA);
            System.out.println("is Valid. \n");

            System.out.println(validInputbNFA);
            System.out.println("is Valid. \n");

            System.out.println(validInputcNFA);
            System.out.println("is Valid. \n");

            System.out.println(invaldInputaNFA);
            System.out.println("is not Valid. \n");
        } else {
            System.out.println("This shouldn't of happened.");
        }

        //Prints out the verdict of NFAProcessor for the random inputs
        if (testout1NFA == true) {
            System.out.println("The randomly generated String: ");
            System.out.println(testOutNFARand);
            System.out.println("is Valid! \n");
        } else if (testout1NFA == false) {
            System.out.println("The randomly generated String: ");
            System.out.println(testOutNFARand);
            System.out.println("is NOT part of this language!! >:/ \n");
        }
    }
}
