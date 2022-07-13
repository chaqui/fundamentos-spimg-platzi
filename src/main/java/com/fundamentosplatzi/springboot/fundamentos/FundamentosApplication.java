package com.fundamentosplatzi.springboot.fundamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithPropierties;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplatzi.springboot.fundamentos.pojo.UserPojo;

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

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.saludar();
		log.info(myBeanWithPropierties.getCadena()); 
		log.info(userPojo.getEmail());
		log.error("Error de log");
	}

}
