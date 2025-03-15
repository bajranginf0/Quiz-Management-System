package com.quiz.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.quiz.entities.Quiz;


@Service
public interface QuizService 
{
   
	//adding quiz
	Quiz add(Quiz quiz);
	
	//get all quiz
	List<Quiz> get();
	
	//get quiz by id
	Quiz get(Long id);
}
