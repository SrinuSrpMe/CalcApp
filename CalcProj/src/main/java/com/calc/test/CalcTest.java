package com.calc.test;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.calc.Calc;

public class CalcTest 
{
	Calc calc = null;
	
	@Before
	public void setup()
	{
		calc = new Calc();
	}
	
	@Test
	public void add()
	{
		int a=20;
		int b=10;
		
		int actual = calc.add(a, b);
		int expected=30;
		
		Assert.assertEquals(expected, actual);
	}

}
