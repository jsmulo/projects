package com.joemulo.trades.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joemulo.trades.helpers.SearchParams;
import com.joemulo.trades.models.Transaction;
import com.joemulo.trades.services.TransactionService;

@RestController
@RequestMapping(value="/api/trades")
public class ApiController {
	
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public List<Transaction> findAll(/*@RequestParam("sp")*/ @RequestBody HashMap<String, Object> mapper){
		String cusip = (String)mapper.get("cusip");
		String[] sDate = ((String)mapper.get("startDate")).split("-");
		String[] eDate = ((String)mapper.get("endDate")).split("-");
		LocalDate sd = LocalDate.of(Integer.parseInt(sDate[0]), Integer.parseInt(sDate[1]), Integer.parseInt(sDate[2]));
		LocalDate ed = LocalDate.of(Integer.parseInt(eDate[0]), Integer.parseInt(eDate[1]), Integer.parseInt(eDate[2]));
		
		System.out.println("CUSIP: " + cusip);
		System.out.println("Start Date: " + mapper.get("startDate"));
		System.out.println(mapper.get("endDate"));
		
				
		SearchParams sp = new SearchParams(cusip, sd, ed);
		//System.out.println("Params: " + sp);
		//return null;
		return transactionService.search(sp);
	}
	
	@RequestMapping(value="/{cusip}", method=RequestMethod.GET)
	public Transaction findOne(@PathVariable("cusip")String cusip){
		System.out.println("Params: " + cusip);
		return transactionService.findOne(cusip);
	}
}
