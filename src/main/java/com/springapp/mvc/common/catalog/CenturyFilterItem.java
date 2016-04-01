package com.springapp.mvc.common.catalog;


import java.math.BigDecimal;

public class CenturyFilterItem {

    /**
     * Минимальная дата
     */
    private BigDecimal minDate;

    /**
     * Максимальная дата
     */
    private BigDecimal maxDate;

    /**
     * Кол-во товара
     */
    private Long count;

    public CenturyFilterItem() {
    }


    public CenturyFilterItem(BigDecimal minDate, BigDecimal maxDate, Long count) {
        this.minDate = minDate;
        this.maxDate = maxDate;
        this.count = count;
    }

    public BigDecimal getMinDate() {
        return minDate;
    }

    public void setMinDate(BigDecimal minDate) {
        this.minDate = minDate;
    }

    public BigDecimal getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(BigDecimal maxDate) {
        this.maxDate = maxDate;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
