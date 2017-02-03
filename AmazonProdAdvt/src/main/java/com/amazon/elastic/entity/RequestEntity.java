package com.amazon.elastic.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RequestEntity {
	
	private String ASIN;
	private String title;
	private double currentPrice;
	private double minPrice;
	private double averagePrice;
	private int timesCaptured;
	
	
	@JsonProperty("ASIN")
	public String getASIN() {
		return ASIN;
	}
	@JsonProperty("ASIN")
	public void setASIN(String aSIN) {
		ASIN = aSIN;
	}
	@JsonProperty("title")
	public String getTitle() {
	    return title;
	}
	@JsonProperty("title")
	public void setTitle(String title) {
	    title = title;
	}
	@JsonProperty("currentPrice")
	public double getCurrentPrice() {
		return currentPrice;
	}
	@JsonProperty("currentPrice")
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	@JsonProperty("minPrice")
	public double getMinPrice() {
		return minPrice;
	}
	@JsonProperty("minPrice")
	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}
	@JsonProperty("averagePrice")
	public double getAveragePrice() {
		return averagePrice;
	}
	@JsonProperty("averagePrice")
	public void setAveragePrice(double averagePrice) {
		this.averagePrice = averagePrice;
	}
	@JsonProperty("timesCaptured")
	public int getTimesCaptured() {
	    return timesCaptured;
	}
	@JsonProperty("timesCaptured")
	public void setTimesCaptured(int timesCaptured) {
	    this.timesCaptured = timesCaptured;
	}
	
	
	
}
