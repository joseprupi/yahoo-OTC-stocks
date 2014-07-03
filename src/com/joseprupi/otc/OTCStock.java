package com.joseprupi.otc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OTCStock {
	
	ArrayList<String> getOTCList() {

		try { 
			
			URL yahoo = new URL("http://www.otcbb.com/dynamic/tradingdata/download/allotcbb_otherotc.txt");
			URLConnection connection = yahoo.openConnection(); 
			InputStreamReader is = new InputStreamReader(connection.getInputStream());
			BufferedReader br = new BufferedReader(is);  
			
			String line = br.readLine();
			String[] tickerinfo;
			ArrayList<String> tickers = new ArrayList<String>();
			
			while((line = br.readLine()) != null){
				tickerinfo = line.split("\\|");
				tickers.add(tickerinfo[0]);
			} 
			
			return tickers;
		
		} catch (IOException e) {
			Logger log = Logger.getLogger(StockFetcher.class.getName()); 
			log.log(Level.SEVERE, e.toString(), e);
			return null;
		}
	
	}
}
