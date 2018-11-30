package com.example.currency.bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.currency.model.Currency;

public class CurrencyEx {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Currency> list;
	
	public CurrencyEx() {
		Currency MalaysianRinggit = new Currency ("USD", 0.24);
		Currency MalaysianRinggitA = new Currency ("EUR", 0.21);
		Currency MalaysianRinggitB = new Currency ("JPY", 27.10);
		
		list = new ArrayList<>();
		list.add(MalaysianRinggit);
		list.add(MalaysianRinggitA);
		list.add(MalaysianRinggitB);
		currenciesMap.put("MYR", list);
		
		Currency UnitedStatesDollar = new Currency ("MYR", 4.18);
		Currency UnitedStatesDollarA = new Currency ("EUR", 0.88);
		Currency UnitedStatesDollarB = new Currency ("JPY", 113.38);
		
		list = new ArrayList<>();
		list.add(UnitedStatesDollar);
		list.add(UnitedStatesDollarA);
		list.add(UnitedStatesDollarB);
		currenciesMap.put("USD", list);
		
		Currency Euro = new Currency ("MYR", 4.75);
		Currency EuroA = new Currency ("USD", 1.14);
		Currency EuroB = new Currency ("JPY", 128.73);
		
		list = new ArrayList<>();
		list.add(Euro);
		list.add(EuroA);
		list.add(EuroB);
		currenciesMap.put("EUR", list);
		
		Currency JapaneseYen = new Currency ("MYR", 0.037);
		Currency JapaneseYenA = new Currency ("USD", 0.0088);
		Currency JapaneseYenB = new Currency ("EUR", 0.0078);
		
		list = new ArrayList<>();
		list.add(JapaneseYen);
		list.add(JapaneseYenA);
		list.add(JapaneseYenB);
		currenciesMap.put("JPY", list);
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);
	}
}
