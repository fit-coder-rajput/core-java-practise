import java.util.regex.*;
public class RegexTest {
    public static void main(String[] args) {
        
        String[] strings = {"foobar", "fooabar","fooaabar","fooxbar", "boofxbar","foo bar","foo  bar","foo   bar"};
        // expected  foo|0 or more 'a'|bar

        // exmple of 0 or mare same character
        String pattern = "fooa*bar";
        Pattern p = Pattern.compile(pattern);
        for(String str: strings){
        Matcher m = p.matcher(str);
        if(m.matches()){
            // System.out.println(str);
        }
       }

       // all words starting with foo ending with bar
       String pat2 = "foo.*bar";  // dot any char * anytimes
        p = Pattern.compile(pat2);
       for(String str: strings){
        Matcher m = p.matcher(str);
        if(m.matches()){
        //    System.out.println(str);
        }
      }

      String pat = "foo\s*bar"; // foo| any no. of space|bar
      p = Pattern.compile(pat);
       for(String str: strings){
        Matcher m = p.matcher(str);
        if(m.matches()){
           System.out.println(str);
        }
      }

      //7:32

      String repPatt = "([0-9]{1,2}):([0-9]{1,2})";
      String time = "7:32";
      Matcher m = Pattern.compile(repPatt).matcher(time);
      if(m.matches())
      System.out.println(m.group(1)+" past by "+m.group(2));
       
      String actual = "123.456.2323";  // expected xxx.xxx.2323
      String pp = "([1-9]{3})\\.([0-9]{3})\\.([0-9]{4})";
      Pattern ptn = Pattern.compile(pp);

      Matcher mtp = ptn.matcher(actual);
      if(mtp.matches()){
             String res = actual.replaceAll(pp, "xxx.xxx.$3");
             System.out.println(res);
      }

      actual =  "Jan 5th 1987"; // expected 5-Jan-87
      String ptrn = "([a-zA-Z]{3})\s([0-9]{1,2})([a-z]{2})\s([0-9]{2})([0-9]{2})";

      String result = actual.replaceAll(ptrn, "$1-$2-$5");
      System.out.println(result);

      actual = "(123).345.4353"; // exp = 123.345.4353

      pat = "\\(([0-9]{3})\\)\\.([0-9]{3})\\.([0-9]{4})";
      result = actual.replaceAll(pat,"$1.$2.$3" );
      System.out.println(result);

      

       
    }
}
