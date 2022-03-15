package practise;

import java.util.Arrays;
import java.util.List;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ShortestOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>firstList= Arrays.asList("geeks", "for", "geeks", "contribute", 
			     "practice");
		List<String>lastList= Arrays.asList("the", "quick", "brown", "fox", 
			     "quick");
		
	 System.out.println("First list:"+getMindistance(firstList,"geeks","practice"));
	 System.out.println("Second list:"+getMindistance(lastList,"the","quick"));
	
				
				//System.out.println(min);
			
	}

	public static int getMindistance(List<String>s,String s1,String s2) {
		if(s1.isEmpty()||s2.isEmpty()||s.size()<=0)
			return -1;
		
		
		
		int x=-1, y = -1,min=Integer.MAX_VALUE;
		
		for(int i=0;i<s.size();i++) {
			
			if(s.get(i).equals(s1)) {
				x=i;
			}
			
			if(s.get(i).equals(s2)) {
				y=i;
			}
			
			if(x!=-1&&y!=-1)
			min=Math.min(min, Math.abs(x-y));
			//System.out.println(min);
			
		}
		
		return min;
	
	}
}
