package day36_Inheritance.practiceTasks.phoneTask;

public class Nokia extends Phone{
  /*
  Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
   */
  public void selfDefense(){
      System.out.println(brand+" "+model+" can be used for self defense");
  }

}
