package com.app.quizApp.controller;

import com.app.quizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    //Required to create Quiz
    @Autowired
    private QuizService quizService;

    //Create a Quiz with random Questions
    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam int numOfQ,@RequestParam String title){
        return quizService.createQuiz(category,numOfQ,title);
    }
}
