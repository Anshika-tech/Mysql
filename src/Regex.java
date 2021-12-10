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
}*/
//Regular Expression Character classes Example
public class Regex{
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[amn]","abcd"));//false (not a or m or n)
        System.out.println(Pattern.matches("[amn]","a"));//true (among a or m or n)
        System.out.println(Pattern.matches("[amn]","ammna"));//false (m and a comes more than once)
    }
}