//********************************************************************
//  StaffMember.java       Author: Lewis/Loftus
//
//  Represents a generic staff member.
//********************************************************************

abstract public class StaffMember
{
   public String name;
   public String address;
   public String phone;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this staff member using the specified
   //  information.
   //-----------------------------------------------------------------
   public StaffMember (String eName, String eAddress, String ePhone)
   {
      name = eName;
      address = eAddress;
      phone = ePhone;
   }

   //-----------------------------------------------------------------
   //  Returns a string including the basic employee information.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "Name: " + name + "\n";

      result += "Address: " + address + "\n";
      result += "Phone: " + phone;

      return result;
   }




   public void display(int order)
   {

	   	   if(order == 1)
	   	   {
	         String result = "Name: " + name + "\n";
			       result += "Address: " + address + "\n";
                      result += "Phone: " + phone;
             System.out.println(result);

	   	   }else if(order == 2)
	   	      {
	               String result = "Address:  " + address  + "\n";
				   			       result += "Name:" + name + "\n";
				                         result += "Phone: " + phone;
                   System.out.println(result);


	   		  }else if(order == 3)
	   		      {
	                 String result = " Phone: " + phone  + "\n";
					 				   			       result += "Name:" + name + "\n";
					 				                         result += "Address: " + address;
                        System.out.println(result);

	   			  }


   }
   //-----------------------------------------------------------------
   //  Derived classes must define the pay method for each type of
   //  employee.
   //-----------------------------------------------------------------
   public abstract double pay();
}
