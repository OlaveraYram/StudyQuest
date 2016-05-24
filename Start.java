package hackMHSTextBasedEducationalAdventure;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPa
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sharonjin
 */
public class Start {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		// JOptionPane.showMessageDialog(null, "Welcome to Study Quest!");

		/*
		 * Frame myFrame = new JFrame("Study Quest"); ImageIcon a = new
		 * ImageIcon("/Users/Mary/Desktop/Sprites/grizzby sprite 1.png"); JLabel
		 * label = new JLabel(a); myFrame.add(label); myFrame.setSize(800,600);
		 * ((JFrame)
		 * myFrame).setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		 * myFrame.setVisible(true);
		 * 
		 * Frame myFrame1 = new JFrame("Study Quest"); JLabel label1 = new
		 * JLabel("Welcome!  Please enter your name after pressing [space].");
		 * myFrame1.add(label); myFrame1.setSize(800,600); ((JFrame)
		 * myFrame1).setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		 * myFrame1.setVisible(true);
		 */

		// Scanner temp00 = new Scanner(System.in);
		// String name00 = temp00.next();
		System.out.println("Welcome to Study Quest! Please enter your name after pressing [space].");
		Scanner temp = new Scanner(System.in);
		String name = temp.next();
		System.out.println("Hi " + name + "! Please enter 5 study terms, numbered 1 through 5.");

		Scanner term1 = new Scanner(System.in);
		Scanner term2 = new Scanner(System.in);
		Scanner term3 = new Scanner(System.in);
		Scanner term4 = new Scanner(System.in);
		Scanner term5 = new Scanner(System.in);
		String t1 = term1.next();
		String t2 = term2.next();
		String t3 = term3.next();
		String t4 = term4.next();
		String t5 = term5.next();
		System.out.println(
				"Please enter your definitions, numbered 6 through 10 (where 6 corresponds to 1, 7 corresponds to 2, etc.).");
		Scanner def1 = new Scanner(System.in);
		Scanner def2 = new Scanner(System.in);
		Scanner def3 = new Scanner(System.in);
		Scanner def4 = new Scanner(System.in);
		Scanner def5 = new Scanner(System.in);
		String d1 = def1.next();
		String d2 = def2.next();
		String d3 = def3.next();
		String d4 = def4.next();
		String d5 = def5.next();
		System.out.println("Press any letter/number and then [enter] to continue.  Get ready!");

		int n = (int) Math.floor(Math.random() * 5);

		int o = (int) Math.floor(Math.random() * 5);

		/*
		 * frame.add(new JLabel(new ImageIcon("Path/To/Your/Image.png")));
		 */

		Scanner temp0 = new Scanner(System.in);
		String name0 = temp0.next();
		System.out.println("You awaken in a dark cave.");
		Scanner temp1 = new Scanner(System.in);
		String name1 = temp1.next();
		System.out.println("Suddenly the entire cave lights up.");
		Scanner temp2 = new Scanner(System.in);
		String name2 = temp2.next();
		System.out.println(name + ": Huh?  How did I get here?");
		Scanner temp3 = new Scanner(System.in);
		String name3 = temp3.next();
		System.out.println("You look around and realize that the cave is covered in incandescant crystals.");
		Scanner temp4 = new Scanner(System.in);
		String name4 = temp4.next();
		System.out.println("You can now see a set of keys next to you, lying on the ground.");
		Scanner temp5 = new Scanner(System.in);
		String name5 = temp5.next();
		System.out.println("You pick them up and examine them closely.");
		Scanner temp6 = new Scanner(System.in);
		String name6 = temp6.next();
		System.out.println(name + ": Hmmm.  I wonder what these keys are for?");
		Scanner temp7 = new Scanner(System.in);
		String name7 = temp7.next();
		System.out.println(
				"Looking at the keys, you notice that each key has a different word on it, and is shaped differently.");
		Scanner temp8 = new Scanner(System.in);
		String name8 = temp8.next();
		System.out.println("Grizzby: Ahem.");
		Scanner temp9 = new Scanner(System.in);
		String name9 = temp9.next();
		System.out.println("Startled, you look up quickly.");
		Scanner temp10 = new Scanner(System.in);
		String name10 = temp10.next();
		System.out.println("A weird bear stands in front of you.");
		Scanner temp11 = new Scanner(System.in);
		String name11 = temp11.next();
		System.out.println(name + ": Ahhhh!");
		Scanner temp12 = new Scanner(System.in);
		String name12 = temp12.next();
		System.out.println("You jump backwards");
		Scanner temp13 = new Scanner(System.in);
		String name13 = temp13.next();
		System.out.println("Grizzby: Now that’s considered rude, in my culture, ya know.");
		Scanner temp14 = new Scanner(System.in);
		String name14 = temp14.next();
		System.out.println(name + ": What?");
		Scanner temp15 = new Scanner(System.in);
		String name15 = temp15.next();
		System.out.println(
				"Grizzby: What do you mean what?!  You screamed and jumped backwards!  You didn’t even introduce yourself first!");
		Scanner temp16 = new Scanner(System.in);
		String name16 = temp16.next();
		System.out.println("You are rather confused.");
		Scanner temp17 = new Scanner(System.in);
		String name17 = temp17.next();
		System.out.println(name + ": Um…");
		Scanner temp18 = new Scanner(System.in);
		String name18 = temp18.next();
		System.out.println(name + ": Sorry?");
		Scanner temp19 = new Scanner(System.in);
		String name19 = temp19.next();
		System.out.println("Grizzby: I guess it’s alright.  After all, you just awoke in a strange place.");
		Scanner temp20 = new Scanner(System.in);
		String name20 = temp20.next();
		System.out.println("That’s right.");
		Scanner temp21 = new Scanner(System.in);
		String name21 = temp21.next();
		System.out.println(name + ": My name's " + name + ".");
		Scanner temp22 = new Scanner(System.in);
		String name22 = temp22.next();
		System.out.println("Grizzby: Welcome, " + name + ".  My name is Grizzby.");
		Scanner temp23 = new Scanner(System.in);
		String name23 = temp23.next();
		System.out.println(name + ": Do you know where I am?");
		Scanner temp24 = new Scanner(System.in);
		String name24 = temp24.next();
		System.out.println("Grizzby: Actually, yes, I do--");
		Scanner temp25 = new Scanner(System.in);
		String name25 = temp25.next();
		System.out.println("You interrupt the bear.");
		Scanner temp26 = new Scanner(System.in);
		String name26 = temp26.next();
		System.out.println(name + ": Also what’s the deal with these keys?  They’ve all got weird names on them.");
		Scanner temp27 = new Scanner(System.in);
		String name27 = temp27.next();
		System.out.println(
				"Grizzby: *muttering* If you’d just let me finish…  Anyway, this place is called Cacaoffea.  The only people that are allowed in here are the people that have to study for an exam.");
		Scanner temp28 = new Scanner(System.in);
		String name28 = temp28.next();
		System.out.println("You remember suddenly that you had been studying for an exam before you came here.");
		Scanner temp29 = new Scanner(System.in);
		String name29 = temp29.next();
		System.out.println("Wait, but then how did you even get here?");
		Scanner temp30 = new Scanner(System.in);
		String name30 = temp30.next();
		System.out.println(
				"You were studying so devoutly!  You never would have left your house, even for an emergency!");
		Scanner temp31 = new Scanner(System.in);
		String name31 = temp31.next();
		System.out.println("Wait a second...");
		Scanner temp32 = new Scanner(System.in);
		String name32 = temp32.next();
		System.out.println("You were awfully tired…");
		Scanner temp33 = new Scanner(System.in);
		String name33 = temp33.next();
		System.out.println("Maybe you fell asleep while studying?");
		Scanner temp34 = new Scanner(System.in);
		String name34 = temp34.next();
		System.out.println("Oh well.");
		Scanner temp35 = new Scanner(System.in);
		String name35 = temp35.next();
		System.out.println("It doesn’t matter right now.");
		Scanner temp36 = new Scanner(System.in);
		String name36 = temp36.next();
		System.out.println("You only need to get out of here and go home.");
		Scanner temp37 = new Scanner(System.in);
		String name37 = temp37.next();
		System.out.println("Grizzby: Hello?");
		Scanner temp38 = new Scanner(System.in);
		String name38 = temp38.next();
		System.out.println(name + ": Oh, sorry.");
		Scanner temp39 = new Scanner(System.in);
		String name39 = temp39.next();
		System.out.println("Grizzby: Did you hear anything of what I was saying?");
		Scanner temp40 = new Scanner(System.in);
		String name40 = temp40.next();
		System.out.println(name + ": No...sorry…");
		Scanner temp41 = new Scanner(System.in);
		String name41 = temp41.next();
		System.out.println("You look down at your feet, ashamed.");
		Scanner temp42 = new Scanner(System.in);
		String name42 = temp42.next();
		System.out.println(
				"Grizzby: *sigh* Well, I suppose that it can’t be helped.  After all, you are in a weird place.");
		Scanner temp43 = new Scanner(System.in);
		String name43 = temp43.next();
		System.out.println(
				"Grizzby: I assume that you want to go home?  You probably want to finish your studying for your exam?");
		Scanner temp44 = new Scanner(System.in);
		String name44 = temp44.next();
		System.out.println("You nod in a way that fills you with determination.");
		Scanner temp45 = new Scanner(System.in);
		String name45 = temp45.next();
		System.out.println(
				"Grizzby: Alright, so here are the basics of what you need to do to get out of here.  You see the keys in your hand?");
		Scanner temp46 = new Scanner(System.in);
		String name46 = temp46.next();
		System.out.println("You nod again, not wanting to make Grizzby any more upset than they already seem.");
		Scanner temp47 = new Scanner(System.in);
		String name47 = temp47.next();
		System.out.println(
				"Grizzby: All you have to do is match the keys up with the doors all around this cave.  The words on the keys are all terms that you have to define.  The definitions are on the doors.");
		Scanner temp48 = new Scanner(System.in);
		String name48 = temp48.next();
		System.out.println(name + ": That sounds pretty easy!");
		Scanner temp49 = new Scanner(System.in);
		String name49 = temp49.next();
		System.out.println("Grizzby: Well, it can be…");
		Scanner temp50 = new Scanner(System.in);
		String name50 = temp50.next();
		System.out.println("Grizzby: It depends on how well you know the words.");
		Scanner temp501 = new Scanner(System.in);
		String name501 = temp501.next();
		System.out.println("There’s a long pause.");
		Scanner temp502 = new Scanner(System.in);
		String name502 = temp502.next();
		System.out.println("Grizzby: Oh yeah!  I forgot to tell you something important!");
		Scanner temp51 = new Scanner(System.in);
		String name51 = temp51.next();
		System.out.println(name + ": What is it?");
		Scanner temp52 = new Scanner(System.in);
		String name52 = temp52.next();
		System.out.println("You are a bit nervous, as he seems a little...off…");
		Scanner temp53 = new Scanner(System.in);
		String name53 = temp53.next();
		System.out.println(
				"Grizzby: You can’t anything wrong.  If you put the wrong key in the wrong door...well, let’s just say that it won’t end well.");
		Scanner temp54 = new Scanner(System.in);
		String name54 = temp54.next();
		System.out.println("You realize that your life could be at stake.");
		Scanner temp55 = new Scanner(System.in);
		String name55 = temp55.next();
		System.out.println("Well, that’s not good.");
		Scanner temp56 = new Scanner(System.in);
		String name56 = temp56.next();
		System.out.println("You should probably get this over with as quickly as possible.");
		Scanner temp57 = new Scanner(System.in);
		String name57 = temp57.next();
		System.out.println("Grizzby: Are you ready?");
		Scanner temp58 = new Scanner(System.in);
		String name58 = temp58.next();
		System.out.println("You take a deep breath.");
		Scanner temp59 = new Scanner(System.in);
		String name59 = temp59.next();
		System.out.println(name + ": I suppose so…");
		Scanner temp60 = new Scanner(System.in);
		String name60 = temp60.next();
		System.out.println("READY...");
		Scanner temp61 = new Scanner(System.in);
		String name61 = temp61.next();
		System.out.println("BEGIN!!! (Click the Java icon on your taskbar)");

		// do {
		n = (int) Math.floor(Math.random() * 5);
		o = (int) Math.floor(Math.random() * 5);

		JOptionPane frame;
		frame = new JOptionPane();
		Object[] possibilities = { t1, t2, t3, t4, t5 };
		String s = (String) JOptionPane.showInputDialog(frame,
				"Type in t1, t2, t3, t4, t5.  Afterwards, go to the console and press any key and then [enter].",
				"Key Choice");
		System.out.println(s);

		Scanner temp64 = new Scanner(System.in);
		String name64 = temp64.next();
		System.out.println("You look around.  There are 5 doors all around the cavern.");
		Scanner temp65 = new Scanner(System.in);
		String name65 = temp65.next();
		System.out.println("You walk to a door.  The definition is " + o + ".  (Press any key and hit [enter].)");

		int f = JOptionPane.showConfirmDialog(frame, "Does the key fit in this door?", "Door Check",
				JOptionPane.YES_NO_OPTION);

		String key1 = t1;
		String key2 = t2;
		String key3 = t3;
		String key4 = t4;
		String key5 = t5;
		String doo1 = d1;
		String doo2 = d2;
		String doo3 = d3;
		String doo4 = d4;
		String doo5 = d5;
		int f1 = 4;
		while (f1 == 4)
			if (key1 != null) {
				if (key1 == doo1) {
					System.out.println("Well that's one down!");
					n = n - 1;
					o = o - 1;
				} else {
					System.out.println("There's still more doors.  Don't give up hope yet!");
					f1 = 3;
				}
			} else if (key2 != null) {
				if (key2 == doo2) {
					System.out.println("Well that's one down!");
					n = n - 1;
					o = o - 1;
				} else {
					System.out.println("There's still more doors.  Don't give up hope yet!");
					f1 = 3;
				}
			} else if (key3 != null) {
				if (key3 == doo3) {
					System.out.println("Well that's one down!");
					n = n - 1;
					o = o - 1;
				} else {
					System.out.println("There's still more doors.  Don't give up hope yet!");
					f1 = 3;
				}
			} else if (key4 != null) {
				if (key4 == doo4) {
					System.out.println("Well that's one down!");
					n = n - 1;
					o = o - 1;
				} else {
					System.out.println("There's still more doors.  Don't give up hope yet!");
					f1 = 3;
				}
			} else {
				if (key5 == doo5) {
					System.out.println("Well that's one down!");
					n = n - 1;
					o = o - 1;
				} else {
					System.out.println("There's still more doors.  Don't give up hope yet!");
					f1 = 3;
				}
			}

		/*
		 * Object t1; Object t2; Object t3; Object t4; Object t5; char[] s;
		 * Object key1; Object doo1; Object key2; Object doo2; Object key3;
		 * Object doo3; Object key4; Object key5; Object doo5; Object doo4;
		 * String name;
		 */

		/*
		 * if (key1 == doo1) { System.out.println("Well that's one down!"); n =
		 * n - 1; o = o - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); }
		 * 
		 * if (key2 == doo2) { System.out.println("Well that's one down!"); n =
		 * n - 1; o = o - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); }
		 * 
		 * if (key3 == doo3) { System.out.println("Well that's one down!"); n =
		 * n - 1; o = o - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); }
		 * 
		 * if (key4 == doo4) { System.out.println("Well that's one down!"); n =
		 * n - 1; o = o - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); }
		 * 
		 * if (key5 == doo5) { System.out.println("Well that's one down!"); n =
		 * n - 1; o = o - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); }
		 */

		/*
		 * if (key1 == doo1 || key2 == doo2 || key3 == doo3 || key4 == doo4 ||
		 * key5 == doo5) { System.out.println("Well that's one down!"); n = n -
		 * 1; o = o - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); if (key2 ==
		 * doo2) { System.out.println("Well that's one down!"); n = n - 1; o = o
		 * - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); } if (key3 ==
		 * doo3) { System.out.println("Well that's one down!"); n = n - 1; o = o
		 * - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); } if (key4 ==
		 * doo4) { System.out.println("Well that's one down!"); n = n - 1; o = o
		 * - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); } if (key5 ==
		 * doo5) { System.out.println("Well that's one down!"); n = n - 1; o = o
		 * - 1; } else { System.out.println(
		 * "There's still more doors.  Don't give up hope yet!"); } } } while (n
		 * > 0 || o > 0);
		 */

		if (n == 0) {
			System.out.println("Well, you finally found all the doors.");
			Scanner temp67 = new Scanner(System.in);
			String name67 = temp67.next();
			System.out.println("Hopefully they’re all right…");
			Scanner temp68 = new Scanner(System.in);
			String name68 = temp68.next();
			System.out.println("A bead of sweat drips down your face.");
			Scanner temp69 = new Scanner(System.in);
			String name69 = temp69.next();
			System.out.println("Oh well.");
			Scanner temp70 = new Scanner(System.in);
			String name70 = temp70.next();
			System.out.println("After all, this *is* your only way out of here…");
			Scanner temp71 = new Scanner(System.in);
			String name71 = temp71.next();
			System.out.println("Grizzby: So you’re finially finished?");
			Scanner temp72 = new Scanner(System.in);
			String name72 = temp72.next();
			System.out.println(name + ": I suppose so…");
			Scanner temp73 = new Scanner(System.in);
			String name73 = temp73.next();
			System.out.println("Grizzby looks up, causing you to look up as well.");
			Scanner temp74 = new Scanner(System.in);
			String name74 = temp74.next();
			System.out.println("A bright light fills the cave.");
			Scanner temp75 = new Scanner(System.in);
			String name75 = temp75.next();
			System.out.println("Everything is white.");
			Scanner temp76 = new Scanner(System.in);
			String name76 = temp76.next();
			System.out.println("A voice echoes around you.");
		} else {
			n = (int) Math.floor(Math.random() * 0) + 4;
			o = (int) Math.floor(Math.random() * 5) + 4;

			JOptionPane frame2;
			frame2 = new JOptionPane();
			Object[] possibilities2 = { t1, t2, t3, t4, t5 };
			String s2 = (String) JOptionPane.showInputDialog(frame2,
					"Type in t1, t2, t3, t4, t5.  Afterwards, go to the console and press any key and then [enter].",
					"Key Choice");
			System.out.println(s);

			Scanner temp642 = new Scanner(System.in);
			String name642 = temp642.next();
			System.out.println("You look around.  There are 5 doors all around the cavern.");
			Scanner temp652 = new Scanner(System.in);
			String name652 = temp652.next();
			System.out.println("You walk to a door.  The definition is " + o + ".");

			int f2 = JOptionPane.showConfirmDialog(frame2, "Does the key fit in this door?", "Door Check",
					JOptionPane.YES_NO_OPTION);

			if (key1 == doo1) {
				System.out.println("Well that's one down!");
				n = n - 1;
				o = o - 1;
			} else {
				System.out.println("There's still more doors.  Don't give up hope yet!");
			}

			if (key2 == doo2) {
				System.out.println("Well that's one down!");
				n = n - 1;
				o = o - 1;
			} else {
				System.out.println("There's still more doors.  Don't give up hope yet!");
			}

			if (key3 == doo3) {
				System.out.println("Well that's one down!");
				n = n - 1;
				o = o - 1;
			} else {
				System.out.println("There's still more doors.  Don't give up hope yet!");
			}

			if (key4 == doo4) {
				System.out.println("Well that's one down!");
				n = n - 1;
				o = o - 1;
			} else {
				System.out.println("There's still more doors.  Don't give up hope yet!");
			}

			if (key5 == doo5) {
				System.out.println("Well that's one down!");
				n = n - 1;
				o = o - 1;
			} else {
				System.out.println("There's still more doors.  Don't give up hope yet!");
			}
		}

		if (key1 == doo1 && key2 == doo2 && key3 == doo3 && key4 == doo4 && key5 == doo5) {
			Scanner temp77 = new Scanner(System.in);
			String name77 = temp77.next();
			System.out.println(
					"Voice: Congratualtions!  You have successfully completed your studying!  You are now ready for your exam!");
		} else {
			Scanner temp78 = new Scanner(System.in);
			String name78 = temp78.next();
			System.out.println("Voice: Unfortunatly you have not succeeded.  Try again, and better luck next time!");
		}
	}
}

/*
 * int s = totalValue; while(s > 0) { key1 = t1; def1 = d1; if (key1 = def1) {
 * System.out.println("Well that's one down!"); s = s - 1; } else {
 * System.out.println("There's still more doors.  Don't give up hope yet!"); } }
 */

/*
 * Scanner temp67 = new Scanner(System.in); String name67 = temp67.next();
 * System.out.println(""); Scanner temp68 = new Scanner(System.in); String
 * name68 = temp68.next(); System.out.println(""); Scanner temp69 = new
 * Scanner(System.in); String name69 = temp69.next(); System.out.println("");
 * Scanner temp70 = new Scanner(System.in); String name70 = temp70.next();
 * System.out.println(""); Scanner temp71 = new Scanner(System.in); String
 * name71 = temp71.next(); System.out.println(""); Scanner temp72 = new
 * Scanner(System.in); String name72 = temp72.next(); System.out.println("");
 * Scanner temp73 = new Scanner(System.in); String name73 = temp73.next();
 * System.out.println(""); Scanner temp74 = new Scanner(System.in); String
 * name74 = temp74.next(); System.out.println(""); Scanner temp75 = new
 * Scanner(System.in); String name75 = temp75.next(); System.out.println("");
 * Scanner temp76 = new Scanner(System.in); String name76 = temp76.next();
 * System.out.println(""); Scanner temp77 = new Scanner(System.in); String
 * name77 = temp77.next(); System.out.println(""); Scanner temp78 = new
 * Scanner(System.in); String name78 = temp78.next(); System.out.println("");
 * Scanner temp79 = new Scanner(System.in); String name79 = temp79.next();
 * System.out.println(""); Scanner temp80 = new Scanner(System.in); String
 * name80 = temp80.next(); System.out.println(""); Scanner temp81 = new
 * Scanner(System.in); String name81 = temp81.next(); System.out.println("");
 * Scanner temp82 = new Scanner(System.in); String name82 = temp82.next();
 * System.out.println(""); Scanner temp83 = new Scanner(System.in); String
 * name83 = temp83.next(); System.out.println(""); Scanner temp84 = new
 * Scanner(System.in); String name84 = temp84.next(); System.out.println("");
 * Scanner temp85 = new Scanner(System.in); String name85 = temp85.next();
 * System.out.println(""); Scanner temp86 = new Scanner(System.in); String
 * name86 = temp86.next(); System.out.println(""); Scanner temp87 = new
 * Scanner(System.in); String name87 = temp87.next(); System.out.println("");
 * Scanner temp88 = new Scanner(System.in); String name88 = temp88.next();
 * System.out.println(""); Scanner temp89 = new Scanner(System.in); String
 * name89 = temp89.next(); System.out.println(""); Scanner temp90 = new
 * Scanner(System.in); String name90 = temp90.next(); System.out.println("");
 * Scanner temp91 = new Scanner(System.in); String name91 = temp91.next();
 * System.out.println(""); Scanner temp92 = new Scanner(System.in); String
 * name92 = temp92.next(); System.out.println(""); Scanner temp93 = new
 * Scanner(System.in); String name93 = temp93.next(); System.out.println("");
 * Scanner temp94 = new Scanner(System.in); String name94 = temp94.next();
 * System.out.println(""); Scanner temp95 = new Scanner(System.in); String
 * name95 = temp95.next(); System.out.println(""); Scanner temp96 = new
 * Scanner(System.in); String name96 = temp96.next(); System.out.println("");
 * Scanner temp97 = new Scanner(System.in); String name97 = temp97.next();
 * System.out.println("");
 */

/*
 * Component x = 0; ImageIcon panel = new ImageIcon(new
 * ImageIcon(x).getImage());
 * 
 * JFrame frame = new JFrame(); frame.getContentPane().add(x);
 * frame.pack();frame.setVisible(true);
 */

/*
 * ImageIcon icon = new ImageIcon("/Users/Jasera/Downloads/"); JLabel label =
 * new JLabel(icon); jPanel1.add(label);
 */

/*
 * System.out.println(character1); System.out.println(character2);
 * System.out.println(character3); System.out.println(character4);
 * System.out.println(character5); System.out.println(character6);
 */

// Pfram???? = charachtkshtskhtgkrhgu

/*
 * private void click() { if (!x) { click1(); } else { System.out.println(
 * "Get ready!"); } }
 */

// }
/*
 * public void StudyQuest(){ JLabel label1; ImageIcon icon = createImageIcon(
 * "/Users/Mary/Desktop/Sprites/grizzby sprite 1.png"); label1 = new JLabel(
 * "Welcome to Study Quest!", icon, JLabel.CENTER);
 * label1.setVerticalTextPosition(JLabel.BOTTOM); add(label1); }
 * 
 * protected static ImageIcon createImageIcon(String path, String description) {
 * java.net.URL imgURL = Start.class.getResource(path); if (imgURL != null) {
 * return new ImageIcon(imgURL, description); } else { System.err.println(
 * "Couldn't find file: " + path); return null; } }
 * 
 * private static void createAndShowGUI() { JFrame frame = new JFrame (
 * "Study Quest"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * frame.add(frame, new Start()); frame.pack(); frame.setVisible(true); }
 * 
 * private static void add(JLabel label1) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * private static ImageIcon createImageIcon(String string) { // TODO
 * Auto-generated method stub return null; }
 */

/*
 * private void click() { boolean x = false; if (!x) { click1(); } else {
 * System.out.println("Get ready!"); } }
 * 
 * private static void click1() { // TODO Auto-generated method stub
 * 
 * }
 */

/*
 * class ImagePanel extends JPanel {
 * 
 * private Image img;
 * 
 * public ImagePanel(String img) { this(new ImageIcon(img).getImage()); }
 * 
 * public ImagePanel(Image img) { this.img = img; Dimension size = new
 * Dimension(img.getWidth(null), img.getHeight(null)); setPreferredSize(size);
 * setMaximumSize(size); setSize(size); setLayout(null); }
 */
// }
