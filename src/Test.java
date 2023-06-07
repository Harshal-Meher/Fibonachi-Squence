public class Test {
	public static void fibonachi(int a,int b,int n)
	{
		if(n==0)
		{
			return;
		}
		int c=a+b;
		System.out.println(c);
		fibonachi(b,c,n-1);
		
	}

	public static void main(String[] args) {

		int a=0,b=1;
		System.out.println(a+"\n"+b);
		int n=15;
		fibonachi(a, b, n-2);
		
	}

}
