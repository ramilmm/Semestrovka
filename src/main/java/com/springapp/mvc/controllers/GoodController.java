package com.springapp.mvc.controllers;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;


@Controller
@RequestMapping(value = "/good", method = RequestMethod.GET)
public class GoodController {

    @Autowired
    private HttpServletRequest request;

    /**
     * Отображение карточки товара
     *
     * @param goodId id товара
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String renderGoodPage(@PathVariable("id") Long goodId) {
        request.setAttribute("goodId", goodId);
        return "good/goodPage";
    }

    /**
     * Получаем подробную информацию о товаре в JSON
     *
     * @param goodId id товара
     */
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)//, produces = MediaType.APPLICATION_JSON_VALUE)
    public GoodInfo getFullInfo(@PathVariable("id") Long goodId) {
        return  new GoodInfo(2L,"Book2",new BigDecimal(25),new CategoryInfo(5L,"Lalal","lorem"),"BestSeller",19L,"Alexandr Blok","Russia",100L,"/images/books/Blok1.jpg","lorem");

    }
}
