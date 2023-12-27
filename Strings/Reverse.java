/**
 * Reverse A String
 */

class Reverse {
    public static void main (String[] args) {
        String statement = "My name is: Ahmad Ali";
        System.out.println("Origial: " + statement);
        System.out.println("Reversed: " + reverseString(statement));
    }

    static String reverseString(String str) {
        String reversedStr = "";
        
        for (int i= str.length()-1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return reversedStr;
    }
}