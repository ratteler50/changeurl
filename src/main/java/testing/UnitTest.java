package testing;

public class UnitTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String input = "http://xkcd.com/1333/";
		String regex = "http://";
		String replace = "m.";
		
		System.out.println(input.replaceAll(regex, replace));

	}

}
