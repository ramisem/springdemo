import com.springdemo.aop.aopinterface.MarksCalc;
import com.springdemo.aop.bean.Student;
import com.springdemo.events.publisher.CustomEventPublisher;
import com.springdemo.oobannotations.AnnotaionsBean;
import com.springdemo.shapes.TriangleDefinedByPoints;
import com.springdemo.shapes.TriangleDefinedByPointsCollection;
import com.springdemo.shapes.TriangleDefinedByPointsList;
import com.springdemo.shapes.TriangleWithConstructorWiring;
import com.springdemo.shapes.points.TwoDimensionalPoint;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MainContoller {
    public static void main(String as[]){
//        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("E:\\SpringDemo\\src\\Spring.xml"));
//        Triangle triangle=(Triangle) factory.getBean("triangle");

//        ApplicationContext context= new ClassPathXmlApplicationContext("com/springdemo/shapes/ShapesBeanFactoryDef.xml");
//        TwoDimensionalPoint pointA=(TwoDimensionalPoint) context.getBean("pointA");
//        System.out.println(pointA.getX());

//        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
//        Triangle triangle=(Triangle) context.getBean("triangle");
//        triangle.draw();

//        ApplicationContext context= new ClassPathXmlApplicationContext("com/springdemo/shapes/ShapesBeanFactoryDef.xml");
//        TriangleDefinedByPoints triangle=(TriangleDefinedByPoints) context.getBean("triangledefinedbypoints");
//        triangle.draw();

//        ApplicationContext context= new ClassPathXmlApplicationContext("com/springdemo/shapes/ShapesBeanFactoryDef.xml");
//        TriangleDefinedByPointsList triangle=(TriangleDefinedByPointsList) context.getBean("triangledefinedbypointslist");
//        triangle.draw();

//        ApplicationContext context= new ClassPathXmlApplicationContext("com/springdemo/shapes/ShapesBeanFactoryDef.xml");
//        TriangleDefinedByPointsCollection triangle=(TriangleDefinedByPointsCollection) context.getBean("triangledefinedbypointscollection");
//        triangle.drawFromList();
//        triangle.drawFromMap();

//        ApplicationContext context= new ClassPathXmlApplicationContext("com/springdemo/shapes/ShapesBeanFactoryDef.xml");
//        TriangleWithConstructorWiring triangle=(TriangleWithConstructorWiring) context.getBean("trianglewithconstructorwiring");
//        triangle.draw();

//        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
//        DemoOfAwareInterfaces triangle=(DemoOfAwareInterfaces) context.getBean("demoofawareinterfaces");
//        triangle.draw();

//        ApplicationContext context= new ClassPathXmlApplicationContext("com/springdemo/events/SpringEventConfig.xml");
//        CustomEventPublisher customeventpublisher=(CustomEventPublisher) context.getBean("customeventpublisher");
//        customeventpublisher.publishCustomEvent();

//        ApplicationContext context= new ClassPathXmlApplicationContext("com/springdemo/oobannotations/AnnotationExmp.xml");
//        AnnotaionsBean annotaionsBean=(AnnotaionsBean) context.getBean("annotationsbean");
//        annotaionsBean.spellCheck();

        ApplicationContext context= new ClassPathXmlApplicationContext("com/springdemo/aop/aopconfig.xml");
//        Student student=(Student) context.getBean("student");
//        student.getAge();
//        student.getName();
        MarksCalc marksCalc=(MarksCalc) context.getBean("student");
        marksCalc.calcMarks();
        marksCalc.annotatedMethod();
    }

}
