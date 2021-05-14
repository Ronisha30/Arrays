public class sumOfArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] num = new int [] {7, 14, 3, 24, 50};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < num.length; i++) {  
           sum = sum + num[i];  
        }  
        System.out.println("The sum of the Array is: " + sum);  
    }  
}