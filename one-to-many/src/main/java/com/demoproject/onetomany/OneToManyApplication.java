package com.demoproject.onetomany;

import com.demoproject.onetomany.model.Mark;
import com.demoproject.onetomany.model.Student;
import com.demoproject.onetomany.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=
				SpringApplication.run(OneToManyApplication.class, args);
		StudentRepository studentRepository=configurableApplicationContext.getBean(StudentRepository.class);

		Student student=new Student("praveen");
		Mark physicsPercentage=new Mark("95%physics",student);
		Mark chemistryPercentage=new Mark("90%chemistry",student);
		List<Mark>marks= Arrays.asList(physicsPercentage,chemistryPercentage);
		student.setMark(marks);
		studentRepository.save(student);
	}

}
