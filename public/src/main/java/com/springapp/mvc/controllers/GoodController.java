package com.springapp.mvc.controllers;

import mvc.common.GoodInfo;
import mvc.services.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

@Controller
@RequestMapping(value = "/good")
public class GoodController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private GoodService goodService;

    /**
     * Отображение карточки товара
     *
     * @param goodId id товара
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String renderGoodPage(@PathVariable("id") Long goodId) {
        request.setAttribute("good", goodService.getGood(goodId));
        return "good/goodPage";
    }

    /**
     * Получаем подробную информацию о товаре в JSON
     *
     * @param goodId id товара
     */
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GoodInfo getFullInfo(@PathVariable("id") Long goodId) {
        return new GoodInfo("BOOKk",new BigDecimal(91),null,"BestSeller",19L,"Pushkin","Russia",
                1L,"/images/books/Pushkin/book1.jpg","lorem");
    }
}
