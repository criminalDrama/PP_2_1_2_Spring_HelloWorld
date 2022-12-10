import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean a = bean == bean2;
        System.out.println(a);
        Cat bean3 =
                (Cat) applicationContext.getBean("Cat");
        Cat bean4 =
                (Cat) applicationContext.getBean("Cat");
        boolean b = bean3 == bean4;
        System.out.println(b);
        System.out.println(bean.getMessage());
    }
}