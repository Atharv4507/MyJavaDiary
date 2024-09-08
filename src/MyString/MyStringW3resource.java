package MyString;

import java.util.Arrays;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MyStringW3resource {
    public static void main(String[] args) {
        String s1 = "w3resource.com";
        String s2 = "madam";
        String s3 = "racecar";
        String s4 = "madam.is.a.nice.person";
        String s5 = "The quick brown fox jumps over the lazy dog";
        String s6 = "thequickbrownfoxxofnworbquickthe";
        CharSequence cs = "madam";
        StringBuilder sb = new StringBuilder();
        sb.append(cs);

        /*01 */ uniCode(s1);
        /*02 */ lexiCographicallyEqualOrNot(s2,s3);
        /*03 */ JoinStrings(s2,s3);
        /*04 */ sequeneOfCharisPresentorNot(s4,s2);
        /*05 */ CharSequenceWithNewMethod(s2,cs,sb);
        /*06 */ AddCharArray();
        /*07 */ reverseString(s4);
        /*08 */ reverseWordsInString(s4);
        /*09 */ switchFirstAndLstLetterOfWordInString(s4);
        /*10 */ currentDateAndTime();
        /*11 */ clearSomeMethods(s5);
        /*12 */ findLongestPallindromeInString(s6,s6.length());
        
    }
    private static void findLongestPallindromeInString(String str, int Strlength){
        
    }
    private static void clearSomeMethods(String str){
        System.out.println("\n");
        System.out.println("original: "+str);
        String newStr = str.replace("d", "f");
        System.out.println("after replacing 'd' with 'f': "+newStr);
        boolean str2 = str.startsWith("red");
        System.out.println("is Stringstart with 'red': "+str2);
        String str3 = str.replace("fox", "cat");
        System.out.println("after replacing 'fox' with 'cat': "+str3);
        String str4 = str.substring(10, 26);
        System.out.println("Substring from index 10 to26 is: "+str4);
        char[] cArr = str.toCharArray();
        System.out.println("Converted to charArray: "+Arrays.toString(cArr));
    
    }
    private static void currentDateAndTime(){
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time: ");
        System.out.format("%tB %te, %tY%n",c,c,c);
        System.out.format("%tl:%tM %tp%n",c,c,c);
    }
    private static void switchFirstAndLstLetterOfWordInString(String str){
        Pattern p = Pattern.compile("\\b\\w+\\b");
        Matcher m = p.matcher(str);
        StringBuilder sb = new StringBuilder();
        
        while (m.find()) {
            String str2 = m.group();
            sb.append(str2.charAt(str2.length()-1));
            for(int i = 1; i<str2.length()-1;i++){
                sb.append(str2.charAt(i));
            }
            sb.append(str2.charAt(0)+" ");
        }
        System.out.println(sb.toString().trim());

    }
    private static void reverseWordsInString(String str) {
        Pattern p = Pattern.compile("\\b\\w+\\b");
        Matcher m = p.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            String str2 = new StringBuilder(m.group()).reverse().toString();
            sb.append(str2).append(".");
        }
        System.out.println(sb.toString().trim());
        /*
            //OR
            String s1 = "hello i am java developer";
            String s2[] = s1.split(" ");
            for(int i=0;i<s2.length;i++)
			    System.out.println(s2[i]);
         */
    }
    private static void reverseString(String str){
        String str2 = new StringBuffer(str).reverse().toString();
        System.out.println(str2);

    }
    private static void AddCharArray(){
        char[] ch = new char[] {'1','2','3','4','5','6','7','8','9','0'};
        String s5 = String.copyValueOf(ch,2,3);
        System.out.println("bookPage are "+s5);
    }
    private static void CharSequenceWithNewMethod(String s1, CharSequence cs /*also accept String */, StringBuilder sb){
        System.out.println(s1.contentEquals(cs));
        System.out.println(s1.contentEquals(sb));
    }
    private static void sequeneOfCharisPresentorNot(String s4, String s2) {
        System.out.println(s4.contains(s2));
    }
    private static void JoinStrings(String s2, String s3) {
        System.out.println(s2.concat(s3));
    }
    private static void lexiCographicallyEqualOrNot(String s2, String s3) {
        int result = s2.compareTo(s3);
        if (result<0)
            System.out.println(s2+" is less than "+s3);
        else if(result == 0)
            System.out.println(s2+" is same as "+s3);
        else
            System.out.println(s2+" is greather than "+s3);
        int madam = 0;
        int racecar = 0;
        for (int i = 0; i < s2.length(); i++) {
            madam += s2.codePointAt(i);
        }
        for (int i = 0; i < s3.length(); i++) {
            racecar += s3.codePointAt(i);
        }
        System.out.println("madam: "+madam+" - "+"racecar "+racecar+" = "+(madam-racecar));

    }
    private static void uniCode(String s1){
        System.out.println(s1.codePointAt(4));
        System.out.println(s1.codePointBefore(5));
        System.out.println(s1.codePointCount(0, 5));
        System.out.println(String.valueOf(s1.codePoints()));
    }
}
