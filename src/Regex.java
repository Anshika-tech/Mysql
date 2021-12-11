import java.util.regex.Pattern;

//The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
//Matcher class
//It implements the MatchResult interface.It is a regex engine which is used to perform match operations on a character sequence.
//Three ways to write regex .
/*import java.util.regex.*;
public class Regex{
    public static void main(String[] args) {
     //1st way
        Pattern p= Pattern.compile(".s");
    Matcher m=p.matcher("as");
    boolean b= m.matches();
    //2nd way
    boolean b2=Pattern.compile(".s").matcher("as").matches();
    //3rd way
    boolean b3=Pattern.matches(".s","as");
        System.out.println(b+" "+b2+" "+b3);
    }
}
import java.util.regex.*;
public class Regex{
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s","as"));//true (2nd char is s)
        System.out.println(Pattern.matches(".s","mk"));//false (2nd char is not s)
        System.out.println(Pattern.matches(".s","mst"));//false (has more than 2 char)
        System.out.println(Pattern.matches(".s","amms"));//false (has more than 2 char)
        System.out.println(Pattern.matches("..s","mas"));//true (3rd char is s)
    }
}
//Regular Expression Character classes Example
public class Regex{
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[amn]","abcd"));//false (not a or m or n)
        System.out.println(Pattern.matches("[amn]","a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]","ammna"));//false (m and a comes more than once)
    }
}*/
//Regex quantifiers.
//The quantifiers specify the number of occurrences of a character.
 /*
 X?	    X occurs once or not at all
 X+	    X occurs once or more times
 X*	    X occurs zero or more times
 X{n}	X occurs n times only
 X{n,}	X occurs n or more times
 X{y,z} X occurs at least y times but less than z times
public class Regex{
    public static void main(String[] args) {
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?","a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","aazzttmm"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?","azztt"));//false (z and t are not matching pattern)
        System.out.println(Pattern.matches("[amn]?","am"));//false (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","m"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","an"));//false (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","amn"));//false (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?","amzzt"));//false (a or m or n comes one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)
        System.out.println(Pattern.matches("[amn]+","am"));//true

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
    }
}
//Regex Metacharacters
//  The regular expression metacharacters work as shortcodes.
public class Regex{
    public static void main(String[] args) {
        System.out.println("metacharacters d....");//  \\d means digit

        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)

        System.out.println("metacharacters D....");//  \\D means non-digit

        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)

    }
}
//Create a regular expression that accepts alphanumeric characters only.
//Its length must be six characters long only.
public class Regex{
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","Ansh54"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","Anshika92"));//false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","Ansi$2"));//false ($ is not matched)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","9876AH"));//true
    }
}*/
//Create a regular expression that accepts 10 digit numeric characters
 //starting with 7, 8 or 9 only.
public class Regex{
    public static void main(String[] args) {
        System.out.println("character class and quantifier");
        System.out.println(Pattern.matches("[789][0-9]{9}","9876543210"));//true
        System.out.println(Pattern.matches("[789][0-9]{9}","98765432101"));//false (11 characters)
        System.out.println(Pattern.matches("[789][0-9]{9}","6876543210"));//false (starts from 6)
        System.out.println(Pattern.matches("[789][0-9]{9}","8876543210"));//true
        System.out.println("by metacharacters ...");
        System.out.println(Pattern.matches("[789]{1}\\d{9}","8876543210"));//true
        System.out.println(Pattern.matches("[789]{1}\\d{9}","88765432107"));//false (11 characters)
    }
}






