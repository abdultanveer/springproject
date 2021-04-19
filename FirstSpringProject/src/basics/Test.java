package basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
	public static void main(String[] args) {
		//Student abdul = new Student();
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Student abdul =	(Student) beanFactory.getBean("studentbean"); //bean is a pojo class
		abdul.displayInfo();
	}

}
