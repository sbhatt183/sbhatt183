package practise;

import java.util.ArrayList;
import java.util.List;

public class EncryptStringPart_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aaaaaaaaaaa";
		//s="aaxxeebbaa";
		System.out.println("running encryption.");
		List<String> cList= new ArrayList<String>();
		List<String>hex= new ArrayList<String>();
		StringBuffer sb=new StringBuffer();
		char prev=s.charAt(0),current=' ';
		int len=s.length(),cnt=1, elmCnt=1;
		while (cnt<len) {
			current=s.charAt(cnt);
			if(current==prev) {
				elmCnt=elmCnt+1;
			}else {
				//cList.add(prev+""+elmCnt);
				hex.add(Integer.toHexString(elmCnt)+""+prev);
				sb.append(Integer.toHexString(elmCnt)+""+prev);
				prev=current;
				elmCnt=1;
			}
			
			cnt=cnt+1;
			if(cnt==len) {
				hex.add(Integer.toHexString(elmCnt)+""+current);
				sb.append(Integer.toHexString(elmCnt)+""+current);
			}
		}
		
		//cList.forEach(x->System.out.println(x));
		System.out.println("-------------Hex---------");
		//System.out.println(hex.toString());
		//hex.forEach(x->System.out.println(x));
		System.out.println(sb.reverse().toString());
				hexTest();
			
		
	}
	
	
	
	public static void hexTest(){
		
		int i=26;
		System.out.println(Integer.toHexString(i));
		List<String>lst= new ArrayList<String>();
		lst.add(0, "sub");
		lst.add(0,"Arina");
		lst.add(0,"manu");
		
		lst.forEach(y->System.out.println(y));
		
		StringBuffer sb= new StringBuffer();
		sb.insert(0, "sub");
		sb.insert(0, "Arina");
		sb.insert(0,"manu");
		System.out.println("-------"+sb.toString());
	}
}
