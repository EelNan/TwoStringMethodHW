
public class TwoStringMethods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(abcTest(".,abcsd."));
        System.out.println(abcTest(",.abc.."));
        System.out.println(abcTest(".abcab.cabc"));
        System.out.println(abcTest("asdbbc...fabc"));
        System.out.println(abcTest(".abc.abc.abc.abc.abc...abcabc"));
        System.out.println(alternateStrings("abc", "xyz"));
        System.out.println(alternateStrings("Hi", "There"));
        System.out.println(alternateStrings("xxxx", "Thereee"));
        System.out.println(alternateStrings("Thereee", "xxxx"));
    }

    public static boolean abcTest(String input) {

        int indexABC = input.indexOf("abc");
        int indexPoint = input.indexOf(".");
        if (indexABC != -1) {
            if (indexPoint + 1 == indexABC && indexPoint != -1)
                return abcTest(input.substring(indexABC + 2));
            else {
                return true;
            }
        }
        return false;
    }

    public static String alternateStrings(String str1, String str2) {
        String output = "";
        int str1Len = str1.length();
        int str2Len = str2.length();
        for(int i = 0; i < Math.min(str1Len, str2Len); i++) {

            output += str1.substring(i, i+1);
            output += str2.substring(i, i+1);

        }
        if(str1Len > str2Len) {
            output += str1.substring(str2Len);
        }
        else {
            output+= str2.substring(str1Len);
        }

        return output;
    }
}
