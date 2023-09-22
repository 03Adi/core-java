import java.util.*;  
class ArrayListexample
{  
 public static void main(String args[])
{  
ArrayList<String> al=new ArrayList<String>();  
al.add("Mango");  
al.add("Apple");  
al.add("Banana");  
al.add("Grapes");
System.out.println("Returning element: "+al.get(0));
//it will return 2nd element because of array start from 0th indexing
al.set(0,"Dates");//changing the element
for(String fruit:al)
System.out.println(fruit);
}
}
