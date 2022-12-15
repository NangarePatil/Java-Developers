package stringmethods;

public class StringUse 

{

	public static void main(String[] args) 
	
	{
		String s="Pune";
		String s1= new String ("Pune");
		//======================================================
		//length() method use
		String a="Velocity";
		System.out.println(a.length());
		int lengthOfString = a.length();
		System.out.println("String length is "+lengthOfString);
		
		String a1="Pune Katraj";
		System.out.println(a1.length());
		int outPut = a1.length();
		System.out.println("Length of String is "+outPut);
		System.out.println("=====================================");
		
		//======================================================
		//2. touppercase()
		//3. toLowerCase() method use
		String b="Pune";
		System.out.println(b.toUpperCase());
		String myString = b.toUpperCase();
		System.out.println("MyString is "+myString);
		String thisString = myString.toLowerCase();
		System.out.println("Lower case String is "+thisString);
		System.out.println("=====================================");
		
		
		//======================================================
		//equals() method use
		String c="Katraj";
		String c1="Katraj";
		String c2= new String("Katraj");
		String c3= new String("Katraj");
		String c4= new String("katraj");
		System.out.println(c==c1);
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c.equals(c1));
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c3.equals(c4));// case sensitive 
		System.out.println(c3.equalsIgnoreCase(c4));
		String c5="Mumbai";
		String c6=" Mumbai";
		System.out.println(c5.equals(c6));
		boolean result = c5.equals(c6);
		System.out.println("Result is "+result);
		System.out.println("=====================================");
		
		//======================================================
		// contains() method use
		String d="India";
		System.out.println(d.contains("Ind"));
		System.out.println(d.contains("ni"));
		System.out.println(d.contains("India"));
		System.out.println("=====================================");
		
		//======================================================
		// isEmpty() method use
		String e="Maharashtra";
		System.out.println(e.isEmpty());
		String e1=" ";
		System.out.println(e1.isEmpty());
		String e2="";
		System.out.println(e2.isEmpty());
		System.out.println("=====================================");
		
		//======================================================
		// isBlank() method use
		String e3="Bharat";
		System.out.println(e3.isBlank());
		String e4=" ";
		System.out.println(e4.isBlank());
		String e5="";
		System.out.println(e5.isBlank());
		String e6="a";
		System.out.println(e6.isBlank());
		System.out.println("=====================================");
		
		//======================================================
		// charAt() method use
		String f="Hi how are you";
		System.out.println(f.charAt(3));
		//System.out.println(f.charAt(-1));
		String f1=null;
		// System.out.println(f1.toUpperCase());
		System.out.println("=====================================");
		
		//======================================================
		// endsWith() and startsWith() method use
		String g="Katraj";
		System.out.println(g.endsWith("aj"));
		System.out.println(g.endsWith("Aj"));
		System.out.println(g.endsWith("Katraj"));
		System.out.println(g.endsWith("tj"));
		System.out.println(g.startsWith("Kat"));
		System.out.println(g.startsWith("at"));
		System.out.println(g.startsWith("tra", 2));
		System.out.println("=====================================");
		
		//======================================================
		// substring() method use
		String h="I LOVE MY INDIA";
		System.out.println(h.substring(10));
		System.out.println(h.substring(7));
		System.out.println(h.substring(7, 9));
		System.out.println("=====================================");
		
		//======================================================
		// concat() method use
		String i= "Velocity ";
		String i1="Corporate";
		System.out.println(i.concat(i1));
		System.out.println(i.concat(i1).concat(" Training Center"));
		String myOutput = i.concat(i1).concat(" Training Center");
		System.out.println(myOutput);
		System.out.println("=====================================");
		
		//======================================================
		// indexOf method use
		String j="Testing";
		System.out.println(j.indexOf('t'));
		String j1="Planning";
		System.out.println(j1.indexOf('n'));
		System.out.println(j1.lastIndexOf('n'));
		System.out.println(j1.indexOf('n', 4));
		System.out.println("=====================================");
		
		//======================================================
		// replace method use
		String k="Cooking";
		System.out.println(k.replace('o', 'a'));
		String k1="Velocity Corporate Training Center";
		System.out.println(k1.replace("t", "rr"));


	}

}
