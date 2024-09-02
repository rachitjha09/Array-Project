
/**
 * Demo of Array
 *
 * @author (Rachit Jha)
 * @version (1/3/2024)
 */
public class demo
{
    public static void printArray(int [] data){
        System.out.print("[ ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("]");
    }
    public static void swapFirstTwo(int [] data){
        int temp = data[0]; //temp = first value of array
        data[0] = data[1]; //first value takes second value; they are the same now
        data[1] = temp; // second value takes temp value; which was old first value
    }
    public static void swapFirstLast(int [] data){
        int x = data[0];
        int y = data.length - 1;
        data[0] = data[y];
        data[y] = x;
    }
    public static void main(String[]args){
        int [] gradesA = {100, 90, 46, 90, 80, 85, 85};
        printArray(gradesA);
        swapFirstTwo(gradesA);
        printArray(gradesA);
        swapFirstLast(gradesA);
        printArray(gradesA);
        /*int [] gradesB = new int[4];
        gradesB[0] = 90;
        gradesB[1] = 70;
        gradesB[3] = 100;
        gradesB[2] = 80;*/
    }
}

