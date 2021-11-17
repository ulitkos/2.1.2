import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat cat1 = (Cat) applicationContext.getBean("cat");
        cat1.setMessage("zzzzz");

        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getMessage());




    }
}