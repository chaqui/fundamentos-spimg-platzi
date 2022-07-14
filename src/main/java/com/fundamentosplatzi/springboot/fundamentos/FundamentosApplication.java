package com.fundamentosplatzi.springboot.fundamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithPropierties;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplatzi.springboot.fundamentos.entity.User;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;
import com.fundamentosplatzi.springboot.fundamentos.repository.UserRepository;

import lombok.extern.apachecommons.CommonsLog;
@CommonsLog
@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;

	private MyBean myBean;

	@Autowired
	private MyBeanWithPropierties myBeanWithPropierties;

	@Autowired
	private UserPojo userPojo;

	@Autowired
	private UserRepository userRepository;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		this.saveUserInDataBase();
	}

	private void clasesAnteriores(){
		componentDependency.saludar();
		myBean.saludar();
		log.info(myBeanWithPropierties.getCadena()); 
		log.info(userPojo.getEmail());
		log.error("Error de log");
	}

	private void saveUserInDataBase(){
		User user1 = new User("John","joh@domain.com",LocalDate.now());
		User user2 = new User("Julie","Julie@domain.com",LocalDate.now());
		User user3 = new User("Elizabeth","Elizabeth@domain.com",LocalDate.now());
		User user4 = new User("John","joh@domain.com",LocalDate.now());
		User user5 = new User("Olga","Olga@domain.com",LocalDate.now());
		User user6 = new User("Casimiro","Casimiro@domain.com",LocalDate.now());
		User user7 = new User("Rony","Rony@domain.com",LocalDate.now());
		User user8 = new User("Osbely","Osbely@domain.com",LocalDate.now());
		User user9 = new User("Rodelby","Rodelby@domain.com",LocalDate.now());
		User user10 = new User("Lucas","Lucas@domain.com",LocalDate.now());
		List<User> users = Arrays.asList(user1, user2,user3,user4,user5,user6,user7,user8,user9,user10);
		users.stream().forEach(userRepository::save);
	}
	
}
