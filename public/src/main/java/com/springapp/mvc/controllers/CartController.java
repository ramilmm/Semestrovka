package com.springapp.mvc.controllers;

import com.springapp.mvc.aspects.annotation.IncludeMenuInfo;
import mvc.services.CartService;
import mvc.services.GoodService;
import mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private CartService cartService;
    @Autowired
    private GoodService goodService;
    @Autowired
    private UserService userService;

    /**
     * Отображение содержимого корзины
     */
    @IncludeMenuInfo
    @RequestMapping
    public String renderCart() {

//        UsersInfo user = userService.getByLogin(request.getUserPrincipal().getName());
//        request.setAttribute("cart",cartService.getByUser(user));
        return "cart/cartPage";
    }

    /**
     * Добавление товара в корзину
     *
     * @param goodId id товара
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addInCart(Long goodId,Model model) {
//        Cart cart = new Cart();
//        GoodInfo good = goodService.getById(goodId);
//        cart.setGood_id(good);
//        cart.setCount(1L);
//        List<Cart> cartList = new ArrayList<Cart>();
//        if(request.getRemoteUser() != null) {
//            UsersInfo user = userService.getByLogin(request.getUserPrincipal().getName());
//            cart.setUser_id(user);
//            List<Cart> dbCart = cartService.getByUser(user);
//
//            for (Cart c : dbCart){
//                if(c.getGood_id().getId().equals(goodId)){
//                    model.addAttribute("cart",request.getSession().getAttribute("cart"));
//                    cart.setCount(c.getCount()+1);
//                    cartService.update(c);
//                }
//            }
//
//            cartService.addInCart(cart);
//        }else {
//            cartService.addInCart(request.getSession(),goodId, 1);
//        }
//        if(request.getRemoteUser() != null) {
//            UsersInfo user = userService.getByLogin(request.getUserPrincipal().getName());
//            cartService.addInCart(user.getId(), goodId, 1L);
//        }else {
//            cartService.addInCart(request.getSession(), goodId, 1);
//        }
//        request.setAttribute("cart",cartList);
//        model.addAttribute("cart",cartList);
//
//        int count=(Integer)request.getSession().getAttribute("cartCount");
//        request.getSession().setAttribute("cartCount",++count);
//        model.addAttribute("cartCount",++count);

        cartService.addInCart(request.getSession(),goodId,1);
        return "ok";
    }
//
//    @ResponseBody
//    @RequestMapping(value = "/delete", method = RequestMethod.POST)
//    public String deleteGood(Long goodId,Model model) {
//        List<GoodInfo> cart = (List<GoodInfo>) request.getAttribute("cart");
//        for (GoodInfo good : cart ){
//            if(good.getId().equals(goodId)){
//                cart.remove(good);
//            }
//        }
//        request.setAttribute("cart",cart);
//        return "ok";
//    }

}