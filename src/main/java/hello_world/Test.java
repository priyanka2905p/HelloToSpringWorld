package hello_world;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

    public  void greet(){
        System.out.println("hiiiii");
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory b=new XmlBeanFactory(new ClassPathResource("bean.xml"));
       //  ((Test) b).greet();
        System.out.println("xml is loaded ");

    }
}
