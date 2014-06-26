package financialmarketsimulator;

import java.util.Queue;
import java.util.Stack;

/**
 *
 * @authors Madimetja Shika, Moeletji Semenya, Daniel Makgonta
 */
public abstract class MarketManager {

    private String stockName;
    private String stockType;
    private int totalNumberOfShares;
    private double stockMarketValue;
    private MatchingEngine matchingEngine;
    private Stack<MarketEntryAttempt> bidsStack;
    private Stack<MarketEntryAttempt> offerStack;

    /* Constructor */
    public MarketManager() {

    }
    
    public MarketManager(String sName, String sType, int numShares, double val)
    {
        this.stockName = sName;
        this.stockType = sType;
        this.totalNumberOfShares = numShares;
        this.stockMarketValue = val;
        matchingEngine = new MatchingEngine();
    }

    /* Acknowledgement of the bid being accepted by the market manager */
    public String acceptBid(Bid bid) {
        return "";
    }

    /* Acknowledgement of the offer being accepted by the market manager */
    public String acceptOffer(Offer offer) {
        return "";
    }

    /* Acknowledgement of the bid being removed by the market manager */
    public String removeBid(Bid bid) {
        return "";
    }

    /* Acknowledgement of the offer being removed by the market manager */
    public String removeOffer(Offer offer) {
        return "";
    }

    public void updateEngine() {

    }

    public void updateEntities() {

    }
}
