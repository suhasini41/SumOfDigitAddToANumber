package digits;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfDigitsAddingToTheGivenNumber 
{
	private  int sumOfDigits(int n) 
	{
		int i=0;
		while(true)
		{
			boolean flag = false;
			int k=i,sum=0;
			while(k>0)
			{
				sum = sum+(k%10);
				k = k/10;
			}
			if(sum==n)
			{
				flag = true;
				break;
			}
			if(flag==true)
				break;
			else
				i++;
		}
		return i;
	}
	@Test
	public void testCase1()
	{
		Assert.assertEquals(sumOfDigits(16), 79);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(sumOfDigits(19), 199);
	}

}
