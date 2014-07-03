package com.joseprupi.otc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class GetOTC {
	
	public static void main(String args[]){
		
		OTCStock list = new OTCStock();
		Stock stock;
		ArrayList<String> tickers = list.getOTCList();
		PrintWriter writer;
		try {
			
			writer = new PrintWriter("otcInfo.csv", "UTF-8");
			writer.println("Ticker;Price;Volume;Average Daily Volume;P/E;EPS;Year Low;Year High;Day Low;Day High;50 Day Moving Av;Market Cap");
			
			for (int i = 0; i < tickers.size(); i++) {
				System.out.println(i);
				stock = StockFetcher.getStock(tickers.get(i));
				writer.println(tickers.get(i)+";"
						+ stock.getPrice()+";"
						+ stock.getVolume()+";"
						+ stock.getAverageDailyVolume()+";"
						+ stock.getPe()+";"
						+ stock.getEps()+";"
						+ stock.getWeek52low()+";"
						+ stock.getWeek52high()+";"
						+ stock.getDaylow()+";"
						+ stock.getDayhigh()+";"
						+ stock.getMovingav50day()+";"
						+ stock.getMarketcap());
				
			}
			
			writer.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
