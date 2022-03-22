package practise;

public class Recurs {

		public static void main(String [] ardg) {
			
			//number(4);
			//System.out.println(dupNumber(5));
			//number(5);
			recNum(100,1);
		}
		
		
	public static int number(int n ) {
		if(n==0)
		{
			System.out.println(n);
			return 0;
		}
		System.out.println(n);
		return number(n-1);
	}
	
	public static int dupNumber(int n ) {
		if(n!=0) {
			System.out.println(n);
			return dupNumber(n-1);
		}
		return 0;
	}
	
	
	
	public static int recNum(int number, int start) {
		if(start<number) {
			System.out.println(start);
			return recNum(number,++start);}
		
			System.out.println(start);
			return start;
	
		}
	
}
