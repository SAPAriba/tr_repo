package jenkinsCalculator;

import junit.framework.Assert;

import org.junit.Test;

public class CalculatorTesting {
	
	JavaProgram obj= new JavaProgram();
	
	@Test
	public void test1()
	{
		int expected=10;
		int actual= obj.addition(6, 4);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2()
	{
		int expected=10;
		int actual= obj.addition(5, 4);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test3()
	{
		int expected=2;
		int actual= obj.subtraction(6, 4);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test4()
	{
		int expected=10;
		int actual= obj.subtraction(7, 4);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test5()
	{
		int expected=28;
		int actual= obj.multiplication(7, 4);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test6()
	{
		int expected=10;
		int actual= obj.multiplication(7, 4);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test7()
	{
		int expected=10;
		int actual= obj.divsion(100, 10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test8()
	{
		int expected=10;
		int actual= obj.divsion(7, 4);
		Assert.assertEquals(expected, actual);
	}

}
