package com.hande.competitionproje.controller;

import com.hande.competitionproje.repository.entity.User;
import com.hande.competitionproje.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * localhost:9090/user/save
     * @return
     */


    }






    //@GetMapping("/saveall")
    //public ResponseEntity<String> saveall(){
       // userService.saveAll(new Datas().getUserList());
       // return ResponseEntity.ok("Users added.");
    //}
    //@GetMapping("/getall")
   // public ResponseEntity<List<User>> findAll(){
       // return ResponseEntity.ok(userService.findAll());
   // }
    //@PostMapping("/findbyid")
   // public ResponseEntity<User>findById(FindByIdRequestDto dto) {
      //  return ResponseEntity.ok(userService.findById(dto.getId()));
   // }