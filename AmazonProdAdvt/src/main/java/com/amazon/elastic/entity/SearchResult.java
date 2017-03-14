package com.amazon.elastic.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchResult {
	
	private String ASIN;
	private String category;
	private double currentPrice;
	private double minPrice;
	private double averagePrice;
	private String title;
	private int timesCaptured;
	
	@JsonProperty("ASIN")
	public String getASIN() {
		return ASIN;
	}
	@JsonProperty("ASIN")
	public void setASIN(String aSIN) {
		ASIN = aSIN;
	}
	@JsonProperty("category")
	public String getCategory() {
	    return category;
	}
	@JsonProperty("category")
	public void setCategory(String category) {
	    this.category = category;
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
	@JsonProperty("title")
	public String getTitle() {
	    return title;
	}
	@JsonProperty("title")
	public void setTitle(String title) {
	    this.title = title;
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
