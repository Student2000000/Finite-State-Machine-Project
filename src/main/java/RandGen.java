import java.util.Random;

/**
 * Generates a String to be used as input for the DFA
 */
public class RandGen {
    /**
     * Generates a random number to be used for the length.
     * @return Random integer
     */
    public static int forInput(){
        Random randInt = new Random();
        //creating a random length for the passed in string from 0 - 20
        int randIntStringLength = randInt.nextInt(20);

        //returns the random length for use in the string builder
        return randIntStringLength;
    }

    /**
     * Generates a random String to be used in the DFA.
     * @return A random string of a's and b's, anywhere from 0 - 20 in length.
     */
    public static String genRandInput() {
        int length = forInput();
        char c1 = 'a';
        char c2 = 'b';
        StringBuilder sb = new StringBuilder(length);
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            if (length <= 0){
                return "";
            } else {
                sb.append(rand.nextBoolean() ? c1 : c2);
            }
        }

        return sb.toString();
    }
}
