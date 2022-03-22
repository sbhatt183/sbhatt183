package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

public class Encryptstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aaaaaaaaaaa";
		s="aabbbbcccdddd";
		
		//char[] array= s.toCharArray();
		char prev=' ',current;
		//HashMap<Character,Integer> map= new HashMap<Character,Integer>();
	
		List<String>clist= new ArrayList<String>();
		int cnt=0;
		int elmCnt=0;
		
		while(cnt<s.length()) {
			current=s.charAt(cnt);
			if(cnt==0)
				prev=current;
			
			while(current==prev&&cnt<s.length()) {
					
				elmCnt=elmCnt+1;
				cnt=cnt+1;	
				if(cnt==s.length())
					break;
				else
					current=s.charAt(cnt);
						
				
			}
			
			if(cnt<s.length())
				clist.add(prev+""+elmCnt);
			prev=current;			
			cnt=cnt+1;
			
				
			elmCnt=1;
			
			
				
			
		}
		
		  clist.forEach(elm-> System.out.println(elm));
	}

}
