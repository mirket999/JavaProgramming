package day18_NestedLoop;

public class PracticeTask_FrequencyOfCharacters {
    private static String result;

    public static void main(String[] args) {

        String str = "aabccdeef",
                unique = "";   //a


        for (int i = 0; i <= str.length()-1; i++) {
            char ch1 = str.charAt(i);
            int count = 0;
            for (int j = 0; j <= str.length()-1 ; j++) {
                 char ch2 = str.charAt(j);

                if (ch1==ch2) {
                  count++;
                }

            }
            if (count != 1 ) {
                continue;
            }

            unique+=ch1;

        }


        System.out.println("unique = " + unique);


        }


    }
