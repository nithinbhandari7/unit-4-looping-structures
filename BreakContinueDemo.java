public class BreakContinueDemo 
{
	public static void main(String[] args)
	{
		/*
		Break: The break statement in java is used to terminate from the loop immediately. 
		When a break statement is encountered inside a loop, the loop iteration stops there, 
		and control returns from the loop immediately to the first statement after the loop
		
		Continue: stops one iteration in a loop and continues to the next iteration. 
		This statement lets you skip particular iterations without stopping a loop entirely. 
		 */
		
		//example 1
		int count = 0;
		while(count < 5)
		{
			if(count == 3)
				break;
			count++;
		}
		System.out.println(count);//3
		
		//example 2
		count = 0;
		while(count < 5)
		{
			if(count == 3)
				continue;
			count++;
		}
		System.out.println(count);//stuck in a infinite loop
		
		//example 3
		count = 0;
		while(count < 5)
		{
			count++;
			if(count == 3)
				continue;
		}
		System.out.println(count);//5
			
	}
}