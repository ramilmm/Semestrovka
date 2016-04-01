package com.springapp.mvc.controllers;

import com.springapp.mvc.aspects.annotation.IncludeMenuInfo;
import mvc.common.GoodInfo;
import mvc.common.MenuInfo;
import mvc.services.CatalogService;
import mvc.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private CatalogService catalogService;
    @Autowired
    private MenuService menuService;

    @IncludeMenuInfo
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String renderMain(ModelMap model) {
        List<GoodInfo> topGoods = catalogService.getTopGoodsForMain();
        List<MenuInfo> menu = menuService.getMainMenu();
        model.addAttribute("topGoods", topGoods);
        model.addAttribute("Menu",menu);
        return "main/main";
    }
}
