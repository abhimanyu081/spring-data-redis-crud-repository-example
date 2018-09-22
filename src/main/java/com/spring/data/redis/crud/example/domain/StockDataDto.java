package com.spring.data.redis.crud.example.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("stock")
public class StockDataDto {

	
	
	@Id
	private String companyId;
	private String segment;
	private String bseScripCode;
	private String companyShortName;
	private Integer bestBuyQty;
	private String nseScripCode;
	private BigDecimal fiftyTwoWeekLowPrice;
	private BigDecimal absoluteChange;
	private BigDecimal prevFiftyTwoWeekHighPrice;
	
	private String updatedDateTime;
	private String ticker;
	private String prevFiftyTwoWeekHighDateTime;
	private String comparedPriceDate;
	private String value;
	private BigDecimal current;
	private String sparklineURL;
	private String sectorName;
	private BigDecimal marketCap;
	private String companyType;
	private String companyTypeId;
	private String bargraphValue;
	private Integer eventCount;
	private BigDecimal comparedPrice;
	private BigDecimal prevFiftyTwoWeekLowPrice;
	private String bestBuyPrice;
	private Integer bestSellQty;
	private String companyName;
	private String prevFiftyTwoWeekLowDateTime;
	private String exchangeID;

	private BigDecimal fiftyTwoWeekHighPrice;
	private BigDecimal percentChange;
	private Integer volume;
	private Integer sectorId;
	private String listingExchange;
	private BigDecimal previousClose;
	private String companyName2;
	private BigDecimal high;
	private BigDecimal low;
	private String seoName;
	private String bestSellPrice;
	private String asiancercTicker;
	private String fiftytwoWeekHighDateTime;
	private String fiftytwoWeekLowDateTime;
	private String prevFiftytwoWeekHighDateTime;
	private String prevFiftytwoWeekLowDateTime;
	private BigDecimal highPercentGap;
	private BigDecimal lowPercentGap;
	private String marketCapType;

	private String industryId;
	private String industryName;

	private Boolean isPsu;
	private List<String> indexIds;
	private List<String> indexNames;
	private BigDecimal belowDaysHigh;
	private BigDecimal belowDaysHighPerChange;
	private BigDecimal aboveDaysLow;
	private BigDecimal aboveDaysLowPerChange;
	private Integer isTradedToday = 0;

	// for mongo
	private Date insertDate;
	private Date updatedDate;

	private BigDecimal volumeInThousand;

	/***
	 * For Periodic Gainers losers
	 */
	/**
	 * Close Prices by Duration
	 */
	private BigDecimal dayClosePrice;

	private BigDecimal weekClosePrice;
	private BigDecimal monthClosePrice;
	private BigDecimal month3ClosePrice;
	private BigDecimal month6ClosePrice;
	private BigDecimal yearClosePrice;

	/**
	 * Price change wrt to live Price
	 */
	private BigDecimal dayChange;
	private BigDecimal weekChange;
	private BigDecimal monthChange;
	private BigDecimal month3Change;
	private BigDecimal month6Change;
	private BigDecimal yearChange;

	/**
	 * Price Percentage change wrt to live Price
	 */
	private BigDecimal dayPerChange;
	private BigDecimal weekPerChange;
	private BigDecimal monthPerChange;
	private BigDecimal month3PerChange;
	private BigDecimal month6PerChange;
	private BigDecimal yearPerChange;

	private Date dayPriceDate;
	private Date weekPriceDate;
	private Date monthPriceDate;
	private Date month3PriceDate;
	private Date month6PriceDate;
	private Date yearPriceDate;
	
	private BigDecimal weekHighPrice;
	private BigDecimal monthHighPrice;
	private BigDecimal month3HighPrice;
	private BigDecimal month6HighPrice;
	private BigDecimal yearHighPrice;
	
	
	
	private BigDecimal weekLowPrice;
	private BigDecimal monthLowPrice;
	private BigDecimal month3LowPrice;
	private BigDecimal month6LowPrice;
	private BigDecimal yearLowPrice;

	/**
	 * Hourly Fields
	 * 
	 * @return
	 */

	private BigDecimal pricePrevHour;
	private String dateTimePrevHour;
	private BigDecimal perChangePrevHour;
	private BigDecimal changePrevHour;

	private BigDecimal price9_AM;
	private BigDecimal price10_AM;
	private BigDecimal price11_AM;
	private BigDecimal price12_PM;
	private BigDecimal price13_PM;
	private BigDecimal price14_PM;
	private BigDecimal price15_PM;
	private BigDecimal price16_PM;

	private BigDecimal change9_AM;
	private BigDecimal change10_AM;
	private BigDecimal change11_AM;
	private BigDecimal change12_PM;
	private BigDecimal change13_PM;
	private BigDecimal change14_PM;
	private BigDecimal change15_PM;
	private BigDecimal change16_PM;

	private BigDecimal perChange9_AM;
	private BigDecimal perChange10_AM;
	private BigDecimal perChange11_AM;
	private BigDecimal perChange12_PM;
	private BigDecimal perChange13_PM;
	private BigDecimal perChange14_PM;
	private BigDecimal perChange15_PM;
	private BigDecimal perChange16_PM;

	private String dateTime9_AM;
	private String dateTime10_AM;
	private String dateTime11_AM;
	private String dateTime12_PM;
	private String dateTime13_PM;
	private String dateTime14_PM;
	private String dateTime15_PM;
	private String dateTime16_PM;
	
	
	private String barGraphValue1W ;
	private String barGraphValue1M ;
	private String barGraphValue3M ;
	private String barGraphValue6M ;
	private String barGraphValue1Y ;
	
	private Double totalTradedValue;
	


	private Long noOfShares;
	
	
	
	public Long getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(Long noOfShares) {
		this.noOfShares = noOfShares;
	}

	public Double getTotalTradedValue() {
		return totalTradedValue;
	}

	public void setTotalTradedValue(Double totalTradedValue) {
		this.totalTradedValue = totalTradedValue;
	}

	public String getBarGraphValue1W() {
		return barGraphValue1W;
	}

	public void setBarGraphValue1W(String barGraphValue1W) {
		this.barGraphValue1W = barGraphValue1W;
	}

	public String getBarGraphValue1M() {
		return barGraphValue1M;
	}

	public void setBarGraphValue1M(String barGraphValue1M) {
		this.barGraphValue1M = barGraphValue1M;
	}

	public String getBarGraphValue3M() {
		return barGraphValue3M;
	}

	public void setBarGraphValue3M(String barGraphValue3M) {
		this.barGraphValue3M = barGraphValue3M;
	}

	public String getBarGraphValue6M() {
		return barGraphValue6M;
	}

	public void setBarGraphValue6M(String barGraphValue6M) {
		this.barGraphValue6M = barGraphValue6M;
	}

	public String getBarGraphValue1Y() {
		return barGraphValue1Y;
	}

	public void setBarGraphValue1Y(String barGraphValue1Y) {
		this.barGraphValue1Y = barGraphValue1Y;
	}

	public BigDecimal getWeekHighPrice() {
		return weekHighPrice;
	}

	public void setWeekHighPrice(BigDecimal weekHighPrice) {
		this.weekHighPrice = weekHighPrice;
	}

	public BigDecimal getMonthHighPrice() {
		return monthHighPrice;
	}

	public void setMonthHighPrice(BigDecimal monthHighPrice) {
		this.monthHighPrice = monthHighPrice;
	}

	public BigDecimal getMonth3HighPrice() {
		return month3HighPrice;
	}

	public void setMonth3HighPrice(BigDecimal month3HighPrice) {
		this.month3HighPrice = month3HighPrice;
	}

	public BigDecimal getMonth6HighPrice() {
		return month6HighPrice;
	}

	public void setMonth6HighPrice(BigDecimal month6HighPrice) {
		this.month6HighPrice = month6HighPrice;
	}

	public BigDecimal getYearHighPrice() {
		return yearHighPrice;
	}

	public void setYearHighPrice(BigDecimal yearHighPrice) {
		this.yearHighPrice = yearHighPrice;
	}

	public BigDecimal getWeekLowPrice() {
		return weekLowPrice;
	}

	public void setWeekLowPrice(BigDecimal weekLowPrice) {
		this.weekLowPrice = weekLowPrice;
	}

	public BigDecimal getMonthLowPrice() {
		return monthLowPrice;
	}

	public void setMonthLowPrice(BigDecimal monthLowPrice) {
		this.monthLowPrice = monthLowPrice;
	}

	public BigDecimal getMonth3LowPrice() {
		return month3LowPrice;
	}

	public void setMonth3LowPrice(BigDecimal month3LowPrice) {
		this.month3LowPrice = month3LowPrice;
	}

	public BigDecimal getMonth6LowPrice() {
		return month6LowPrice;
	}

	public void setMonth6LowPrice(BigDecimal month6LowPrice) {
		this.month6LowPrice = month6LowPrice;
	}

	public BigDecimal getYearLowPrice() {
		return yearLowPrice;
	}

	public void setYearLowPrice(BigDecimal yearLowPrice) {
		this.yearLowPrice = yearLowPrice;
	}

	public String getCompanyTypeId() {
		return companyTypeId;
	}

	public void setCompanyTypeId(String companyTypeId) {
		this.companyTypeId = companyTypeId;
	}

	public BigDecimal getPricePrevHour() {
		return pricePrevHour;
	}

	public void setPricePrevHour(BigDecimal pricePrevHour) {
		this.pricePrevHour = pricePrevHour;
	}

	public String getDateTimePrevHour() {
		return dateTimePrevHour;
	}

	public void setDateTimePrevHour(String dateTimePrevHour) {
		this.dateTimePrevHour = dateTimePrevHour;
	}

	public BigDecimal getPerChangePrevHour() {
		return perChangePrevHour;
	}

	public void setPerChangePrevHour(BigDecimal perChangePrevHour) {
		this.perChangePrevHour = perChangePrevHour;
	}

	public BigDecimal getChangePrevHour() {
		return changePrevHour;
	}

	public void setChangePrevHour(BigDecimal changePrevHour) {
		this.changePrevHour = changePrevHour;
	}

	public BigDecimal getChange9_AM() {
		return change9_AM;
	}

	public void setChange9_AM(BigDecimal change9_AM) {
		this.change9_AM = change9_AM;
	}

	public BigDecimal getChange10_AM() {
		return change10_AM;
	}

	public void setChange10_AM(BigDecimal change10_AM) {
		this.change10_AM = change10_AM;
	}

	public BigDecimal getChange11_AM() {
		return change11_AM;
	}

	public void setChange11_AM(BigDecimal change11_AM) {
		this.change11_AM = change11_AM;
	}

	public BigDecimal getChange12_PM() {
		return change12_PM;
	}

	public void setChange12_PM(BigDecimal change12_PM) {
		this.change12_PM = change12_PM;
	}

	public BigDecimal getChange13_PM() {
		return change13_PM;
	}

	public void setChange13_PM(BigDecimal change13_PM) {
		this.change13_PM = change13_PM;
	}

	public BigDecimal getChange14_PM() {
		return change14_PM;
	}

	public void setChange14_PM(BigDecimal change14_PM) {
		this.change14_PM = change14_PM;
	}

	public BigDecimal getChange15_PM() {
		return change15_PM;
	}

	public void setChange15_PM(BigDecimal change15_PM) {
		this.change15_PM = change15_PM;
	}

	public BigDecimal getChange16_PM() {
		return change16_PM;
	}

	public void setChange16_PM(BigDecimal change16_PM) {
		this.change16_PM = change16_PM;
	}

	public BigDecimal getPerChange9_AM() {
		return perChange9_AM;
	}

	public void setPerChange9_AM(BigDecimal perChange9_AM) {
		this.perChange9_AM = perChange9_AM;
	}

	public BigDecimal getPerChange10_AM() {
		return perChange10_AM;
	}

	public void setPerChange10_AM(BigDecimal perChange10_AM) {
		this.perChange10_AM = perChange10_AM;
	}

	public BigDecimal getPerChange11_AM() {
		return perChange11_AM;
	}

	public void setPerChange11_AM(BigDecimal perChange11_AM) {
		this.perChange11_AM = perChange11_AM;
	}

	public BigDecimal getPerChange13_PM() {
		return perChange13_PM;
	}

	public void setPerChange13_PM(BigDecimal perChange13_PM) {
		this.perChange13_PM = perChange13_PM;
	}

	public BigDecimal getPerChange14_PM() {
		return perChange14_PM;
	}

	public void setPerChange14_PM(BigDecimal perChange14_PM) {
		this.perChange14_PM = perChange14_PM;
	}

	public BigDecimal getPerChange15_PM() {
		return perChange15_PM;
	}

	public void setPerChange15_PM(BigDecimal perChange15_PM) {
		this.perChange15_PM = perChange15_PM;
	}

	public BigDecimal getPerChange16_PM() {
		return perChange16_PM;
	}

	public void setPerChange16_PM(BigDecimal perChange16_PM) {
		this.perChange16_PM = perChange16_PM;
	}

	public String getDateTime9_AM() {
		return dateTime9_AM;
	}

	public void setDateTime9_AM(String dateTime9_AM) {
		this.dateTime9_AM = dateTime9_AM;
	}

	public String getDateTime10_AM() {
		return dateTime10_AM;
	}

	public void setDateTime10_AM(String dateTime10_AM) {
		this.dateTime10_AM = dateTime10_AM;
	}

	public String getDateTime11_AM() {
		return dateTime11_AM;
	}

	public void setDateTime11_AM(String dateTime11_AM) {
		this.dateTime11_AM = dateTime11_AM;
	}

	public BigDecimal getPerChange12_PM() {
		return perChange12_PM;
	}

	public void setPerChange12_PM(BigDecimal perChange12_PM) {
		this.perChange12_PM = perChange12_PM;
	}

	public String getDateTime12_PM() {
		return dateTime12_PM;
	}

	public void setDateTime12_PM(String dateTime12_PM) {
		this.dateTime12_PM = dateTime12_PM;
	}

	public String getDateTime13_PM() {
		return dateTime13_PM;
	}

	public void setDateTime13_PM(String dateTime13_PM) {
		this.dateTime13_PM = dateTime13_PM;
	}

	public String getDateTime14_PM() {
		return dateTime14_PM;
	}

	public void setDateTime14_PM(String dateTime14_PM) {
		this.dateTime14_PM = dateTime14_PM;
	}

	public String getDateTime15_PM() {
		return dateTime15_PM;
	}

	public void setDateTime15_PM(String dateTime15_PM) {
		this.dateTime15_PM = dateTime15_PM;
	}

	public String getDateTime16_PM() {
		return dateTime16_PM;
	}

	public void setDateTime16_PM(String dateTime16_PM) {
		this.dateTime16_PM = dateTime16_PM;
	}

	public BigDecimal getPrice9_AM() {
		return price9_AM;
	}

	public void setPrice9_AM(BigDecimal price9_AM) {
		this.price9_AM = price9_AM;
	}

	public BigDecimal getPrice10_AM() {
		return price10_AM;
	}

	public void setPrice10_AM(BigDecimal price10_AM) {
		this.price10_AM = price10_AM;
	}

	public BigDecimal getPrice11_AM() {
		return price11_AM;
	}

	public void setPrice11_AM(BigDecimal price11_AM) {
		this.price11_AM = price11_AM;
	}

	public BigDecimal getPrice12_PM() {
		return price12_PM;
	}

	public void setPrice12_PM(BigDecimal price12_PM) {
		this.price12_PM = price12_PM;
	}

	public BigDecimal getPrice13_PM() {
		return price13_PM;
	}

	public void setPrice13_PM(BigDecimal price13_PM) {
		this.price13_PM = price13_PM;
	}

	public BigDecimal getPrice14_PM() {
		return price14_PM;
	}

	public void setPrice14_PM(BigDecimal price14_PM) {
		this.price14_PM = price14_PM;
	}

	public BigDecimal getPrice15_PM() {
		return price15_PM;
	}

	public void setPrice15_PM(BigDecimal price15_PM) {
		this.price15_PM = price15_PM;
	}

	public BigDecimal getPrice16_PM() {
		return price16_PM;
	}

	public void setPrice16_PM(BigDecimal price16_PM) {
		this.price16_PM = price16_PM;
	}

	public Boolean getIsPsu() {
		return isPsu;
	}

	public void setIsPsu(Boolean isPsu) {
		this.isPsu = isPsu;
	}

	public Integer getIsTradedToday() {
		return isTradedToday;
	}

	public void setIsTradedToday(Integer isTradedToday) {
		this.isTradedToday = isTradedToday;
	}

	public BigDecimal getDayClosePrice() {
		return dayClosePrice;
	}

	public void setDayClosePrice(BigDecimal dayClosePrice) {
		this.dayClosePrice = dayClosePrice;
	}

	public BigDecimal getWeekClosePrice() {
		return weekClosePrice;
	}

	public void setWeekClosePrice(BigDecimal weekClosePrice) {
		this.weekClosePrice = weekClosePrice;
	}

	public BigDecimal getMonthClosePrice() {
		return monthClosePrice;
	}

	public void setMonthClosePrice(BigDecimal monthClosePrice) {
		this.monthClosePrice = monthClosePrice;
	}

	public BigDecimal getMonth3ClosePrice() {
		return month3ClosePrice;
	}

	public void setMonth3ClosePrice(BigDecimal month3ClosePrice) {
		this.month3ClosePrice = month3ClosePrice;
	}

	public BigDecimal getMonth6ClosePrice() {
		return month6ClosePrice;
	}

	public void setMonth6ClosePrice(BigDecimal month6ClosePrice) {
		this.month6ClosePrice = month6ClosePrice;
	}

	public BigDecimal getYearClosePrice() {
		return yearClosePrice;
	}

	public void setYearClosePrice(BigDecimal yearClosePrice) {
		this.yearClosePrice = yearClosePrice;
	}

	public BigDecimal getDayChange() {
		return dayChange;
	}

	public void setDayChange(BigDecimal dayChange) {
		this.dayChange = dayChange;
	}

	public BigDecimal getWeekChange() {
		return weekChange;
	}

	public void setWeekChange(BigDecimal weekChange) {
		this.weekChange = weekChange;
	}

	public BigDecimal getMonthChange() {
		return monthChange;
	}

	public void setMonthChange(BigDecimal monthChange) {
		this.monthChange = monthChange;
	}

	public BigDecimal getYearChange() {
		return yearChange;
	}

	public void setYearChange(BigDecimal yearChange) {
		this.yearChange = yearChange;
	}

	public BigDecimal getDayPerChange() {
		return dayPerChange;
	}

	public void setDayPerChange(BigDecimal dayPerChange) {
		this.dayPerChange = dayPerChange;
	}

	public BigDecimal getWeekPerChange() {
		return weekPerChange;
	}

	public void setWeekPerChange(BigDecimal weekPerChange) {
		this.weekPerChange = weekPerChange;
	}

	public BigDecimal getMonthPerChange() {
		return monthPerChange;
	}

	public void setMonthPerChange(BigDecimal monthPerChange) {
		this.monthPerChange = monthPerChange;
	}

	public BigDecimal getMonth3PerChange() {
		return month3PerChange;
	}

	public void setMonth3PerChange(BigDecimal month3PerChange) {
		this.month3PerChange = month3PerChange;
	}

	public BigDecimal getMonth6PerChange() {
		return month6PerChange;
	}

	public void setMonth6PerChange(BigDecimal month6PerChange) {
		this.month6PerChange = month6PerChange;
	}

	public BigDecimal getYearPerChange() {
		return yearPerChange;
	}

	public void setYearPerChange(BigDecimal yearPerChange) {
		this.yearPerChange = yearPerChange;
	}

	public Date getDayPriceDate() {
		return dayPriceDate;
	}

	public void setDayPriceDate(Date dayPriceDate) {
		this.dayPriceDate = dayPriceDate;
	}

	public Date getWeekPriceDate() {
		return weekPriceDate;
	}

	public void setWeekPriceDate(Date weekPriceDate) {
		this.weekPriceDate = weekPriceDate;
	}

	public Date getMonthPriceDate() {
		return monthPriceDate;
	}

	public void setMonthPriceDate(Date monthPriceDate) {
		this.monthPriceDate = monthPriceDate;
	}

	public Date getMonth3PriceDate() {
		return month3PriceDate;
	}

	public void setMonth3PriceDate(Date month3PriceDate) {
		this.month3PriceDate = month3PriceDate;
	}

	public Date getMonth6PriceDate() {
		return month6PriceDate;
	}

	public void setMonth6PriceDate(Date month6PriceDate) {
		this.month6PriceDate = month6PriceDate;
	}

	public Date getYearPriceDate() {
		return yearPriceDate;
	}

	public void setYearPriceDate(Date yearPriceDate) {
		this.yearPriceDate = yearPriceDate;
	}

	public BigDecimal getMonth3Change() {
		return month3Change;
	}

	public void setMonth3Change(BigDecimal month3Change) {
		this.month3Change = month3Change;
	}

	public BigDecimal getMonth6Change() {
		return month6Change;
	}

	public void setMonth6Change(BigDecimal month6Change) {
		this.month6Change = month6Change;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public BigDecimal getBelowDaysHigh() {
		return belowDaysHigh;
	}

	public void setBelowDaysHigh(BigDecimal belowDaysHigh) {
		this.belowDaysHigh = belowDaysHigh;
	}

	public BigDecimal getBelowDaysHighPerChange() {
		return belowDaysHighPerChange;
	}

	public void setBelowDaysHighPerChange(BigDecimal belowDaysHighPerChange) {
		this.belowDaysHighPerChange = belowDaysHighPerChange;
	}

	public BigDecimal getAboveDaysLow() {
		return aboveDaysLow;
	}

	public void setAboveDaysLow(BigDecimal aboveDaysLow) {
		this.aboveDaysLow = aboveDaysLow;
	}

	public BigDecimal getAboveDaysLowPerChange() {
		return aboveDaysLowPerChange;
	}

	public void setAboveDaysLowPerChange(BigDecimal aboveDaysLowPerChange) {
		this.aboveDaysLowPerChange = aboveDaysLowPerChange;
	}

	public String getIndustryId() {
		return industryId;
	}

	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public List<String> getIndexIds() {
		return indexIds;
	}

	public void setIndexIds(List<String> indexIds) {
		this.indexIds = indexIds;
	}

	public List<String> getIndexNames() {
		return indexNames;
	}

	public void setIndexNames(List<String> indexNames) {
		this.indexNames = indexNames;
	}

	public String getMarketCapType() {
		return marketCapType;
	}

	public void setMarketCapType(String marketCapType) {
		this.marketCapType = marketCapType;
	}

	public BigDecimal getHighPercentGap() {
		return highPercentGap;
	}

	public void setHighPercentGap(BigDecimal highPercentGap) {
		this.highPercentGap = highPercentGap;
	}

	public BigDecimal getLowPercentGap() {
		return lowPercentGap;
	}

	public void setLowPercentGap(BigDecimal lowPercentGap) {
		this.lowPercentGap = lowPercentGap;
	}

	public String getFiftytwoWeekHighDateTime() {
		return fiftytwoWeekHighDateTime;
	}

	public void setFiftytwoWeekHighDateTime(String fiftytwoWeekHighDateTime) {
		this.fiftytwoWeekHighDateTime = fiftytwoWeekHighDateTime;
	}

	public String getFiftytwoWeekLowDateTime() {
		return fiftytwoWeekLowDateTime;
	}

	public void setFiftytwoWeekLowDateTime(String fiftytwoWeekLowDateTime) {
		this.fiftytwoWeekLowDateTime = fiftytwoWeekLowDateTime;
	}

	public String getPrevFiftytwoWeekHighDateTime() {
		return prevFiftytwoWeekHighDateTime;
	}

	public void setPrevFiftytwoWeekHighDateTime(String prevFiftytwoWeekHighDateTime) {
		this.prevFiftytwoWeekHighDateTime = prevFiftytwoWeekHighDateTime;
	}

	public String getPrevFiftytwoWeekLowDateTime() {
		return prevFiftytwoWeekLowDateTime;
	}

	public void setPrevFiftytwoWeekLowDateTime(String prevFiftytwoWeekLowDateTime) {
		this.prevFiftytwoWeekLowDateTime = prevFiftytwoWeekLowDateTime;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getCompanyShortName() {
		return companyShortName;
	}

	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}

	public Integer getBestBuyQty() {
		return bestBuyQty;
	}

	public void setBestBuyQty(Integer bestBuyQty) {
		this.bestBuyQty = bestBuyQty;
	}

	public String getNseScripCode() {
		return nseScripCode;
	}

	public void setNseScripCode(String nseScripCode) {
		this.nseScripCode = nseScripCode;
	}

	public BigDecimal getFiftyTwoWeekLowPrice() {
		return fiftyTwoWeekLowPrice;
	}

	public void setFiftyTwoWeekLowPrice(BigDecimal fiftyTwoWeekLowPrice) {
		this.fiftyTwoWeekLowPrice = fiftyTwoWeekLowPrice;
	}

	public BigDecimal getAbsoluteChange() {
		return absoluteChange;
	}

	public void setAbsoluteChange(BigDecimal absolutechange) {
		this.absoluteChange = absolutechange;
	}

	public BigDecimal getPrevFiftyTwoWeekHighPrice() {
		return prevFiftyTwoWeekHighPrice;
	}

	public void setPrevFiftyTwoWeekHighPrice(BigDecimal prevFiftyTwoWeekHighPrice) {
		this.prevFiftyTwoWeekHighPrice = prevFiftyTwoWeekHighPrice;
	}

	public String getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(String updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getPrevFiftyTwoWeekHighDateTime() {
		return prevFiftyTwoWeekHighDateTime;
	}

	public void setPrevFiftyTwoWeekHighDateTime(String prevFiftyTwoWeekHighDateTime) {
		this.prevFiftyTwoWeekHighDateTime = prevFiftyTwoWeekHighDateTime;
	}

	public String getComparedPriceDate() {
		return comparedPriceDate;
	}

	public void setComparedPriceDate(String comparedPriceDate) {
		this.comparedPriceDate = comparedPriceDate;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public BigDecimal getCurrent() {
		return current;
	}

	public void setCurrent(BigDecimal current) {
		this.current = current;
	}

	public String getSparklineURL() {
		return sparklineURL;
	}

	public void setSparklineURL(String sparklineURL) {
		this.sparklineURL = sparklineURL;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public BigDecimal getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(BigDecimal marketCap) {
		this.marketCap = marketCap;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getBargraphValue() {
		return bargraphValue;
	}

	public void setBargraphValue(String bargraphValue) {
		this.bargraphValue = bargraphValue;
	}

	public Integer getEventCount() {
		return eventCount;
	}

	public void setEventCount(Integer eventCount) {
		this.eventCount = eventCount;
	}

	public BigDecimal getComparedPrice() {
		return comparedPrice;
	}

	public void setComparedPrice(BigDecimal comparedPrice) {
		this.comparedPrice = comparedPrice;
	}

	public BigDecimal getPrevFiftyTwoWeekLowPrice() {
		return prevFiftyTwoWeekLowPrice;
	}

	public void setPrevFiftyTwoWeekLowPrice(BigDecimal prevFiftyTwoWeekLowPrice) {
		this.prevFiftyTwoWeekLowPrice = prevFiftyTwoWeekLowPrice;
	}

	public String getBestBuyPrice() {
		return bestBuyPrice;
	}

	public void setBestBuyPrice(String bestBuyPrice) {
		this.bestBuyPrice = bestBuyPrice;
	}

	public Integer getBestSellQty() {
		return bestSellQty;
	}

	public void setBestSellQty(Integer bestSellQty) {
		this.bestSellQty = bestSellQty;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPrevFiftyTwoWeekLowDateTime() {
		return prevFiftyTwoWeekLowDateTime;
	}

	public void setPrevFiftyTwoWeekLowDateTime(String prevFiftyTwoWeekLowDateTime) {
		this.prevFiftyTwoWeekLowDateTime = prevFiftyTwoWeekLowDateTime;
	}

	public String getExchangeID() {
		return exchangeID;
	}

	public void setExchangeID(String exchangeID) {
		this.exchangeID = exchangeID;
	}

	public BigDecimal getVolumeInThousand() {
		return volumeInThousand;
	}

	public void setVolumeInThousand(BigDecimal volumeInThousand) {
		this.volumeInThousand = volumeInThousand;
	}

	public BigDecimal getFiftyTwoWeekHighPrice() {
		return fiftyTwoWeekHighPrice;
	}

	public void setFiftyTwoWeekHighPrice(BigDecimal fiftyTwoWeekHighPrice) {
		this.fiftyTwoWeekHighPrice = fiftyTwoWeekHighPrice;
	}

	public BigDecimal getPercentChange() {
		return percentChange;
	}

	public void setPercentChange(BigDecimal percentChange) {
		this.percentChange = percentChange;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Integer getSectorId() {
		return sectorId;
	}

	public void setSectorId(Integer sectorId) {
		this.sectorId = sectorId;
	}

	public String getListingExchange() {
		return listingExchange;
	}

	public void setListingExchange(String listingExchange) {
		this.listingExchange = listingExchange;
	}

	public BigDecimal getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(BigDecimal previousClose) {
		this.previousClose = previousClose;
	}

	public String getCompanyName2() {
		return companyName2;
	}

	public void setCompanyName2(String companyName2) {
		this.companyName2 = companyName2;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public String getSeoName() {
		return seoName;
	}

	public void setSeoName(String seoName) {
		this.seoName = seoName;
	}

	public String getBestSellPrice() {
		return bestSellPrice;
	}

	public void setBestSellPrice(String bestSellPrice) {
		this.bestSellPrice = bestSellPrice;
	}

	public String getAsiancercTicker() {
		return asiancercTicker;
	}

	public void setAsiancercTicker(String asiancercTicker) {
		this.asiancercTicker = asiancercTicker;
	}

	public String getBseScripCode() {
		return bseScripCode;
	}

	public void setBseScripCode(String bseScripCode) {
		this.bseScripCode = bseScripCode;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "StockDataDto [segment=" + segment + ", bseScripCode=" + bseScripCode + ", companyShortName="
				+ companyShortName + ", bestBuyQty=" + bestBuyQty + ", nseScripCode=" + nseScripCode
				+ ", fiftyTwoWeekLowPrice=" + fiftyTwoWeekLowPrice + ", absoluteChange=" + absoluteChange
				+ ", prevFiftyTwoWeekHighPrice=" + prevFiftyTwoWeekHighPrice + ", companyId=" + companyId
				+ ", updatedDateTime=" + updatedDateTime + ", ticker=" + ticker + ", prevFiftyTwoWeekHighDateTime="
				+ prevFiftyTwoWeekHighDateTime + ", comparedPriceDate=" + comparedPriceDate + ", value=" + value
				+ ", current=" + current + ", sparklineURL=" + sparklineURL + ", sectorName=" + sectorName
				+ ", marketCap=" + marketCap + ", companyType=" + companyType + ", companyTypeId=" + companyTypeId
				+ ", bargraphValue=" + bargraphValue + ", eventCount=" + eventCount + ", comparedPrice=" + comparedPrice
				+ ", prevFiftyTwoWeekLowPrice=" + prevFiftyTwoWeekLowPrice + ", bestBuyPrice=" + bestBuyPrice
				+ ", bestSellQty=" + bestSellQty + ", companyName=" + companyName + ", prevFiftyTwoWeekLowDateTime="
				+ prevFiftyTwoWeekLowDateTime + ", exchangeID=" + exchangeID + ", fiftyTwoWeekHighPrice="
				+ fiftyTwoWeekHighPrice + ", percentChange=" + percentChange + ", volume=" + volume + ", sectorId="
				+ sectorId + ", listingExchange=" + listingExchange + ", previousClose=" + previousClose
				+ ", companyName2=" + companyName2 + ", high=" + high + ", low=" + low + ", seoName=" + seoName
				+ ", bestSellPrice=" + bestSellPrice + ", asiancercTicker=" + asiancercTicker
				+ ", fiftytwoWeekHighDateTime=" + fiftytwoWeekHighDateTime + ", fiftytwoWeekLowDateTime="
				+ fiftytwoWeekLowDateTime + ", prevFiftytwoWeekHighDateTime=" + prevFiftytwoWeekHighDateTime
				+ ", prevFiftytwoWeekLowDateTime=" + prevFiftytwoWeekLowDateTime + ", highPercentGap=" + highPercentGap
				+ ", lowPercentGap=" + lowPercentGap + ", marketCapType=" + marketCapType + ", industryId=" + industryId
				+ ", industryName=" + industryName + ", isPsu=" + isPsu + ", indexIds=" + indexIds + ", indexNames="
				+ indexNames + ", belowDaysHigh=" + belowDaysHigh + ", belowDaysHighPerChange=" + belowDaysHighPerChange
				+ ", aboveDaysLow=" + aboveDaysLow + ", aboveDaysLowPerChange=" + aboveDaysLowPerChange
				+ ", isTradedToday=" + isTradedToday + ", insertDate=" + insertDate + ", updatedDate=" + updatedDate
				+ ", volumeInThousand=" + volumeInThousand + ", dayClosePrice=" + dayClosePrice + ", weekClosePrice="
				+ weekClosePrice + ", monthClosePrice=" + monthClosePrice + ", month3ClosePrice=" + month3ClosePrice
				+ ", month6ClosePrice=" + month6ClosePrice + ", yearClosePrice=" + yearClosePrice + ", dayChange="
				+ dayChange + ", weekChange=" + weekChange + ", monthChange=" + monthChange + ", month3Change="
				+ month3Change + ", month6Change=" + month6Change + ", yearChange=" + yearChange + ", dayPerChange="
				+ dayPerChange + ", weekPerChange=" + weekPerChange + ", monthPerChange=" + monthPerChange
				+ ", month3PerChange=" + month3PerChange + ", month6PerChange=" + month6PerChange + ", yearPerChange="
				+ yearPerChange + ", dayPriceDate=" + dayPriceDate + ", weekPriceDate=" + weekPriceDate
				+ ", monthPriceDate=" + monthPriceDate + ", month3PriceDate=" + month3PriceDate + ", month6PriceDate="
				+ month6PriceDate + ", yearPriceDate=" + yearPriceDate + ", weekHighPrice=" + weekHighPrice
				+ ", monthHighPrice=" + monthHighPrice + ", month3HighPrice=" + month3HighPrice + ", month6HighPrice="
				+ month6HighPrice + ", yearHighPrice=" + yearHighPrice + ", weekLowPrice=" + weekLowPrice
				+ ", monthLowPrice=" + monthLowPrice + ", month3LowPrice=" + month3LowPrice + ", month6LowPrice="
				+ month6LowPrice + ", yearLowPrice=" + yearLowPrice + ", pricePrevHour=" + pricePrevHour
				+ ", dateTimePrevHour=" + dateTimePrevHour + ", perChangePrevHour=" + perChangePrevHour
				+ ", changePrevHour=" + changePrevHour + ", price9_AM=" + price9_AM + ", price10_AM=" + price10_AM
				+ ", price11_AM=" + price11_AM + ", price12_PM=" + price12_PM + ", price13_PM=" + price13_PM
				+ ", price14_PM=" + price14_PM + ", price15_PM=" + price15_PM + ", price16_PM=" + price16_PM
				+ ", change9_AM=" + change9_AM + ", change10_AM=" + change10_AM + ", change11_AM=" + change11_AM
				+ ", change12_PM=" + change12_PM + ", change13_PM=" + change13_PM + ", change14_PM=" + change14_PM
				+ ", change15_PM=" + change15_PM + ", change16_PM=" + change16_PM + ", perChange9_AM=" + perChange9_AM
				+ ", perChange10_AM=" + perChange10_AM + ", perChange11_AM=" + perChange11_AM + ", perChange12_PM="
				+ perChange12_PM + ", perChange13_PM=" + perChange13_PM + ", perChange14_PM=" + perChange14_PM
				+ ", perChange15_PM=" + perChange15_PM + ", perChange16_PM=" + perChange16_PM + ", dateTime9_AM="
				+ dateTime9_AM + ", dateTime10_AM=" + dateTime10_AM + ", dateTime11_AM=" + dateTime11_AM
				+ ", dateTime12_PM=" + dateTime12_PM + ", dateTime13_PM=" + dateTime13_PM + ", dateTime14_PM="
				+ dateTime14_PM + ", dateTime15_PM=" + dateTime15_PM + ", dateTime16_PM=" + dateTime16_PM
				+ ", barGraphValue1W=" + barGraphValue1W + ", barGraphValue1M=" + barGraphValue1M + ", barGraphValue3M="
				+ barGraphValue3M + ", barGraphValue6M=" + barGraphValue6M + ", barGraphValue1Y=" + barGraphValue1Y
				+ "]";
	}

	
	

	
}
