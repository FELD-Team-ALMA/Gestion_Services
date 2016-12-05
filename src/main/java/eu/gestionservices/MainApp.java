package eu.gestionservices;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

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
public class MainApp {

	static Logger log = LogManager.getLogger(MainApp.class.getName());

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");

		log.info("Going to create Systeme Obj");

		Systeme obj = (Systeme) context.getBean("systeme");

		log.info(obj.getMessage());

		log.info("Exiting the program");
	}
}