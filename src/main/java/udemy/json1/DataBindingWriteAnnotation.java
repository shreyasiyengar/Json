package udemy.json1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.model.UdemyLecture;
import udemy.json.model.UdemyLecture.FREE_PREVIEW;
import udemy.json.model.UdemyLecture.QuizQuestion;

public class DataBindingWriteAnnotation {
	 public static void main(String[] args) {
		
		 ObjectMapper objectMapper = new ObjectMapper();
		 
		 UdemyLecture udemyLecture = new UdemyLecture();
		 udemyLecture.setId(1);
		 udemyLecture.setName("json udemy course");
//		 udemyLecture.setNameLine2("json name line 2");
		 udemyLecture.setDesc("json udemy course description");
		 udemyLecture.setEnabled(true);
		 udemyLecture.setIgnore("");
		 udemyLecture.setIgnore2("");
		 
		 QuizQuestion quizQuestion = udemyLecture. new QuizQuestion();
		 quizQuestion.setId(1);
		 quizQuestion.setQuestion("What is json ?");
		 quizQuestion.setAnswer("Json is a data interchange format");
		 
		 udemyLecture.getListQuestion().add(quizQuestion);
		 udemyLecture.setFree_preview(FREE_PREVIEW.FREE_PREVIEW_NOT_ENABLED);
		 
		 
		 try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyLecture));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
