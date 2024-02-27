package com.nt.tes;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.nt.BankService;

//@TestMethodOrder(MethodName.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.DisplayName.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.Random.class)
@DisplayName("test")
public class AppTest 
{
	
	public static BankService services;
	@BeforeAll
	public static void setup()
	
	{
		System.out.println("setup");
		services = new BankService();
		
		
	}
	@BeforeEach
	public void beforetest()
	{
		System.out.println("before test");
	}
	
	@Test
	@DisplayName("bigvalues")
	@Tag("uat")
	@Order(-3)
	public void testCalIntrestAmountBigvalues()
	{
		System.out.println("bigvalues");
		double expected=287999.0;
		
		double serv=services.CalIntrestAmount(1200000.0, 2.0, 12.0);
		assertEquals(expected,serv,1.0f);
		
	}
	@Test
	@Tag("test")
	@Tag("uat")
	@DisplayName("smallvalues")
	@Order(3)
	public void testCalIntrestAmountSmallvalues()
	{
		System.out.println("smallvalues");
		double expected=1200.0;
//		BankService service = new BankService();
		double serv=services.CalIntrestAmount(10000.0, 1.0, 12.0);
		assertEquals(expected,serv);
		
	}
	@Test
	@Tag("dev")
	@DisplayName("zeros")
	@Order(0)
	public void testCalIntrestAmountzeros()
	{
		System.out.println("zeros");
		
		
		assertThrows(IllegalArgumentException.class,()->{
			services.CalIntrestAmount(0, 0, 0);
		});
		
	}
//	public void testCalIntrestAmounttimer()
//	{
//		System.out.println("timer");
//		
//		
//		assertTimeout(Duration.ofMillis(30015),()->{
//			services.CalIntrestAmount(10000.0,1.0, 12.0);
//		});
//		
//	}
	
	@AfterEach
	public void aftertest()
	{
		System.out.println("AFTER test");
	}
	
	@AfterAll
	public static void teardown()
	{
		System.out.println("teardown");
		services=null;
	}

}
