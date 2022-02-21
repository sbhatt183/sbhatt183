package practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class RomantoInteger {
	
	
	
	public static void main(String args[]) {
		
		
		
	}
	
	public int romanToDecimal(String str) {
		if(!isValidInput(str))
        throw new IllegalArgumentException("not valid roman number");
    
    HashMap<Character,Integer>mp= new HashMap<Character,Integer>();
	mp.put('I',1);
	mp.put('V',5);
	mp.put('X',10);
	mp.put('L',50);
	mp.put('C',100);
	mp.put('D',500);
	mp.put('M',1000);
	char [] ar= str.toCharArray();
	int cnt=ar.length-1;
	
	int sum=0;
	int cur=0,prev=0;
	char c;
	char p=',';
    while(cnt>=0) {
		c=ar[cnt];
		cur=mp.get(c).intValue();
		if(cur<prev) {
			if((c=='I'&&(p=='X'||p=='V'))||(c=='X'&&(p=='L'||p=='C'))||(c=='C'&&(p=='D'||p=='M')))
			sum=sum-cur;
			else {
				throw new IllegalArgumentException("not valid roman number");
				
			}
			}
		else {
			sum=sum+cur;	
			
		}
		prev=cur;
		p=c;
	cnt--;	
	
		
	}
    return sum;
    // code here
}


 public boolean isValidInput(String s){
    int len=s.length();
	if (len>0&&len<=15&& (s.matches("[I,V,X,L,C,D,M]+")))
	{			
			
		return true;}
	
	return false;
}

}
