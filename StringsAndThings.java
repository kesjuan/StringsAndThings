import java.util.HashMap;

public class StringsAndThings {


    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        int y = 0;
        String[] input1 = input.split(" ");
        for (int x = 0; x < input1.length; x++) {
            if (input1[x].endsWith("y")) {
                char[] input2 = input1[x].toCharArray();
                for (int b = 0; b < input2.length; b++) {

                    if (input2[b] == 'y' && b == input2.length - 1) {
                        y++;
                    }
                }
            } else if (input1[x].endsWith("z")) {
                char[] input2 = input1[x].toCharArray();
                for (int b = 0; b < input2.length; b++) {

                    if (input2[b] == 'z' && b == input2.length - 1) {
                        y++;
                    }
                }
            }
        }
        return y;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String newString = base.replace(remove, "");

        return newString;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int c = 0;
        int e = 0;
        boolean answer = false;
        String[] input1 = input.split(" ");
        for (int d = 0; d < input1.length; d++) {
            if (input1[d].contains("is")) {
                c++;
                int p = input1[d].indexOf("is");
                if (input1[d].substring(p + 2).contains("is")) {
                    c++;
                }
            }
            if (input1[d].contains("not")) {
                e++;
                int p = input1[d].indexOf("not");
                if (input1[d].substring(p + 2).contains("not")) {
                    e++;
                }

            }
        }
        if (c == e) {
            answer = true;
        }
        return answer;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        boolean gIsHappy = true;
        if (input.contains("gg")) {
        }

        // for(int x = 0; x < )
        return null;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int a = 0;
        int b = 0;
        char[] input1 = input.toCharArray();
        HashMap <Character, Integer> map = new HashMap<>();

        for (char c : input1) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);

            } else {
                map.put(c, 1);

            }

            if (map.get(c) >= 3){
                a++;
                //System.out.println(map);
            }
        }


            return a;
}
    }
