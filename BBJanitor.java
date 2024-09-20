//********************************************************************
// BBJanitor.java                       Author: Brandon Bocanegra
//
// Janitor Program
// Due 2/18/24
// Writes a program that lists the duty of a janitor at a 
// hospital 
//********************************************************************

public class BBJanitor extends BBAdministrator 
{
   protected boolean cleaning;
   
   //----------------------------------------------------------------
   //  Sets up this janitor with the specified information.
   //-----------------------------------------------------------------
   public BBJanitor(String empName,int empNumber, String sect, boolean cl)
   {
   
      super(empName, empNumber, sect);
      cleaning = cl;
   }
   
   //----------------------------------------------------------------- 
  //  Sets up task for this janitor.
   //-----------------------------------------------------------------
   public void setIsCleaning(boolean isC)
   {
      cleaning = isC;
   }
   //-----------------------------------------------------------------
   //  returns action done by this Receptionist.
   //-----------------------------------------------------------------

   public boolean getIsCleaning()
   {
      return cleaning;
   }
   //-----------------------------------------------------------------
   //  Returns a description of this Janitor and action as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return super.toString() + "\tCleaning:" + cleaning;
   }
   //-----------------------------------------------------------------
   //  Prints a message appropriate for this Janitor.
   //-----------------------------------------------------------------
   public void clean()
   {
      System.out.print(name + " is ");
      if(!cleaning)
         System.out.print("not");
      System.out.println(" cleaning the hospital.");
   }
}
