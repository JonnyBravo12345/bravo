/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialmarketsimulator;

import java.util.Date;

/**
 *
 * @author Madimetja
 */
public class MarketEntryAttempt {
 
    protected double price;
    protected int numberOfShares;
    protected String participantName;
    protected Date date;
    protected String timeStamp;
    
    //Constructor
    public MarketEntryAttempt()
    {
        
    }
    
    public MarketEntryAttempt(double pr, int numShares, String name) {
        this.price = pr;
        this.numberOfShares = numShares;
        this.participantName = name;
        date = new Date();
        this.timeStamp = date.toString();
    }

    public double getPrice() {
        return this.price;
    }

    public int getNumberOfShares() {
        return this.numberOfShares;
    }

    public String getParticipantName() {
        return this.participantName;
    }

    public String getTimeStanp() {
        return this.timeStamp;
    }
    
    public void setPrice(double _price)
    {
        this.price = _price;
    }
    
    public void setNumberOfShares(int _numShares)
    {
        this.numberOfShares = _numShares;
    }
    
    public void setParticipantName(String _name)
    {
        this.participantName = _name;
    }
}
