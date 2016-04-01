package com.springapp.mvc.services;

import com.springapp.mvc.common.CategoryInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CategoryService {

    /**
     * Получаем категории для отображения в меню
     */
    public List<CategoryInfo> getCategories() {
        List<CategoryInfo> categories = new ArrayList<CategoryInfo>();
        List<CategoryInfo> bookCategories = new ArrayList<CategoryInfo>();
        bookCategories.add(new CategoryInfo(1L, "Tales", "lorem"));
        bookCategories.add(new CategoryInfo(2L, "Classic", "lorem"));
        bookCategories.add(new CategoryInfo(3L, "Adventure", "lorem"));
        bookCategories.add(new CategoryInfo(4L, "Romance", "lorem"));
        bookCategories.add(new CategoryInfo(5L, "Poetry", "lorem"));
        bookCategories.add(new CategoryInfo(6L, "Science", "lorem"));
        bookCategories.add(new CategoryInfo(7L, "Politics", "lorem"));
        bookCategories.add(new CategoryInfo(8L, "History", "lorem"));
        return bookCategories;
    }
}
