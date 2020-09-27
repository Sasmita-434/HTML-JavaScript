class Demo
{
	int y=10;
	public static void main(String args[])
	{
		Demo d1=new Demo();
		Demo d2=new Demo();
		System.out.println("My First JAVA program");
		int a,b;
		a=10;b=20;
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+c);
		int[] n=new int[5];
		n[0]=22;
		n[1]=11;
		n[2]=76;
		n[3]=54;
		n[4]=39;
		System.out.println("The array elements are");
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		System.out.println("In for-each loop");
		for(int j:n)
		{
			System.out.println(j);
		}
		System.out.println("Static Variable is "+d1.y);
		d2.y=15;
		System.out.println("Updated Static Variable is "+d2.y);
		Demo[] d=new Demo[5];
		System.out.println("Array of Constructor");
		for(int k=0;k<d.length;k++)
		{
			d[k]=new Demo();
			System.out.println(d[k].y);
		}
		System.out.println("Array of Constructor in for-each loop");
		for(Demo k:d)
		{
			System.out.println(k.y);
		}
	}
}