package practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseWords ( "i.like.this.program.very.much"));

	}
	public static String reverseWords(String S)
    {
      List<String> lst= Arrays.asList(S.split("\\."));
      Collections.reverse(lst);
      String rev="";
      int cnt=0;
      for(String sr:lst){
          rev=(cnt==0)?(rev+sr):(rev+"."+sr);
          cnt++;
      }
      return rev;
    }
}
