/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import financialmarketsimulator.MatchingEngine;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Madimetja
 */
public class MatchingEngineUnitTest 
{
    
    public MatchingEngineUnitTest() {
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //Test Object
    MatchingEngine matchingEngine;

    /*
     * Function  : constuctor
     * Input     : 
     * Process   : 
     * Output    : 
     * Speed     : 
     */
    @Test
    public void instantiation() {
        matchingEngine = new MatchingEngine();
    }
    
    /*
     * Function  : matchBidAndOffer()
     * Input     : 
     * Process   : 
     * Output    : 
     * Speed     : 
     */
    @Test
    public void matchBidAndOfferTest()
    {
        
    }
    
    /*
     * Function  : update()
     * Input     : 
     * Process   : - Should obeserve the relevant queue and 
     *               update the relevant views
     * Output    : 
     * Speed     : 
     */
    @Test
    public void updateTest()
    {
        matchingEngine = new MatchingEngine();
    }
}
