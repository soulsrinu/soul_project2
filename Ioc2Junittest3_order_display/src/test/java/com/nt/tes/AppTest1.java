package com.nt.tes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.nt.logicaloperationservice;

public class AppTest1 
{

	
 static logicaloperationservice service;
	
 @BeforeAll
	public static void setup()
	{
		System.out.println("setup");
		service=new  logicaloperationservice();
	}
	
	@Test
	public void testispossitve()
	{
		assertTrue(service.ispossitve(10));
		
	}
	@Test
	public void testisnegative()
	{
		assertFalse(service.ispossitve(-10));
		
	}
	@Test
	public void testNullwithObject()
	{
		assertTrue(service.isNull(new Date()));
		
	}
	@Test
	public void testNullwithReferevce()
	{
		 Date   d= null;
		assertFalse(service.isNull(d));
		
	}
	@AfterAll
	public static void teardown()
	{
		System.out.println("teardown");
		service=null;
	}

}
