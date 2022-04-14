package day24_CustomMethods_Return;

public class PracticeTask_FrequencyOfWord {
    //TASK:
    /*
     create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
     */

    public static void main(String[] args) {
        String sentence = "Java java java python python",
                word = "java";

        int frequencyOfWord = frequencyOfWord(sentence, word);

        System.out.println("frequencyOfWord = " + frequencyOfWord);
    }


    public static int frequencyOfWord (String sentence, String word){
       int frequency = 0;
       //SOLUTION1:USING FOR-EACH LOOP + SPLIT METHOD:
       /* for (String eachWord : sentence.split(" ")) {
           if (eachWord.equalsIgnoreCase("java")){
               frequency++;
           }
        }
        */

       //SOLUTION2: USING FOR LOOP + replaceFirst METHOD:
      /*  for (int i = 0; i < sentence.length()-1; i++) {
            sentence = sentence.toLowerCase();
            if (sentence.contains("java")){
               sentence = sentence.replaceFirst("java", "");
                frequency++;
            }
        }

       */



        //SOLUTION3: USING FOR LOOP + SUBSTRING METHOD:
       for (int i = 0; i < sentence.length()-4; i++) {
            if (sentence.substring(i, i+4).equalsIgnoreCase("java")){
                frequency++;
            }
       }

        

        return frequency;
    }





}
