package find_minimum;

/**
 * Created with IntelliJ IDEA.
 * User: Sanks
 * Date: 13/05/15
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
public class FindMinimum {

    public static void main(String[] args){



    }


    public int findMin(){
        int minimumIndex=0;

        int[] array = {1,2,3,4,5};
        int length = array.length;

        for(int index=0; index<array.length; index++ ){
          if(array[index] < array[index+1]){
              minimumIndex = index;
          }

        }


        return minimumIndex;
    }

}
