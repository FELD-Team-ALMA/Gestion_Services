package eu.gestionservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.gestionservices.components.Systeme;

/**
 * Classe principale pour faire des tests
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
@SpringBootApplication
public class MainApp {
    
    
    private static final Logger log = LoggerFactory.getLogger(MainApp.class);
	//static Logger log = LogManager.getLogger(MainApp.class.getName());

	public static void main(String[] args) {
	    
	    SpringApplication.run(MainApp.class);
	    
/*	     ApplicationContext context = 
                           new ClassPathXmlApplicationContext("Beans.xml");

           log.info("Going to create Systeme Obj");

           Systeme obj = (Systeme) context.getBean("systeme");

           log.info(obj.getMessage());

           log.info("Exiting the program");*/
	}



}