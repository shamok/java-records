package com.shayasit.recorddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecordDemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(RecordDemoApplication.class, args);

		EmpRecord empRecord1 = new EmpRecord(10, "Pankaj", 10000, null);
		EmpRecord empRecord2 = new EmpRecord(1, "John", 1000, null);

		// toString()
		System.out.println(empRecord1);

		// accessing fields
		System.out.println("Name: " + empRecord1.name());
		System.out.println("ID: " + empRecord1.id());

		// equals()
		System.out.println(empRecord1.equals(empRecord2));

		// hashCode()
		System.out.println(empRecord1 == empRecord2);

	}

}
