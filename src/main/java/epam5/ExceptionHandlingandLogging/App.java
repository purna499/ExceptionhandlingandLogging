package epam5.ExceptionHandlingandLogging;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	@SuppressWarnings("unused")
	private static Scanner sc;
    public static void main( String[] args )
    {
    	int p=12000;
        double r=0.5;
        int t=3;
        int n=1;
        Compoundinterest obj1=new Compoundinterest(p,r,n,t);
        Simpleinterest obj2=new Simpleinterest(p,t,r);
        LOGGER.debug("compoundinterest of 12000 for 3years is : "+obj1.compoundinterest());
        LOGGER.debug("simpleinterest of 12000 for 3years is : "+obj2.simpleinterest());
        Constructioncost cost=new Constructioncost();
        LOGGER.debug("Enter house area");
        Scanner sc=new Scanner(System.in);
        int area=sc.nextInt();
        LOGGER.debug("choice 1:cost of material per square feet is 1200");
        LOGGER.debug("choice 2:cost of material per square feet is 1500");
        LOGGER.debug("choice 3:cost of material per square feet is 1800");
        LOGGER.debug("choice 4:cost of material per square feet is 2500");
        LOGGER.debug("Enter your choice:");
        int choice=sc.nextInt();
        LOGGER.debug("house construction cost is : "+cost.costofconstruction(area,choice));
        sc.close();
    }
}