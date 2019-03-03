package za.ac.cput.projectone;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Ryan Petersen
* 217027806
* 3G
* Chapter 2 Question 2
* */
public class InterfaceTest
{
/**
* Rigorous Test :-)
*/
@Test
public void age()
{

    MyInterface mi = new AgeCalculator();
    int currentAge = mi.age(2019,1999);
    Assert.assertEquals(20,currentAge);
}
}
