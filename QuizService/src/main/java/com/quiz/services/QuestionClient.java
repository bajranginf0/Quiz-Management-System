package com.quiz.services;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entities.Question;

//@FeignClient(url="http://localhost:9092",value="Question-Client")
@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClient   {

	@GetMapping("/question/quiz/{quizId}")
	List<Question> getQuestionOfQuiz(@PathVariable long quizId);
}
