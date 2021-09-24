import org.springframework.context.support.ClassPathXmlApplicationContext;
import temp.convert.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner in = new Scanner(System.in);
        System.out.print("Input Celsius temperature: ");
        double temp = in.nextDouble();
        TempConverter converter = context.getBean("converter", TempConverter.class);
        System.out.println(converter.Convert(temp));
    }
}
