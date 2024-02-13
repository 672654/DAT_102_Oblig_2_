package Parantes;

import java.util.Stack;

public class Parantes_Sjekk {
//test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Parantessjekk	
		String a1 = " : hei) på deg  ";
		String a2 = "metode(){dette gjør metoden()}: ";
		String a3 = "metode(){det(te gjør metoden()}: ";
		
		String a4 = "{ [ ( ) ] } ";
		String a5 = "{ [ ( ) } ";
		String a6 = "[ ( ) ] } ";
		String a7 = "{ [ ( ] ) } ";
		System.out.println(a1+sjekkParantes(a1));
		System.out.println(a2+sjekkParantes(a2));
		System.out.println(a3+sjekkParantes(a3));
		System.out.println(a4+sjekkParantes(a4));
		System.out.println(a5+sjekkParantes(a5));
		System.out.println(a6+sjekkParantes(a6));
		System.out.println(a7+sjekkParantes(a7));
	}

	private static boolean sjekkParantes(String tekst) {
		char[] tab = tekst.toCharArray();
		Stack<Character> stabel = new Stack<>();

		for (char i : tab) {
			//Dersom første tegn er korrekt parantes pushes den til stack.
			if (i == '(' || i == '[' || i == '{') {
				stabel.push(i);
				
			} 
			else if (i == ')' || i == ']' || i == '}') {
				
				if (stabel.isEmpty()) {
					return false;
				}
				
				char top = stabel.pop();
				if ((i == ')' & top != '(') ||
					(i == ']' & top != '[') || 
					(i == '}' & top != '{')) 
				{
					return false;
				}
			}
		}
		return stabel.isEmpty();
	}
}
