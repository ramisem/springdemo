import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DemoOfAwareInterfaces implements ApplicationContextAware {
    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        System.out.println("DemoOfAwareInterfaces: "+applicationContext.getStartupDate());
    }
}
