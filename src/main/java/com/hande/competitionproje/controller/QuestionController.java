package com.hande.competitionproje.controller;

import com.hande.competitionproje.dto.request.AddQuestionRequestDto;
import com.hande.competitionproje.repository.entity.Question;
import com.hande.competitionproje.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

   final QuestionService questionService;

    @GetMapping("/addquestion")
    public ModelAndView addQuestion(){
        ModelAndView model = new ModelAndView();
        model.addObject("userId",1);
        model.setViewName("createquestion");
        return model;
    }

    @CrossOrigin
    @PostMapping(value = "/addquestion")
    public ModelAndView addQuestion(@RequestBody AddQuestionRequestDto dto){
        questionService.addQuestion(dto);
        return new ModelAndView("redirect:addquestion");
    }



}
