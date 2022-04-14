package day05_Concatenation;

/*
Create a class called ShippingAddress.java
2. Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
3. Use concatenation to print the full address
 */
public class ShippingAddress {
 public static void main(String[] args) {
   /* easy way to assign multiple variables with the same type:
 String name = "James King",
           buildingNumber = "11821B",
         streetName = "Jones Branch Dr",
    city = "McLean",
    state = "VA",
    zipCode = "22031A";
    */

  String name = "James King";
  String buildingNumber = "11821B";
  String streetName = "Jones Branch Dr";
  String city = "McLean";
  String state = "VA";
  String zipCode = "22031A";

  //System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

  String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

  System.out.println(address);
 }



}
