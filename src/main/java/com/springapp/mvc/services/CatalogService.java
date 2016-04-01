package com.springapp.mvc.services;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.catalog.CatalogFilterInfo;
import com.springapp.mvc.common.catalog.CenturyFilterItem;
import com.springapp.mvc.common.catalog.FilterItem;
import com.springapp.mvc.common.catalog.PriceFilterItem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Service
public class CatalogService {

    /**
     * Получение товаров по id категории
     *
     * @param categoryId id категории
     * @return список товаров
     */
    public List<GoodInfo> getGoodsByCategoryId(Long categoryId) {
        CategoryInfo category = new CategoryInfo(categoryId, "Other","lorem");
        List<GoodInfo> goods = new ArrayList<GoodInfo>();
        goods.add(new GoodInfo(1L,"Book1",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(2L,"Book2",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(3L,"Book3",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(4L,"Book4",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(5L,"Book5",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(6L,"Book6",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        return goods;
    }

    /**
     * Получаем продвигаемые товары для главной
     */
    public List<GoodInfo> getTopGoodsForMain() {
        CategoryInfo category = new CategoryInfo(1L, "BookCategory", "lorem");
        List<GoodInfo> goods = new ArrayList<GoodInfo>();
        goods.add(new GoodInfo(1L,"Book1",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(2L,"Book2",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(3L,"Book3",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(4L,"Book4",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(5L,"Book5",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        goods.add(new GoodInfo(6L,"Book6",new BigDecimal(25),category,"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem"));
        return goods;
    }

    /**
     * Получаем значения фильтров для каталога
     *
     * @param categoryId id категории
     */
    public CatalogFilterInfo getCatalogFilters(Long categoryId) {
        CatalogFilterInfo filterInfo = new CatalogFilterInfo();
        List<FilterItem> categories = new ArrayList<FilterItem>();
        categories.add(new FilterItem(11L, "Tales", 14));
        categories.add(new FilterItem(12L, "Classic", 2));
        categories.add(new FilterItem(13L, "Adventure", 2));
        categories.add(new FilterItem(14L, "Romance", 8));
        categories.add(new FilterItem(15L, "Poetry", 11));
        categories.add(new FilterItem(16L, "Science", 3));
        categories.add(new FilterItem(17L, "Politics", 3));
        categories.add(new FilterItem(18L, "History", 6));
        filterInfo.setCategories(categories);

        List<CenturyFilterItem> date = new ArrayList<CenturyFilterItem>();
        date.add(new CenturyFilterItem(new BigDecimal(20),new BigDecimal(21),7L));
        date.add(new CenturyFilterItem(new BigDecimal(19),new BigDecimal(20),50L));
        date.add(new CenturyFilterItem(new BigDecimal(18),new BigDecimal(19),15L));
        filterInfo.setDate(date);

        List<FilterItem> authors = new ArrayList<FilterItem>();
        authors.add(new FilterItem(22L,"Tolstoy",4));
        authors.add(new FilterItem(23L,"Dostoevsky",5));
        authors.add(new FilterItem(24L,"Putin",6));
        authors.add(new FilterItem(25L,"Gogol",7));
        authors.add(new FilterItem(26L,"Blok",8));
        filterInfo.setAuthors(authors);

        List<PriceFilterItem> prices = new ArrayList<PriceFilterItem>();
        prices.add(new PriceFilterItem(new BigDecimal(100), new BigDecimal(150), 15));
        prices.add(new PriceFilterItem(new BigDecimal(150), new BigDecimal(200), 16));
        prices.add(new PriceFilterItem(new BigDecimal(200), new BigDecimal(250), 3));
        prices.add(new PriceFilterItem(new BigDecimal(250), new BigDecimal(300), 8));
        prices.add(new PriceFilterItem(new BigDecimal(300), new BigDecimal(350), 7));
        prices.add(new PriceFilterItem(new BigDecimal(350), new BigDecimal(400), 1));
        filterInfo.setPrices(prices);

        return filterInfo;
    }
}
