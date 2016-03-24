// Name: Samana Shrestha
// Course: CS 102
// Assignment 3 PART II
// Date: 2nd October 2015
/* CODE DESCRIPTION:
 * ClockDisplay is an instantiable class with 4 instance methods:
 * 
 * i) tick: public method that takes no input parameters, which increments the
 * minutes display by calling the incrementCurrentValue method on the minutes 
 * object.
 * ii) setHours: public void method that takes in an integer and sets the hours
 * display to the value of the integer.
 * iii) setMinutes: public void method that takes in an integer and sets the
 * minutes display to the value of the integer.
 * iv) getTime: public method that returns the current time concatenated as a 
 * String in the format: 00:00.
 * 
 * This class uses DoubleDigit class and is called on in TestClockDisplay to 
 * make a clock display app.
 */


public class ClockDisplay //Class Declaration
{
  // variable declarations
  int hrValue, mnValue; // user input for new hour and minute values 
  
  // fields of type DoubleDigit declarations
  private DoubleDigit hours;  // represents the current hour (00 - 23)
  private DoubleDigit minutes; // represents the current minute (00 - 59)
  private final int NUM_HOURS = 23; // constant for the max value for hours
  private final int NUM_MINS = 59; // constant holding the max value for minutes
  
  
  // ClockDisplay constructor
  public ClockDisplay()
  {
    hours = new DoubleDigit(); // creating new DoubleDigit objects
    minutes = new DoubleDigit();
    hours.setUpperLimit(NUM_HOURS); // setting the values of the fields of the
    minutes.setUpperLimit(NUM_MINS);// new objects
  }
  
  // method tick to increase the value in minutes field
  public void tick()
  {
    minutes.incrementCurrentValue();
    
    minutes.getCurrentValue();
    
    if (minutes.getCurrentValue() == 0) // increasing the value of hours if  
    {                                   // the upperlimit for minutes is reached
      hours.incrementCurrentValue();
    }
  }
  
 
  // method to set the hours field to user-entered value
  public void setHours(int hrValue)
  {
    hours.setCurrentValue(hrValue);
  }
  
  
  // method to set the minutes field to user-entered value
  public void setMinutes(int mnValue)
  {
    minutes.setCurrentValue(mnValue);
  }
  
  // method to get the current time in desired format (00:00)
  public String getTime()
  {
    return hours.getDisplayValue() + ":" + minutes.getDisplayValue();
  } 
  
} // end of class ClockDisplay