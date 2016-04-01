package com.springapp.mvc.common;

public class CategoryInfo {

    /**
     * id категории
     */
    private Long id;

    /**
     * Название категории
     */
    private String name;


    /**
     * Category description
     */
    private String description;

    public CategoryInfo() {
    }

    public CategoryInfo(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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
}