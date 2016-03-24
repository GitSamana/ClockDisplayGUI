// Name: Samana Shrestha
// Course: CS 102
// Assignment 3 PART III
// Date: 2nd October 2015
/* CODE DESCRIPTION:
 * TestClockDisplay is a procedural tester class for the ClockDisplay class.
 * It has a main method that uses the ClockDisplay class. It contains the 
 * interactive part of the Clock display app and gets input from the user.
 * 
 * It gives the user options to either display the time, change the time,
 * or quit the app.
 */

import javax. swing.*; // import statement

public class TestClockDisplay // class declaration
{
  // main method
  public static void main (String[] args){
    
    ClockDisplay disp = new ClockDisplay(); // creating new ClockDisplay object
    
    // variable decarations:
    String menuChoice; // string choice that the user inputs 
    
    int choice; // integer version of choice that the user inputs
    
    
    // do while loop to print out options to user and get input
    do {
      
      // getting input from user for what they want to do as a a string
      menuChoice = JOptionPane.showInputDialog
        ("<html>Welcome to the <b>European-style</b> clock display app!</html>\n"
           + "This app lets you:\n"
           + "<html><b>1</b>) <i>Display</i> the time </html>\n"
           + "<html><b>2</b>) <i>Fast forward</i> the time </html>\n"
           + "<html><b>3</b>) <i>Reset</i> the time </html>\n"
           + "<html><b>4</b>) <i>Quit</i>! </html>\n"
           + "<html>Enter your choice <b>number:</b></html>");
      
      // converting input string to integer
      choice = Integer.parseInt(menuChoice);
      
      // switch method called on choice 
      switch (choice){
        
        case 1: 
          
          // display time if choice is 1
          JOptionPane.showMessageDialog(null, disp.getTime());
          
          // break out of loop after executing choice
          break;
          
          
        case 2: 
          
          // prompt for value of minutes increment if choice is 2
          String advMinVal = JOptionPane.showInputDialog
          ("<html>How many <b>minutes</b> would you like to advance </html>\n"
             + "the clock by? \n");
          
          // converting input string into integer
          
          // integer version of user input for value to advance minutes field by
          int advVal = Integer.parseInt(advMinVal);
          
          // for loop to execute tick method advVal number of times
          for (int i = 0; i < advVal; i++)
          {
            disp.tick();
          }
          
          // display time
          JOptionPane.showMessageDialog(null, disp.getTime());
          
          // break out of loop after executing choice
          break;
          
          
        case 3: 
          
          // prompt for values of minutes and hours to reset to if choice is 3
          String nHrVal = JOptionPane.showInputDialog
          ("<html>What value would you like to set the <b>hours</b> field</html>\n"
             + "<html>to? <i>(value should be between 0 and 23) </i></html>\n");
          
          String nMinVal = JOptionPane.showInputDialog
            ("<html>What value would you like to set the <b>minutes</b> field</html>\n"
               + "<html>to? <i>(value should be between 0 and 59)</i></html>\n");
          
          // converting input string to integers
          
          // integer version of user input for new hour value
          int hrVal = Integer.parseInt(nHrVal); 
          
          // integer version of user input for new minute value
          int minVal = Integer.parseInt(nMinVal); 
          
          // resetting values of hours and minutes fields
          disp.setHours(hrVal);
          
          disp.setMinutes(minVal);
          
          // display time
          JOptionPane.showMessageDialog(null, disp.getTime());
          
          // break out of loop after executing choice
          break;
      } // end of switch   
    } // end of do loop
    
    while (choice != 4); // ending loop when the choice is 4
    
    // display goodbye message if choice is 4
    JOptionPane.showMessageDialog(null, "Thank you for using this clock app!\n"
                                    + "<html>See you again <u>soon</u>!</html>\n"
                                    + "Goodbye!\n");
  } // end of main method
  
} // end of class testClockDisplay