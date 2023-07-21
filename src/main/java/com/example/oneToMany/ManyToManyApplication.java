package com.example.oneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.oneToMany.entity.Library;
import com.example.oneToMany.entity.Student;
import com.example.oneToMany.repository.StudentRepo;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner
{
	@Autowired
	StudentRepo studrepo;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1=new Student("Arun");
		Student s2=new Student("Yash");
		
		Library l1=new Library("Wings of Fire");
		Library l2=new Library("Java for Beginners");
		Library l3=new Library("5 point someone");
		Library l4=new Library("3 mistakes of my life");
		Library l5=new Library("Revolution 2020");
		
		s1.getBooks().add(l1);
		s1.getBooks().add(l2);
		s1.getBooks().add(l3);
		s1.getBooks().add(l4);
		
		
		
		


		s2.getBooks().add(l5);
		s2.getBooks().add(l4);
		s2.getBooks().add(l2);
		s2.getBooks().add(l3);
		
		
		studrepo.save(s1);
		//studrepo.save(s2);
		
	}

}
