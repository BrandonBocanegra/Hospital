//******************************************************************************
// BBNurse.java                       Author: Brandon Bocanegra
//
// Nurse Program
// Due 2/18/24
// Writes a program that lists the duty of a nurse at a hospital
//******************************************************************************
public class BBNurse extends HospitalEmployee
{
   protected int numPatients;
   
    //-----------------------------------------------------------------
   //  Sets up this nurse with the specified information.
   //-----------------------------------------------------------------
   public BBNurse(String empName, int empNumber, int numPat)
   
   {
      super (empName, empNumber);
      numPatients = numPat;
   }
   
   //-----------------------------------------------------------------
   //  Sets up patients for this nurse.
   //-----------------------------------------------------------------
   public void setNumPatients(int pat) 
   {
      numPatients = pat;
   }
 
   //-----------------------------------------------------------------
   //  returns a number of patients for this nurse.
   //-----------------------------------------------------------------
   public int getNumPatients()  
   {
      return numPatients;
   }
   //-----------------------------------------------------------------
   //  Returns a description of this nurse and amount of patient as 
   //  a string.
   //-----------------------------------------------------------------
   public String toString()  
   {
      return super.toString() + " has " +  numPatients + " patients."; 
   }
   //-----------------------------------------------------------------
   //  Prints a message appropriate for this nurse.
   //-----------------------------------------------------------------
   public void help()  
   {
      System.out.println(name +  " is helping " + numPatients + " patients.");
   }
}