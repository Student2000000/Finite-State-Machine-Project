import java.util.Random;

public class RandGen2 {
    /**
     * Generates a String to be used as input for the NFA
     */
    public class RandGenTwoChar {
        /**
         * Generates a random number to be used for the length.
         * @return Random integer
         */
        public static int forInput2(){
            Random randInt = new Random();
            //creating a random length for the passed in string from 0 - 20
            int randIntStringLength = randInt.nextInt(20);

            //returns the random length for use in the string builder
            return randIntStringLength;
        }

        /**
         * Generates a random String to be used in the DFA.
         * @return A random string of a's and b's anywhere from 0 - 20 in length.
         */
        public static String genRandInput2() {
            int length = forInput2();
            char ch1 = 'a';
            char ch2 = 'b';
            StringBuilder sb = new StringBuilder(length);
            Random rand2 = new Random();

            for (int i = 0; i < length; i++) {
                sb.append(rand2.nextBoolean() ? ch1 : ch2);
            }

            return sb.toString();
        }
    }
}
