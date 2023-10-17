import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean_two =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat_bean =
                (Cat) applicationContext.getBean("cat");
        Cat cat_bean_two =
                (Cat) applicationContext.getBean("cat");

        System.out.println(bean == bean_two);
        System.out.println(cat_bean == cat_bean_two);
    }
}