package controllers.application;

import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author skuarch
 */
public class AuthenticationTest {
    
    public AuthenticationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Authentication method, of class Authentication.
     */
    @Test    
    public void testAuthentication() {
        System.out.println("Authentication");        
        String email = "";
        String password = "";
        HttpServletResponse response = null;
        Authentication instance = new Authentication();
        ModelAndView expResult = null;
        ModelAndView result = instance.Authentication(email, password, response);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
