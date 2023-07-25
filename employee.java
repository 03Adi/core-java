import java.util.*;
public class file
  {
	 public static void main(String arg[])
	 {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.next();
		System.out.println("enter your id");
		int id=s.nextInt();
		System.out.println("enter sal");
		float sal=s.nextFloat();
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		s.close();
	}
}
