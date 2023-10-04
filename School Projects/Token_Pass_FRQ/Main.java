public class Main
{
	public static void main(String args[])
	{
		System.out.println("Part A");
		TokenPass tp = new TokenPass(4);
		tp.printInfo();
		
		System.out.println("\nPart B");
		tp.distributeCurrentPlayerTokens();
		tp.printInfo();
	}
}