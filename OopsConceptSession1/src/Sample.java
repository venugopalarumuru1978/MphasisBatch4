import java.util.Scanner;

public class Sample {

	int n;
	
	void getVal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value ");
		n = sc.nextInt();
	}

	void printSquqreVal()
	{
		int sq = n*n;
		System.out.println(n + " Square Value is " + sq);
	}

	void printCubeVal()
	{
		int cb = n*n*n;
		System.out.println(n + " Cube Value is " + cb);
	}
	
	public static void main(String[] args) {
		Sample sm = new Sample();
		sm.getVal();
		sm.printSquqreVal();
		sm.printCubeVal();
	}
}
