package day36_Inheritance.practiceTasks.phoneTask;

public class Samsung extends Phone {
    /*
  Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
     */

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }


}
