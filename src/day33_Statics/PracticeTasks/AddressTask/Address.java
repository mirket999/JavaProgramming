package day33_Statics.PracticeTasks.AddressTask;

public class Address {
    //Address Task:
    //		1. Create a class named Address:
    //
    //		    Attributes:
    //		        instance:  street, city, state, zipCode;
    //		        static: country, planet
    //
    //	        Add a constructor that can set All the fields (instances)
    //
    //		    Actions
    //		            setInfo: sets all the instances
    //		            toString: returns the address
    //		                        EX:
    //		                            7925 Jones Branch Dr
    //		                            McLean Va, 22012

    public String street, city, state;
    public int zipCode;

    public static String country = "USA";
    public static String planet = "World";

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return street + '\n' +
                 city + " " + state + ", " + zipCode;
    }
}
