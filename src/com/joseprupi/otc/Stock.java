package com.joseprupi.otc;

public class Stock { 
	
	private String symbol; 
	private double price;
	private int volume;
	private int averageDailyVolume;
	private double pe;
	private double eps;
	private double week52low;
	private double week52high;
	private double daylow;
	private double dayhigh;
	private double movingav50day;
	private String marketcap;
	
	public Stock(String symbol, double price, int volume, int averageDailyVolume, double pe, double eps, double week52low,      
					double week52high, double daylow, double dayhigh, double movingav50day, String marketcap) {	
		this.symbol = symbol; 
		this.price = price;	
		this.volume = volume; 
		this.averageDailyVolume = averageDailyVolume;
		this.pe = pe; 
		this.eps = eps; 
		this.week52low = week52low; 
		this.week52high = week52high; 
		this.daylow = daylow; 
		this.dayhigh = dayhigh; 
		this.movingav50day = movingav50day; 
		this.marketcap = marketcap;
	} 
	
	public String getSymbol() { 
		return this.symbol;		
	} 
	
	public double getPrice() { 		
		return this.price;		
	} 
	
	public int getVolume() {    
		return this.volume;     
	}
	
	public int getAverageDailyVolume() {    
		return this.averageDailyVolume;     
	} 
 
	public double getPe() {    
		return this.pe;     
	} 
  
	public double getEps() { 
		return this.eps;     
	} 
  
	public double getWeek52low() {    
		return this.week52low;    
	} 
  
	public double getWeek52high() {  
		return this.week52high;    
	} 
  
	public double getDaylow() {    
		return this.daylow;    
	} 
  
	public double getDayhigh() {    
		return this.dayhigh;     
	} 
  
	public double getMovingav50day() {     
		return this.movingav50day;  
	} 
  
	public String getMarketcap() { 
		return this.marketcap;
	} 
}

