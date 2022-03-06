package com.example.Java_Project_G7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProjectG7Application {



	public static void main(String[] args) {

		String path = "src/main/resources/Wuzzuf_Jobs.csv";
		SpringApplication.run(JavaProjectG7Application.class, args);

//		System.setProperty("hadoop.home.dir", "C:\\Hadoop");
//		DataProvider t = new DataProvider(path);
//		t.readcsv();




	}


}
