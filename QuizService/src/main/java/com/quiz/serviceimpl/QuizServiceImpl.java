package com.quiz.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepositories;
import com.quiz.services.QuestionClient;
import com.quiz.services.QuizService;


@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizRepositories quizRespositories;
	
	@Autowired
	private QuestionClient questionClient;
	
	
	@Override
	public Quiz add(Quiz quiz) {
		return quizRespositories.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		
		List<Quiz> quizzes =quizRespositories.findAll();
		List<Quiz> newQuizList = quizzes.stream().map(quiz ->{
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		
	return newQuizList;
		
		//return quizRespositories.findAll();
	}

	@Override
	public Quiz  get(Long id) { 
		Quiz quiz=quizRespositories.findById(id).orElseThrow(()->new RuntimeException("Quiz not found"));
		quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
		return quiz;
		//return quizRespositories.findById(id).	orElseThrow(()->new RuntimeException("quiz not found"));
		}

}
