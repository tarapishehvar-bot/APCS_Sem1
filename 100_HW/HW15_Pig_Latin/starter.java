/*
   * Author: Tara Pishehvar
   * Date: 12/12/25
   * Collaborator(s):
*/		
	import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Sentence to Translate to Pig Latin: ");
		String word = sc.nextLine();
		System.out.println("Here's your sentence in Pig Latin!");
		while (word.indexOf(" ")>-1){
			int space  = word.indexOf(" ");
			String firstWord = word.substring(0,space);
			translate(firstWord);
			word = word.substring(space+1);
		}
		translate(word);
	}
		public static void translate(String firstWord){
			String letter  = firstWord.substring(0,1);
			boolean contains= letter.contains("a")||letter.contains("e")||letter.contains("i")||letter.contains("o")||letter.contains("u");
			
			if (contains){
				System.out.print(firstWord+"-way ");
			}
			else if (!contains){
				letter=firstWord.substring(1,2);
				contains= letter.contains("a")||letter.contains("e")||letter.contains("i")||letter.contains("o")||letter.contains("u");
				if (!contains){
					System.out.print(firstWord.substring(2)+"-"+firstWord.substring(0,2)+"ay ");
				}
				else {
					System.out.print(firstWord.substring(1)+"-"+firstWord.substring(0,1)+"ay ");
				}
			}
		}
}
