package com.hande.competitionproje.controller;

import com.hande.competitionproje.dto.request.DoLoginRequestDto;
import com.hande.competitionproje.dto.request.RegisterRequestDto;
import com.hande.competitionproje.repository.entity.User;
import com.hande.competitionproje.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @GetMapping("/register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }

    //https://localhost:9090/v1/login
    //"register"
    //https://localhost:9090/v1/register
    //"/register"
    //https://localhost:9090/register


    @PostMapping("/register")
    public ModelAndView register(RegisterRequestDto dto){
        boolean isRegister = userService.register(dto);
        ModelAndView model = new ModelAndView();
        if(isRegister){                                                                                                    //eğer kayıt olma başarılıysa kullanıcıyı login sayfasına yönlendir
            model.setViewName("redirect:/login");
        } else {
            model.addObject("error","Username already exists");
            model.setViewName("register");
        }
        return model;
    }

    @PostMapping("/login")
    public ModelAndView login(DoLoginRequestDto doLoginDto){                                                                           //username ve passwordu talep ediyoruz
        Optional<User> userOptional =  userService.doLogin(doLoginDto);                                                                  //burdaki dto yu userservice gönderiyoruz userservise de bunları alıp repositorye soruyor bu kullanıcı adı ve şifreye sahip useri bul diye
        ModelAndView modelAndView = new ModelAndView();
        if(userOptional.isEmpty()){                                                                                                       //userserviceden dönen optional boşsa tekrar giriş sayfasına atıyor setviewname("login")ile
            modelAndView.addObject("error","Username or password is wrong!");
            modelAndView.setViewName("login");
        }else{                                                                                                                            //eğer doluysa kullanıcı bilgilerini al user diye bi modelin içine koy ve kullanıcının kendi sayfasını aç
            modelAndView.addObject("user",userOptional.get());
            modelAndView.setViewName("user");
        }
        return modelAndView;
    }
}
