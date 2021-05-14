public class Maximum {
    public static void main(String[] args) { 
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];
    
        int index = 0;

        for (int i = 1; i<exampleArray.length ; i++){

        if (exampleArray[ i ] > maximum) {

        maximum = exampleArray[ i ];

        index = i;

        }

        }

    System.out.println(index);
    }
}
/*
//the output is the index/position of the largest number in the array. the largest number is 6 in position 2 of the array
output: 2
*/