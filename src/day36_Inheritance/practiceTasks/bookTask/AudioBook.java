package day36_Inheritance.practiceTasks.bookTask;

public class AudioBook extends Book {
   /*
   Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()

    */

    public double length;
    public String narrator;

    public void listen(){
        System.out.println("Listening to audio book: " + title + ".");
    }

}
