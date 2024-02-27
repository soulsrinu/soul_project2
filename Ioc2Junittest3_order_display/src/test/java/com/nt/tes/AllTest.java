package com.nt.tes;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;



//@SelectPackages("com.nt")
@SelectClasses({AppTest.class,AppTest1.class})
@Suite

public class AllTest 
{

}
