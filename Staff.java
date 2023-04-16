//********************************************************************
//  Staff.java       Author: Lewis/Loftus
//
//  Represents the personnel staff of a particular business.
//********************************************************************
import java.util.ArrayList;
public class Staff
{

    public ArrayList<StaffMember> staffList;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the list of staff members.
   //-----------------------------------------------------------------
   public Staff ()
   {


       staffList = new ArrayList<StaffMember>();


       staffcount stCount = new staffcount();

      staffList.add(new Executive ("Sam", "123 Main Line","555-0469", "123-45-6789", 2423.07));
      stCount.execuiveCount = stCount.execuiveCount + 1;
	  stCount.totalCount = stCount.totalCount + 1;



      staffList.add(new Employee ("Carla", "456 Off Line",
         "555-0101", "987-65-4321", 1246.15));
         stCount.totalCount = stCount.totalCount + 1;

      staffList.add(new Employee ("Woody", "789 Off Rocker",
         "555-0000", "010-20-3040", 1169.23));
         stCount.totalCount = stCount.totalCount + 1;

      staffList.add(new Hourly ("Diane", "678 Fifth Ave.",
         "555-0690", "958-47-3625", 10.55));
         stCount.totalCount = stCount.totalCount + 1;

      staffList.add(new Volunteer ("Norm", "987 Suds Blvd.",
         "555-8374"));
         stCount.volunteerCount = stCount.volunteerCount + 1;
		 stCount.totalCount = stCount.totalCount + 1;

      staffList.add(new Volunteer ("Cliff", "321 Duds Lane",
         "555-7282"));

         stCount.volunteerCount = stCount.volunteerCount + 1;
		 stCount.totalCount = stCount.totalCount + 1;

       ((Executive)staffList.get(0)).awardBonus (500.00);

       ((Hourly)staffList.get(3)).addHours (40);
   }

   //-----------------------------------------------------------------
   //  Pays all staff members.
   //-----------------------------------------------------------------
   public void payday ()
   {
      double amount;

      for (int count=0; count < staffList.size(); count++)
      {
         System.out.println (staffList.get(count));

         amount = (staffList.get(count)).pay();  // polymorphic

         if (amount == 0.0)
            System.out.println ("Thanks!");
         else
            System.out.println ("Paid: " + amount);

         System.out.println ("-----------------------------------");
      }
   }

   public void displayStaffInfo(int order)
   {

	  for (int count=0; count < staffList.size(); count++)
      {

		  staffList.get(count).display(order);
      }

   }


}
