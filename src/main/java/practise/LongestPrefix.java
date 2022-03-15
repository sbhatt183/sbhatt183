package practise;

import java.util.Arrays;
import java.util.Comparator;

public class LongestPrefix {

class StringCompare implements Comparator<String>{
        
        public int compare(String s1,String s2){
            return s1.length()-s2.length();
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public static String longestCommonPrefix(String arr[], int n){
        
        if(arr.length!=n ||arr.length<=0)
            return "-1";
        if(n==1)
            return arr[0];
        
        
        
        StringCompare cmp=new LongestPrefix().new StringCompare();
        Arrays.sort(arr,cmp);
        String check= arr[0];
        int cnt=1;
        boolean chk=true;
        
        while(chk){
            if(arr[cnt].startsWith(check)){
                cnt++;
                
            }else {
                check=check.substring(0,check.length()-1);
            }
            
            if(check.isEmpty()||cnt==arr.length)
                chk=false;
            
            
        };
        return check.isEmpty()?"-1":check;
    }

public void test() {
	
}

}
