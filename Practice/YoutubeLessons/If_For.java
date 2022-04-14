package YoutubeLessons;

public class If_For {
    public static void main(String[] args) {
        //50 ve üzeri : geçti
        //40-49 : bütünleme
        //0-39 : Kaldı

        int not = 35;
        // UZUN YOL:
       /* if (not>=50){
            System.out.println("A");
        }

        if (not>=40 && not<50) {
            System.out.println("B");
        }

        if (not<40){
            System.out.println("C");
        }
*/
        //SHORT WAY:

        if (not>=50){
            System.out.println("A");
        } else if (not>=40) {
            System.out.println("B");
        } else {
            System.err.println("C");
        }

    }
}
