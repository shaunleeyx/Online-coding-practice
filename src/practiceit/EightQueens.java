/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceit;

/**
 *
 * @author Shaun
 */
import java.util.Arrays;
public class EightQueens{
    public static void main(String[] args){
        int[] array = new int[9];
        while(true){
            generatePiece(array);
            printBoard(array);
            System.out.println();
            if (isNotDiagonal(array)){
                printBoard(array);
                break;
            }
            else{
               Arrays.fill(array,0);
            }
        }
    }
    public static void generatePiece(int[] array){
        int temp2 = 0; // Switch variable
        for(int i = 0; i < 8; i++){
            while(array[i] == 0){
                int randomNum = i * 8 + 1 + (int)(Math.random()*8); // Spits out 1~8 and 9~18 depending on i
                //System.out.println(randomNum);
                int temp = 0; // Temporary variable
                for (int j = 0; j <= i; j++){
                    if((randomNum - array[j]) % 8 == 0){
                        temp = array[j];
                        break;
                    }
                }
                if((randomNum - temp)%8!=0){
                    //System.out.println(randomNum);
                    array[i] = randomNum;
                }
                else if(randomNum % 8 == 0 && temp2 == 0){
                    //System.out.println(randomNum);
                    array[i] = randomNum;
                    temp2++;
                }
            }
        }
    }
    public static boolean isNotDiagonal(int[] array){
        for (int i = 0; i < 8 - 1; i++){
            for (int j = i + 1; j < 8; j++){
                if((array[i] - array[j]) % 9 == 0 ){
                    return false;
                }
            }
            for (int j = i + 1; j < 8; j++){
                if((array[i] - array[j]) % 7 == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printBoard(int[] array){
        int counter = 0;
        int counter2 = 0;
        for (int i = 1; i <= 64; i++){
            System.out.print("|");
            if (i == array[counter2]){
                //System.out.println(counter2);
                System.out.print("X");
                counter2++;
            }
            else{
                System.out.print(" ");
            }
            counter++;
            if (counter % 8 == 0){
                System.out.print("|\n");
            }
        }
    }
}
