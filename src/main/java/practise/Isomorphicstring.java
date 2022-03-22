package practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Isomorphicstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * rfkqyuqf
		 * jkxyqvnr	
		 * 
		 * pijthbsfy
		 * fvladzpbf
		 */
		String s= "pijthbsfy";
		String s1="fvladzpbf";
		System.out.println(isIsomorphic(s,s1));
		

	}

	
	public static boolean isIsomorphic(String str1, String str2) {
		int strlen1= str1.length();
		int strlen2=str2.length();
		
		boolean isIso=false;
		if(strlen1!=strlen2)
			return false;		
		
		char c1,c2;
		HashMap<Character,Character>map= new HashMap<Character,Character>();
		
		for(int i=0; i<strlen1;i++) {
			c1=str1.charAt(i);
			c2=str2.charAt(i);
			if(!map.containsKey(c1)&&!map.containsValue(c2)) {
				map.put(c1, c2);
				isIso=true;
			}else if(map.containsKey(c1)&&map.get(c1)==c2)
				isIso=true;
			else {
				isIso=false;
				break;
			}
		}
		
		return isIso;
	}
	
	
	public static List<Integer> charCount(String s){
		List<Integer> sList= new ArrayList<Integer>();
		int cnt=1;
		int elmCnt=1;
		char prev= s.charAt(0), current=' ';
		while(cnt<s.length()) {
			current=s.charAt(cnt);
			if(current==prev) {
				elmCnt=elmCnt+1;
			}else {
				sList.add(elmCnt);
				prev=current;
				elmCnt=1;
			}
			
			cnt=cnt+1;
			if(cnt==s.length()) {
				sList.add(elmCnt);
			}
			
		}
		
		
		
		return sList;
	}
}
