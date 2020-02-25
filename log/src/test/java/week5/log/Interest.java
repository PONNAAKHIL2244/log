package week5.log;
import java.util .*;
import java.util.logging.Logger;

public class Interest
{
    void sim()
    
{
    	Logger logger=Logger.getLogger(Interest.class.getName());
    double pr, rate, t, sim,com;
    @SuppressWarnings("resource")
	Scanner sc=new Scanner (System. in);
   logger.info("Enter the amount:");
    pr=sc.nextDouble();
    logger.info("Enter the No.of years:");
    t=sc.nextDouble();
    logger.info("Enter the Rate of  interest");
    rate=sc.nextDouble();
    sim=(pr * t * rate)/100;
    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
    logger.info("Simple Interest="+sim);
    logger.info("Compound Interest="+com);
   }

	
}