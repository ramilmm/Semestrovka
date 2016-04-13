package com.springapp.mvc.controllers;

import com.springapp.mvc.aspects.annotation.IncludeMenuInfo;
import com.springapp.mvc.form.RegistrationFormBean;
import com.springapp.mvc.mail.Sender;
import mvc.common.UsersInfo;
import mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping("/reg")
public class RegistrationController {

    public static final String ATTR_REGISTRATION_FORM = "regForm";

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private UserService userService;

    /**
     * Отображение страницы регистрации
     */
    @IncludeMenuInfo
    @RequestMapping(method = RequestMethod.GET)
    public String renderRegistrationPage() {
        if(request.getRemoteUser() != null){
            return "redirect:/";
        }
        request.setAttribute(ATTR_REGISTRATION_FORM, new RegistrationFormBean());
        return "registration/registrationPage";
    }

    /**
     * Обработка формы Регистрации
     * Отправка письма с ссылкой для подтверждения регистрации
     * Без подтвреждения регистрации пользователь не сможет авторизоваться
     */
    @IncludeMenuInfo
    @RequestMapping(method = RequestMethod.POST)
    public String registrationForm(
            @Valid @ModelAttribute(ATTR_REGISTRATION_FORM) RegistrationFormBean registrationFormBean,
            Model model,
            BindingResult bindingResult,
            String firstName,
            String lastName,
            String email,
            String password) {
        if (bindingResult.hasErrors()) {
            return "registration/registrationPage";
        }
        if(userService.getByLogin(email) != null){
            model.addAttribute("error","User with this email already exist");
            return "registration/registrationPage";
        }

        userService.add(new UsersInfo(email,md5Decoder(password),email,firstName+" "+lastName,"ROLE_USER"));
        Long user_id = userService.getByLogin(email).getId();
        Sender sender = new Sender("bookstoreitis@gmail.com","parolparol");
        sender.send("REGISTRATION","Вы прошли успешную регистрацию на сайте bookStore\n" +
                "Для подтверждения регистрации пройдте по ссылке : http://localhost:8081/reg/activate?id="+ user_id + "\n" +
                "Ваш логин : "+email,"bookstoreitis@gmail.com",email);

        System.out.println(registrationFormBean);
        return "redirect:/";
    }

    /**
     * Обработка ссылки активации
     * @param id - id пользователя,достаётся из url
     */
    @RequestMapping(value = "/activate",method = RequestMethod.GET)
    public String activateUser(Long id){
        UsersInfo user=userService.getById(id);
        user.setActive(true);
        userService.update(user);
        return "redirect:/login";
    }

    /**
     * MD5 хэширование пароля
     */
    private String md5Decoder(String password){
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        messageDigest.update(password.getBytes(),0, password.length());
        String hashedPass = new BigInteger(1,messageDigest.digest()).toString(16);
        if (hashedPass.length() < 32) {
            hashedPass = "0" + hashedPass;
        }
        return hashedPass;
    }
}
