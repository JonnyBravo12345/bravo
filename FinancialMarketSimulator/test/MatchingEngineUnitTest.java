/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import financialmarketsimulator.Bid;
import financialmarketsimulator.MarketEntryAttempt;
import financialmarketsimulator.MatchingEngine;
import financialmarketsimulator.Offer;
import financialmarketsimulator.stack.*;
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
public class MatchingEngineUnitTest {

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
     * Process   : -This test creates mock bids and offers which will be pushed
     *              into the bids and offers stack respectively. Of the mock bids
     *              and offers created, one bid and one offer will be created to 
     *              match, while the others will not match. The trade function
     *              should then assess the stacks and return a match/trade in the
     *              first test, and should return nothing in the second test where
     *              none of the bids and offers.
     * Output    : 
     * Speed     : 
     */
    @Test
    @SuppressWarnings("CallToPrintStackTrace")
    public void tradeTest() {
        matchingEngine = new MatchingEngine();

        //Mock bid and offer stacks
        Stack bidStack = new Stack();
        Stack offerStack = new Stack();

        //Create mock bid and offer objects
        MarketEntryAttempt bid = null;
        MarketEntryAttempt offer = null;
        MarketEntryAttemptNode bidNode = null;
        MarketEntryAttemptNode offerNode = null;

        //************//
        //***TEST 1***//
        //************//
        //The bid and offer attemts that will match
        MarketEntryAttempt expectedBid = new MarketEntryAttempt();
        MarketEntryAttempt expectedOffer = new MarketEntryAttempt();
        MarketEntryAttemptNode expectedBidNode = new MarketEntryAttemptNode(expectedBid);
        MarketEntryAttemptNode expectedOfferNode = new MarketEntryAttemptNode(expectedOffer);

        //Push the expected bid and offer to the stack first
        try {
            bidStack.push(expectedBidNode);
            offerStack.push(expectedOfferNode);

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        //Push mock bids and offers to the stack
        for (int i = 0; i < 9; i++) {
            bid = new Bid();
            offer = new Offer();
            bidNode = new MarketEntryAttemptNode(bid);
            offerNode = new MarketEntryAttemptNode(offer);

            try {
                bidStack.push(bidNode);
                offerStack.push(offerNode);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        //Pop the first offer and bid. These should be a match as per the mock bids
        //and offers pushed. 
        try {
            bidNode = offerNode = null;
            bidNode = bidStack.pop();
            offerNode = offerStack.pop();
        } catch (EmptyException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        //Call matchingEngine.trade to perform the first test
        matchingEngine.trade();

        //Both assertEquals should return true
        assertEquals(expectedBidNode, bidNode);
        assertEquals(expectedOfferNode, offerNode);

        //************//
        //***TEST 2***//
        //************//
        //Push mock bids and offers to the stack
        for (int i = 0; i < 9; i++) {
            bid = new Bid();
            offer = new Offer();
            bidNode = new MarketEntryAttemptNode(bid);
            offerNode = new MarketEntryAttemptNode(offer);

            try {
                bidStack.push(bidNode);
                offerStack.push(offerNode);

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        //Call matchingEngine.trade to perform the second test
        matchingEngine.trade();

        //Both assertEquals should return false
        assertEquals(expectedBidNode, bidNode);
        assertEquals(expectedOfferNode, offerNode);

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
    public void updateTest() {
        
    }
}
