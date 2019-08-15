package com.example.demo.outside;

import com.example.demo.insidedemo.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Random;

@SpringBootApplication
public class DemoApplication {

	@Value("${env:ravi}")
	String env;

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
		String[] names = ctx.getBeanDefinitionNames();

		Arrays.sort(names);
		for(String name: names){
			System.out.println(name);
		}
		DemoApplication demoApplication = (DemoApplication) ctx.getBean("demoApplication");
		System.out.println("Reading env property value: "+demoApplication.env);

	}

	@Bean
	Person ravi(){
		return new Person();
	}



}

@Configuration
//@ConditionalOnMissingBean(name = "person")
class myconfig{

	@Bean
	Person someperson(){
		return new Person();
	}

}


/*

ComponentScan

@SpringbootApplication(contains componentscan).
XYZ PACKAGE-> THIS PACKAGE AND SUB PACKAGES

COM.EXAMPLE.DEMO.OUTSIDE->DEMOAPPLICATION
COM.EXAMPLE.DEMO.INSIDE->

<bean>
</bean>




 */
