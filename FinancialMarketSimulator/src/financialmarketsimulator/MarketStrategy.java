/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialmarketsimulator;

/**
 *
 * @author Madimetja
 */
public class MarketStrategy implements Trade {

    @SuppressWarnings("override")
    public MarketEntryAttempt makeOffer() {
        return null;
    }

    public MarketEntryAttempt makeBid() {
        return null;
    }

    public void retractBid() {

    }

    public void retractOffer() {

    }

    public void setStrategy(String strategy) {

    }

    public MarketEntryAttempt searchMarketEntryAttempt(MarketEntryAttempt entry) {
        return null;
    }

}
