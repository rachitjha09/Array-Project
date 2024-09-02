
/**
 * Demonstration of blue sheep algorithms
 *
 * @author (Rachit Jha)
 * @version (1/5/24)
 */
public class NoSevenDemo
{
    public static boolean no7(int[] data){
        for(int i=0; i<data.length; i++){
            if(data[i]==7){
                return false;
            } 
        }
        return true;
    }
    public static boolean all7(int[] data){
        for(int i=0; i<data.length; i++){
            if(data[i]!=7){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args){
        int []a={8, 5, 6, 9};
        int []b={8, 7, 4, 6};
        int []c={7, 7, 6, 7};
        int []d={7, 7, 7};
        System.out.println(no7(a));
        System.out.println(no7(b));
        System.out.println(no7(c));
        System.out.println(no7(d));
        System.out.println();
        System.out.println(all7(a));
        System.out.println(all7(b));
        System.out.println(all7(c));
        System.out.println(all7(d));
    }
}