//*************************************************************************
// BBReceptionist.java                       Author: Brandon Bocanegra
//
// Receptionist Program
// Due 2/18/24
// Write a program that lists the duty of a Receptionist 
// at a hospital
//*************************************************************************

public class BBReceptionist extends BBAdministrator
{
   protected boolean answering;
   
    //----------------------------------------------------------------
   //  Sets up this janitor with the specified information.
   //----------------------------------------------------------------- 
   public BBReceptionist (String empName, int empNumber, String sect, boolean ans)
   {
   
       super(empName, empNumber, sect);
       answering = ans;
   }
  
    //----------------------------------------------------------------- 
    //  Sets up task for this Receptionist.
   //-----------------------------------------------------------------
   public void setIsAnswering(boolean isA)
   {
        answering = isA;
   }
   //-----------------------------------------------------------------
   //  Gets action done for Receptionist
   //-----------------------------------------------------------------
   public boolean getIsAnswering()
   {
         return answering;
   }
    //-----------------------------------------------------------------
   //  Returns a description of this Receptionist and action as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
         return super.toString() + "\tAnswering:" + answering;
   }
   //-----------------------------------------------------------------
   //  Prints a message appropriate for this Receptionist.
   //-----------------------------------------------------------------
   public void answer()
   {
   System.out.print(name + " is");
   if(!answering)
   System.out.print("not");
   System.out.println(" answering the phone.");
   }
}