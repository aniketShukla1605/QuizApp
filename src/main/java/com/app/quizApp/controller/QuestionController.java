package com.app.quizApp.controller;

import com.app.quizApp.model.Question;
import com.app.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    //All Questions
    @GetMapping("/allQuestions")
    public List<Question> allQuestions() {
        return questionService.getAllQuestions();
    }

    //Only for Specific category
    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    //Add a Question
    @PostMapping("/add")
    public String addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }
}
