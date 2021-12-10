//The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
//Matcher class
//It implements the MatchResult interface.It is a regex engine which is used to perform match operations on a character sequence.
//Three ways to write regex .
import java.util.regex.*;
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
