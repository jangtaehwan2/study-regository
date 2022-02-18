package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("Find Bean")
    public void findBeanTest() {
        String[] beanList = ac.getBeanDefinitionNames();
        for(String beanName : beanList) {
            Object bean = ac.getBean(beanName);
            System.out.println("bean : " + beanName + ", verbose : " + bean);
        }
    }

    @Test
    @DisplayName("Find Application Bean")
    public void findApplicationBeanTest() {
        String[] beanList = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanList) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("bean : " + beanDefinitionName + ", verbose : " + bean);
            }
        }
    }
}
