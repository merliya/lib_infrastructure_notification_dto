package com.jbhunt.infrastructure.edinotification.subscription.dto;

/**
 * Created by jcon928 on 6/11/2017.
 */
public class TradingPartnerResponse {

    private String tradingPartnerDescription;
    private String tradingPartnerCode;

    public String getTradingPartnerDescription() {
        return tradingPartnerDescription;
    }

    public void setTradingPartnerDescription(String tradingPartnerDescription) {
        this.tradingPartnerDescription = tradingPartnerDescription;
    }

    public String getTradingPartnerCode() {
        return tradingPartnerCode;
    }

    public void setTradingPartnerCode(String tradingPartnerCode) {
        this.tradingPartnerCode = tradingPartnerCode;
    }
}
