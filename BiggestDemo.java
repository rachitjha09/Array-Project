
/**
 * Find the largest element in an array and return it.
 *
 * @author (Rachit Jha)
 * @version (1/5/23)
 */
public class BiggestDemo
{
    public static void main(String[]args){
        double[] a={6.7, 9.0, 0.0, 6.7};
        double d=biggestInArray(a);
        System.out.println("The biggest number in the aray is: " + d);
        double d2=smallestInArray(a);
        System.out.println("The smallest number in the aray is: " + d2);
        biggestAndSmallestInArray(a);
    }
    public static double biggestInArray(double[] data){
        double temp=data[0];
        for(int i=0; i<data.length; i++){
            if(data[i]>temp){
                temp=data[i];
            }
        }
        return temp;
    }
    public static double smallestInArray(double[] data){
        double temp=data[0];
        for(int i=0; i<data.length; i++){
            if(data[i]<temp){
                temp=data[i];
            }
        }
        return temp;
    }
    public static void biggestAndSmallestInArray(double[] data){
        double temp=data[0];
        double temp2=data[0];
        for(int i=0; i<data.length; i++){
            if(data[i]>temp){
                temp=data[i];
            }
            if(data[i]<temp2){
                temp2=data[i];
            }
        }
        System.out.println("Biggest is: " + temp + " and the smallest is " + temp2);
    }
}