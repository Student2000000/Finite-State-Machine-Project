public class NFAProcessor {
    /**
     * Determines if the given string complies with the rules of the NFA: (a | b)*abb.
     * @param input A string of a's and b's to be tested.
     * @return True or False
     */
    public static boolean acceptNFA(String input){
        boolean result = true;
        //(if -->) checkChars(input) == true &&
        if (input.isEmpty() || input.endsWith("abb")) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
