package day22_MultiDimensionalArray;

public class PracticeTask_Items {
    public static void main(String[] args) {
        //TASK:
        /*
        Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
         */
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        //MY SOLUTIONS:
        //Task1:
        for (String[] each_SingleDimension : items) {
            for (String each_Element : each_SingleDimension) {
                System.out.print(each_Element + "\t");
            }
            System.out.println();
        }

        //MUHTAR:
        /*
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }

         */

        System.out.println("------------------------------------------------");

        //Task2:
        for (String[] each1D : items) {
            for (int i = each1D.length - 1; i >= 0; i--) {
                System.out.print(each1D[i] + "\t");
            }
            System.out.println();
        }

        //MUHTAR:
        /*
         for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
         */

        System.out.println("------------------------------------------------");

        //Task3:
        for (int i = items.length - 1; i >= 0; i--) {
            for (String eachElement : items[i]) {
                System.out.print(eachElement + "\t");
            }
            System.out.println();
        }

        //MUHTAR:
        /*
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
         */

    


        
    }
}
