package com.question.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.question.entities.Question;

@Service
public interface QuestionService {
	
	Question create(Question question);
	
	List<Question> get();
	
	Question getById(long id);
	
	List<Question> getQuestionsOfQuiz(long quizId);

}
