package za.ac.cput.projectone;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

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
    public void Test()
    {
        SortedArray sa = new SortedArray();
        List<Integer> theList  = sa.list();
        List<Integer> doeslistcontain = Arrays.asList(1, 28, 34, 55, 57, 67, 79, 100);
        assertThat(theList,is(doeslistcontain));

    }
}
