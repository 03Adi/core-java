//ArryaList Sorting
//sorting array acconding to no sorting
import java.util.*;
class sortarraylist
{
public static void main(String arg[])
{
List<String> list1=new ArrayList<String>();
list1.add("Aditya");
list1.add("charu");
list1.add("Prakhar");
list1.add("surbhi");
Collections.sort(list1);
for(String names:list1)
System.out.println(names);
System.out.println("Sorting numbers...");
List<Integer> list2=new ArrayList<Integer>();
list2.add(5);
list2.add(4);
list2.add(3);
list2.add(2);
Collections.sort(list2);
for(Integer number:list2)
System.out.println(number);
}
}
