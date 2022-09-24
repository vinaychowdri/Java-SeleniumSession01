package javaprograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void removeDuplicate (String str) {
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for (Character character : set) {
			System.out.print(character);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String str="vinay java program";
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		removeDuplicate(str);
	}

}
