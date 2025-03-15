package com.question.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repository.QuestionRepository;
import com.question.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepository questionRespository;
	
	@Override
	public Question create(Question question) {
		
		return questionRespository.save(question);
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return questionRespository.findAll();
	}

	@Override
	public Question getById(long id) {
		// TODO Auto-generated method stub
		return questionRespository.findById(id)
				.orElseThrow(()->new RuntimeException("question not found"));
	}

	@Override
	public List<Question> getQuestionsOfQuiz(long quizId) {
		// TODO Auto-generated method stub
		//return questionRespository.findByQuizId(quizId);
		System.out.println("Fetching questions for quizId: " + quizId);
	    List<Question> questions = questionRespository.findByQuizId(quizId);
	    System.out.println("Questions found: " + questions.size());
	    return questions;
	}
	
	
	

}
