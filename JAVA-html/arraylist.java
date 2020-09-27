import java.util.*;
class arraylist
{
	public static void main(String args[])
	{
		ArrayList<Integer> A=new ArrayList<Integer>();
		A.add(9);
		A.add(10);
		A.add(21);
		System.out.println(A);
		A.remove(1);
		for(Integer p:A)
			System.out.println(p);
	}
}