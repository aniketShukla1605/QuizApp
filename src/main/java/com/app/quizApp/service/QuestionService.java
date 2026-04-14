package com.app.quizApp.service;

import com.app.quizApp.model.Question;
import com.app.quizApp.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepo questionRepo;
    //All Questions
    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }
    //Specific Category of Questions
    public List<Question> getQuestionsByCategory(String category) { return questionRepo.findByCategory(category); }
}
