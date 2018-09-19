/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */



// YOUR CODE GOES HERE :)
public class ASCIIArt {
	public static void main (String[] args) {
		
		honeyComb();
		rightBee();
		honeyComb();
		leftBee();
		honeyComb();
		rightBee();
		honeyComb();
		leftBee();
		honeyComb();
		rightBee();
		honeyComb();
		leftBee();
		

		
	}

	public static void honeyComb() {
		System.out.println(" __  __  __  __  __  __  __  __");
		System.out.println("/  \\/  \\/  \\/  \\/  \\/  \\/  \\/  \\");
		System.out.println("\\__/\\__/\\__/\\__/\\__/\\__/\\__/\\__/");
		
	}
	public static void rightBee() {
		System.out.println(" __  __  __  __  __  __   \"Bzzz\" ");
		System.out.println("/  \\/  \\/  \\/  \\/  \\/  \\   \\  / ");
		System.out.println("\\__/\\__/\\__/\\__/\\__/\\__/  _('') ");
		System.out.println("/  \\/  \\/  \\/  \\/  \\/  \\ (_\\  /_) ");
		System.out.println("\\__/\\__/\\__/\\__/\\__/\\__/   (==)");
		System.out.println("                           /  \\");
	}
	public static void leftBee() {
		System.out.println("  \"Bzzz\"   __  __  __  __  __  __");
		System.out.println("   \\  /   /  \\/  \\/  \\/  \\/  \\/  \\");
		System.out.println("  _('')_  \\__/\\__/\\__/\\__/\\__/\\__/");
		System.out.println(" (_\\  /_) /  \\/  \\/  \\/  \\/  \\/  \\");
		System.out.println("   (==)   \\__/\\__/\\__/\\__/\\__/\\__/");
		System.out.println("   /  \\ ");
	}
}