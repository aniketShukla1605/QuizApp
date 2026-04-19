package com.app.quizApp.service;

import com.app.quizApp.model.Question;
import com.app.quizApp.model.Quiz;
import com.app.quizApp.repository.QuestionRepo;
import com.app.quizApp.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepo quizRepo;
    //to fetch Questions
    @Autowired
    private QuestionRepo questionRepo;

    //To create a random Quiz
    public ResponseEntity<String> createQuiz(String category, int numOfQ, String title) {

        List<Question> questions = questionRepo.findRandomQuestionsByCategory(category,numOfQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setCategory(category);
        quiz.setQuestions(questions);
        quizRepo.save(quiz);

        return new ResponseEntity<>("Question added successfully", HttpStatus.CREATED);
    }
}
