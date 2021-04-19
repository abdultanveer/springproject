package basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import constructor.injection.Employee;


public class Test {
	public static void main(String[] args) {
		//Student abdul = new Student();
		
		 Resource r=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Employee s=(Employee)factory.getBean("employee");  
	        s.show(); 
		
		/*
		 * Resource resource = new ClassPathResource("applicationContext.xml");
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 * 
		 * //BeanFactory beanFactory = new XmlBeanFactory(resource); Student abdul =
		 * (Student) context.getBean("studentbean"); //bean is a pojo class
		 * abdul.displayInfo();
		 */
	}

}
