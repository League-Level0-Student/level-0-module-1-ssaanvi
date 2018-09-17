package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String name= JOptionPane.showInputDialog("Dear player, what is our name? Please type it into the box below.");
		JOptionPane.showMessageDialog(null, "Okay, " +name+ ", you are playing the riddler!"
				+" The rules are simple, I'm gonna ask you a riddle, an you're gonna answer, if you're answer is right"
				+", then your score will increse by one, if  your answer is wrong, then you will not gain any points.");
		JOptionPane.showMessageDialog(null, "Got it? Good. Hit the button below to find out your first question...");
		String answer =JOptionPane.showInputDialog(null, "Your first question is... When you need me, you throw me away, when you're done with me, you bring me back."
				+ "What am I?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		String realanswer= ("Anchor)");
		if (answer.equalsIgnoreCase(realanswer)){
			JOptionPane.showMessageDialog(null, "Great job, " +name+ "! Now for your next question...");
			Score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Nice try! The correct answer is, Anchor.");
		}

		// 6. Add some more riddles
		String question2 =JOptionPane.showInputDialog("You have 1 more question...Your next one is, Many have heard me, but no one has seen me, and I will not speak back, til' I've been spoken to. What am I?");
String answer1 = ("An Echo");
if (answer1 .equals(question2)){
	JOptionPane.showMessageDialog(null, "Great job, " +name+ "! Now for your next question...");
	Score++;
}
else {
	JOptionPane.showMessageDialog(null, "Nice try! The correct answer is, An Echo.");
}


// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, Score);
	}
}

