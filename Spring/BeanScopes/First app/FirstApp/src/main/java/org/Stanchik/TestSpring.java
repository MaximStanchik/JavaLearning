package org.Stanchik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SingletonBean bean1 = context.getBean(SingletonBean.class);
        SingletonBean bean2 = context.getBean(SingletonBean.class);

        bean1.display();
        bean2.display();

        PrototypeBean bean1p = context.getBean(PrototypeBean.class);
        PrototypeBean bean2p = context.getBean(PrototypeBean.class);

        bean1.display();
        bean2.display();
    }
}
