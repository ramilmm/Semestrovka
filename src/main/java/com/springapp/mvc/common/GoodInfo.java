package com.springapp.mvc.common;

import java.math.BigDecimal;

public class GoodInfo {

    /**
     * Good id
     */
    private Long id;

    /**
     * Good name
     */
    private String name;

    /**
     * Price
     */
    private BigDecimal cost;

    /**
     * Category
     */
    private CategoryInfo category;

    /**
     * Status(BestSeller,New arrival, etc.)
     */
    private String status;

    /**
     * Century
     */
    private Long century;

    /**
     * Author
     */
    private String author;

    /**
     * Country
     */
    private String country;

    /**
     * Count
     */
    private Long count;

    /**
     * Image URL
     */
    private String imageUrl;

    /**
     * Description
     */
    private String description;

    public GoodInfo() {
    }

    public GoodInfo(Long id, String name, BigDecimal cost, CategoryInfo category, String status, Long century, String author, String country, Long count, String imageUrl, String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.status = status;
        this.century = century;
        this.author = author;
        this.country = country;
        this.count = count;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecoratedName() {
        return "*** " + name + " ***";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CategoryInfo getCategory() {
        return category;
    }

    public void setCategory(CategoryInfo category) {
        this.category = category;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCentury() {
        return century;
    }

    public void setCentury(Long century) {
        this.century = century;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
