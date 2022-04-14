package day31_Constructors.PracticeTasks.AddressTask;

public class Address {
    //TASK:
    /*
    Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;
		   	Add a constructor to set all the fields
		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
     */
    public String buildingNumber, street, city, state, zipCode;

    public Address(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    
    public String toString() {
        return buildingNumber+" "+street+"\n"+city+" "+state+", "+zipCode;
    }

}
