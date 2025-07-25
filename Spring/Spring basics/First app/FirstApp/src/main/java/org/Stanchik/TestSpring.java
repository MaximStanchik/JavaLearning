package org.Stanchik;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) throws BeansException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testbean = context.getBean("testBean", TestBean.class);

        System.out.println(testbean.getName());

        context.close();
    }
}
