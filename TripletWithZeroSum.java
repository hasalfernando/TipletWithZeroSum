public class TripletWithZeroSum {

    public static void main(String[] args){
        int[] array = {-3,0,4,5,3-1,1};
        boolean found = false; //To record whether a combination is found or not

        for (int i=0; i<array.length-2; i++)
        {
            for (int j=i+1; j<array.length-1; j++)
            {
                for (int k=j+1; k<array.length; k++)
                {
                    if (array[i]+array[j]+array[k] == 0)
                    {
                        System.out.print(array[i]+ " ");
                        System.out.print(array[j]+ " ");
                        System.out.print(array[k]+ " \n");
                        found = true;
                    }
                }
            }
        }

        //If no triplets with the sum of zero is not found
        if (!found)
            System.out.println("No element combination makes a sum of zero");

    }
}
