package com.capgemini;

import java.util.Map;

import org.junit.jupiter.api.BeforeAll;

import com.capgemini.dao.MaterialsDAO;
import com.capgemini.service.MaterialService;
import com.capgemini.ui.PlaceMaterialController;
import com.capgemini.dto.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

	
	
	public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
      assertTrue( true );
    }
}
