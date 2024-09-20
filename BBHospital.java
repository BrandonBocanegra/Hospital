//********************************************************************
//  BBHospital.java       Author: Brandon Bocanegra
//
//  Hospital Program
//  Due 2/18/24
//  Writes a prgram that catalogues all hospital employees
//  and their duties respectively
//********************************************************************

public class BBHospital
{
   //-----------------------------------------------------------------
   //  Creates several objects from classes derived from
   //  HospitalEmployee.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      HospitalEmployee vito = new HospitalEmployee("Vito", 123);
      Doctor michael = new Doctor("Michael", 234, "Heart");
      Surgeon vincent = new Surgeon("Vincent", 645, "Brain", true);
      BBNurse sydney = new BBNurse("Sydney", 546, 5);
      BBAdministrator ryan = new BBAdministrator("Ryan", 432, "Organizing");
      BBJanitor eren = new BBJanitor("Eren", 321, "Maintaining", true);
      BBReceptionist emily = new BBReceptionist("Emily", 101, "Answering", true);
      
   //---------------------------------------------------
   //  Create the objects for 
   //  Nurse
   //  Administrator
   //  Receptionist
   //  Janitor
   //---------------------------------------------------
   
   
      // print the employees
      System.out.println(vito);
      System.out.println(michael);
      System.out.println(vincent);
      System.out.println(sydney);
      System.out.println(ryan);
      System.out.println(eren);
      System.out.println(emily);
   
   
      
   //---------------------------------------------------
   //  Create lines that would print the employees for
   //  Nurse
   //  Administrator
   //  Receptionist
   //  Janitor
   //---------------------------------------------------
   
   
      // invoke the specific methods of the objects
      vito.work();
      michael.diagnose();
      vincent.operate();
      sydney.help();
      ryan.direct();
      eren.clean();
      emily.answer();
   //---------------------------------------------------
   // Invoke the specific methods 
   //  Nurse
   //  Administrator
   //  Receptionist
   //  Janitor
   //---------------------------------------------------
   
   }
}
