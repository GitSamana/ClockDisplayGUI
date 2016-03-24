// Name: Samana Shrestha
// Course: CS 102
// Assignment 3 PART I
// Date: 2nd October 2015
/* CODE DESCRIPTION:
 * DoubleDigit is an instantiable class with 6 instance methods:
 * 
 * i) setUpperLimit: public void method that takes a whole number between 0 and 
 * 99 as an input parameter to set the upperLimit variable.
 * ii) getUpperLimit: public method that takes no input parameters and returns 
 * the current numeric value of the upperLimit variable.
 * iii) setCurrentValue: public void method that takes an int parameter to set
 * the currentValue variable to a two digit number.
 * iv) getCurrentValue: public method that takes no input parameters and returns
 * the current numeric value of currentValue.
 * v) getDisplayValue: public method that return currentValue as a two-digit
 * String 
 * vi) incrementCurrentValue: public method that increments the display value 
 * by one, rolling over to zero if the upperLimit is reached.
 * 
 * This class is called on in ClockDisplay and TestClockDisplay to make a 
 * clock display app.
 */

import java.text.*;  // import statement

public class DoubleDigit // class declaration
{
  // variable declarations
  private int upperLimit, currentValue;
  
  public int uLim, cVal; // user input variables for upperlimit and currentvalue
  
  // instance method to set the upperlimit value
  public void setUpperLimit(int uLim)
  {
    this.upperLimit = uLim;
  }
  
  // instance method to get the upperlimit value
  public int getUpperLimit()
  {
    return upperLimit;
  }
  
  // instance method to set the currentvalue
  public void setCurrentValue(int cVal)
  {
    this.currentValue = cVal;
  }
  
  
  // instance method to get the currentvalue
  public int getCurrentValue()
  {
    return currentValue;
  }
  
  
  // instance method to get the displayvalue in a two digit format
  public String getDisplayValue()
  {
    DecimalFormat df = new DecimalFormat("00");
    return df.format(currentValue);
  }
  
  
  // instance method to increase the currentvalue by 1, or to roll over to 0 
  // if upperlimit is reached
  public void incrementCurrentValue()
  {
    if (currentValue == upperLimit)
    {
      currentValue = 0; 
    }
    else
      currentValue++;
  }
  
  
  // initializing the fields for DoubleDigit at 0 each
  public DoubleDigit()
  {
    upperLimit= 0;
    currentValue = 0;
  }
  
  
  // main method to test the methods defined in this class
  public static void main(String[] args) {
    
    DoubleDigit obj = new DoubleDigit(); // creating a new DoubleDigit object
    
    obj.setUpperLimit(59);
    
    System.out.println(obj.getUpperLimit());
    
    obj.setCurrentValue(9);
    
    System.out.println(obj.getCurrentValue());
    
    obj.incrementCurrentValue();
    
    System.out.println(obj.getDisplayValue());
    
  } // end of main method
  
}// end of class DoubleDigit