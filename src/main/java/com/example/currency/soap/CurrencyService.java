package com.example.currency.soap;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.currency.bus.CurrencyEx;
import com.example.currency.model.Currency;

@WebService
public class CurrencyService {
	CurrencyEx cc = new CurrencyEx();
	
	@WebMethod
	public ArrayList<Currency> getCurrencyResult (String denomination){
		return cc.getCurrencyResult(denomination);
	}
}
