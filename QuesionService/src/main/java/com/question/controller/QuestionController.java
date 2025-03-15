package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	//create question
	@PostMapping
	public Question create(@RequestBody Question question) 
	{
		return questionService.create(question);
	}
	
	
	//get all question
	@GetMapping
	public List<Question> getAll()
	{
		return questionService.get();
	}
	
	
	//get question by id
	@GetMapping("{questionId}")
	public Question getById(@PathVariable long questionId)
	{
		return questionService.getById(questionId);
	}
	
	  @GetMapping("/quiz/{quizId}")
      public List<Question> getQuestionOfQuiz(@PathVariable long quizId)
      {
		return questionService.getQuestionsOfQuiz(quizId);
    	  
      }
	
}
