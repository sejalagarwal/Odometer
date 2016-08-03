/* package codechef; // don't place package name! */
import java.util.Scanner;
class Odometer {
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner reader = new Scanner(System.in);
		int n=reader.nextInt();
		int m=reader.nextInt();;
		int i=reader.nextInt();;
		System.out.println("The previous number is : "+getPrevious(n));
		System.out.println("The "+i+"th previous number is : "+getNthPrevious(n,i));
		System.out.println("The next number is : "+getNext(n));
		System.out.println("The "+i+"th next number is : "+getNthNext(n,i));
		System.out.println("The difference is :"+Diff(n,m));
		System.out.println("The maximum number for this input is "+getMax(countDig(n)));
		System.out.println("The minimum number for this input is "+getMin(countDig(n)));
	}
	public static int getNext(int curr)
	{
		int dig = countDig(curr);
		
		int maxR= getMax(dig);
		
		if(curr==maxR)
			return getMin(dig);
		
		
		for(int i=curr+1;i<=maxR;i++)
		{
			if(isAscending(i))
				return i;
		}
		return 0;
	}	
	
	public static int getNthNext(int curr, int n)
	{
		int i;
		for(i=1;i<=n;i++)
			curr=getNext(curr);
		
		return curr;
	}
	public static int getPrevious(int curr)
	{
		int dig = countDig(curr);
		
		int minR= getMin(dig);
		
		if(curr==minR)
			return getMax(dig);
		
		
		for(int i=curr-1;i>=minR;i--)
		{
			if(isAscending(i))
				return i;
		}
		return 0;
	}	
	
	public static int getNthPrevious(int curr, int n)
	{
		int i;
		for(i=1;i<=n;i++)
			curr=getPrevious(curr);
		
		return curr;
	}
	static boolean isAscending(int num)
	{
		while(num>0)
		{
			int dig=num%10;
			num/=10;
			if(num%10>dig || dig==0 || num%10==dig)
				return false;
		}
		return true;
	}
	
	static int Diff(int low,int high)
	{
		int next=low,count=0;
		while(next!=high)
		{
			next=getNext(next);
			count++;
		}
		return count;
	}
	static int getMin(int numOfDig)
	{
		int c=1,min=0;
		while(c<=numOfDig)
		{
			min=min*10+c;
			c++;
		}
		return min;
	}
	static int getMax(int numOfDig)
	{
		int c=9-numOfDig+1,max=0;
		while(c<=9)
		{
			max=max*10+c;
			c++;
		}
		return max;
	}
	static int countDig(int num)
	{
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		return count;
	}
}
