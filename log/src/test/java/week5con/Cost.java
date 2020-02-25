package week5con;

import java.util.logging.Logger;



import java.util.Scanner; 
public class Cost {
void con()
{
	
  
   Logger logger=Logger.getLogger(Cost.class.getName());
   Scanner br = new Scanner(System.in); 
logger.info("Enter the area of in square feet : ");
      
      
      float area = br.nextFloat();
      logger.info("\nEnter \n 1.standard material \n 2.high quality material \n Enter the no. :  ");
      
      int ch1 = br.nextInt();
      logger.info("\nEnter \n 1.simple house \n 2.automated house \n Enter the no. :  ");

      int ch2 = br.nextInt();
      if (ch1 == 1 && ch2 == 1) {
        area = area * 1200;
        logger.info("\n Estimated cost for simple house with standard material "
            + "is" + " " + area + "INR");
      } else if (ch1 == 1 && ch2 == 2) {
        area = area * 1500;
        logger.info("\n Estimated cost for automated house with standard material is " + area + "INR");
      } else if (ch1 == 2 && ch2 == 1) {
        area = area * 1800;
        logger.info("\n Estimated cost for simple house with high quality material is " 
            + area + "INR");
      } else if (ch1 == 2 && ch2 == 2) {
        area = area * 2500;
        logger.info("\n Estimated cost for automated house with high quality material "
            + "is " + area + "INR");
      } else {
    	  logger.info(" INVALID OPTION ");
      }
      br.close();
      
    } 
    
  }

 
