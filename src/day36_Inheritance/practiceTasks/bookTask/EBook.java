package day36_Inheritance.practiceTasks.bookTask;

public class EBook extends Book{
    /*
    Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
     */

    public String size;
    public int pages;

    public void readBook(){
        System.out.println("Reading " + title + " book.");
    }
}
