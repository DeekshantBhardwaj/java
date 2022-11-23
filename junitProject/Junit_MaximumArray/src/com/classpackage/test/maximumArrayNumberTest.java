package com.classpackage.test;

import com.classpackage.maximamArrayNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After; //imports
import org.junit.Before;//imports
import org.junit.Test;//imports


public class maximumArrayNumberTest {
private maximamArrayNumber Maximumarraynumber; //creating the object of the class to calling the privious object class..



@Before       //this method basicacly using in the junit 
public void testlargestArray()//this means that  when the  value of the starting phase is  given by the user or in the programme
{
Maximumarraynumber=new maximamArrayNumber();
}
@After
public void teardown()throws Exception{ //after is also part of junit but their is one comdition that when the codition is done than the after works and give hime th value null
	Maximumarraynumber=null;
}
@Test //now we have to run the test case 
public void largesttest() {
	assertEquals(5,Maximumarraynumber.largest(new int[] {5,3}));//there we have to give condition which is says that array largest =5 and compare with array element{3,5}

} 

}