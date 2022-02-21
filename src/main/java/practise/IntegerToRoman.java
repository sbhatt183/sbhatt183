package practise;

public class IntegerToRoman {
	
	
	public String convertToRoman(int n) {
		if(n<0&&n>3999)
			throw new IllegalArgumentException("enter a number less than 3999");
		
		int [] integer= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String [] rom= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		String roman="";
		int ln=integer.length-1;
		
		
		while(n>0) {
				
				while(n>=integer[ln]) {
					n=n-integer[ln];
					roman=roman+rom[ln];					
				}
				ln--;
		}
		
		
		return roman;
	}

}
