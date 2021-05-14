public class toPowerArray {
    public static int toPower(int size, int Power)  { 
        int pow = 1;
		for (int i = 1; i <= Power; i++)
			pow *= size;
		return pow;
    }
    public static void main(String[] args)
	{
		int []size = new int [] {1,2,3,4};
		int i, Power = 3;
		for (i = 0; i < size.length; i++){
		

		System.out.println(toPower(size[i], Power));
		}
	}
}
