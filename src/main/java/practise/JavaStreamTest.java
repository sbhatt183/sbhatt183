package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class JavaStreamTest {

	public static void main(String args []) {
	List<String> myList = Arrays.asList("mr","myname","myis", "mySubhash");
	List<String> myListdup= Arrays.asList("geek","geeks","geek","Tree","Tree");
	
	myList.forEach(l->System.out.println(l));
	System.out.println(myList.stream().allMatch(i->i.startsWith("my")));	
	 //System.out.println(myList.stream().findAny().toString());
	 
	// myListdup.stream().distinct().forEach(i->System.out.println(i));
	 //myListdup.stream().forEachOrdered(i->System.out.println(i));
	 
	myListdup.stream().map(i->{ if(i.startsWith("gee"))return i;
	return "";
		}).forEach(i->System.out.println(i));
	
	System.out.println("*******************Map method");
	myListdup.stream().map(i->i.startsWith("gee"));
	
	System.out.println("**************Filter method***********");
	myListdup.stream().filter(i->i.startsWith("gee")).collect(Collectors.toList()).forEach(i->System.out.println(i));
	
	}
	

}
