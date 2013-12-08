package my.test.webapp.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationListenerBean implements
		ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (event instanceof ContextRefreshedEvent) {
			ApplicationContext applicationContext = ((ContextRefreshedEvent) event)
					.getApplicationContext();
			applicationContext.getBean(name)
			ApplicationContext appContext = new ClassPathXmlApplicationContext(
					"spring/config/BeanLocations.xml");
		}

	}

}
