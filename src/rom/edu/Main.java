package rom.edu;
/* @author   Romanyuk Bohdan
   @project   CourseTask5
   @class  Main
   @version  1.0.0
   @since 19.04.2021 - 20.15
  */

import javafx.beans.binding.Bindings;

public class Prefix {

    public static String prefix(String[] array) {
        String concatVal = "";
        char prefix = '0';

        for(int i = 0; i < array.length; i++){
            if(array.charAt == prefix){
                concatVal += prefix;
            } else {
                break;
            }
        }
        System.out.println(concatVal);
        return "";
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"} ;

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"} ;

        System.out.println(prefix(array2)); // abc