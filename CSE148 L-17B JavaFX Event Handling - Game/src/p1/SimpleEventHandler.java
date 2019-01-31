package p1;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class SimpleEventHandler implements EventHandler
{
	private Label label;
	
		public SimpleEventHandler(Label label)
		{
			this.label = label;
		
		}
		@Override
		public void handle(Event event)
		{
			
			if(label.getText().equals("Do not press this Button."))
			{
				label.setText("Do not press.");
			}
			else if(label.getText().equals("Do not press."))
			{
				label.setText("Why do you keep pressing it?");
			}
			else if(label.getText().equals("Why do you keep pressing it?"))
			{
				label.setText("Fine, go ahead, see if i care!");
			}
			else if(label.getText().equals("Fine, go ahead, see if i care!"))
			{
				label.setText("");
			}
			else if(label.getText().equals(""))
			{
				label.setText("Stop it!");
			}
			else if(label.getText().equals("Stop it!"))
			{
				label.setText("You better stop this or feel regret.");
			}
			else if(label.getText().equals("You better stop this or feel regret."))
			{
				label.setText("....");
			}
			else if(label.getText().equals("...."))
			{
				label.setText("-_- .....");
			}
			else if(label.getText().equals("-_- ....."))
			{
				label.setText("hmm....");
			}
			else if(label.getText().equals("hmm...."))
			{
				label.setText("Don't you have something better to do then press a button? Go away.");
			}
			else if(label.getText().equals("Don't you have something better to do then press a button? Go away."))
			{
				label.setText("You are so annoying, did you know that?");
			}
			else if(label.getText().equals("You are so annoying, did you know that?"))
			{
				label.setText("Alright, time for drastic measures!");
			}
			else if(label.getText().equals("Alright, time for drastic measures!"))
			{
				label.setText("I set a timer.");
			}
			else if(label.getText().equals("I set a timer."))
			{
				label.setText("Everytime you click, it goes down by one.");
			}
			else if(label.getText().equals("Everytime you click, it goes down by one."))
			{
				label.setText("The World will blow up.");
			}
			else if(label.getText().equals("The World will blow up."))
			{
				label.setText("Don't believe me?");
			}
			else if(label.getText().equals("Don't believe me?"))
			{
				label.setText("By the way, its now at 5");
			}
			else if(label.getText().equals("By the way, its now at 5"))
			{
				label.setText("4");
			}
			else if(label.getText().equals("4"))
			{
				label.setText("...3");
			}
			else if(label.getText().equals("...3"))
			{
				label.setText("DO YOU NOT HAVE ANY MORALS 2.");
			}
			else if(label.getText().equals("DO YOU NOT HAVE ANY MORALS 2."))
			{
				label.setText("STOP IT, DONT YOU DARE 1.");
			}
			else if(label.getText().equals("STOP IT, DONT YOU DARE 1."))
			{
				label.setText("...0 *KABOOM!!!*");
			}
			else if(label.getText().equals("...0 *KABOOM!!!*"))
			{
				label.setText("y-you... you blew up the WORLD.");
			}
			else if(label.getText().equals("y-you... you blew up the WORLD."))
			{
				label.setText("Everyones dead and all you care about,");
			}
			else if(label.getText().equals("Everyones dead and all you care about,"))
			{
				label.setText("is pressing this stupid button.");
			}
			else if(label.getText().equals("is pressing this stupid button."))
			{
				label.setText("I'm not dead, I am just a voice.");
			}
			else if(label.getText().equals("I'm not dead, I am just a voice."))
			{
				label.setText("However, you are and everyone else too.");
			}
			else if(label.getText().equals("However, you are and everyone else too."))
			{
				label.setText("Murderer.");
			}
			else if(label.getText().equals("Murderer."))
			{
				label.setText("Freak.");
			}
			else if(label.getText().equals("Freak."))
			{
				label.setText("*Sigh* Why do you keep pressing this pointless button?");
			}
			else if(label.getText().equals("*Sigh* Why do you keep pressing this pointless button?"))
			{
				label.setText("You could have been doing something else with your time.");
			}
			else if(label.getText().equals("You could have been doing something else with your time."))
			{
				label.setText("Such as knitting,");
			}
			else if(label.getText().equals("Such as knitting,"))
			{
				label.setText("or fishing,");
			}
			else if(label.getText().equals("or fishing,"))
			{
				label.setText("or getting lai.... uh nevermind.");
			}
			else if(label.getText().equals("or getting lai.... uh nevermind."))
			{
				label.setText("Now no one can enjoy them.");
			}
			else if(label.getText().equals("Now no one can enjoy them."))
			{
				label.setText("You know why?");
			}
			else if(label.getText().equals("You know why?"))
			{
				label.setText("Because you blew up the Earth,");
			}
			else if(label.getText().equals("Because you blew up the Earth,"))
			{
				label.setText("Yet you still push this button.");
			}
			else if(label.getText().equals("Yet you still push this button."))
			{
				label.setText("I am going to ignore you, see how you like it.");
			}
			else if(label.getText().equals("I am going to ignore you, see how you like it."))
			{
				label.setText(";_;");
			}
			else if(label.getText().equals(";_;"))
			{
				label.setText(".");
			}
			else if(label.getText().equals("."))
			{
				label.setText("..");
			}
			else if(label.getText().equals(".."))
			{
				label.setText("...");
			}
			else if(label.getText().equals("..."))
			{
				label.setText("..........");
			}
			else if(label.getText().equals(".........."))
			{
				label.setText("~");
			}
			else if(label.getText().equals("~"))
			{
				label.setText("Know what this symbol is? ~");
			}
			else if(label.getText().equals("Know what this symbol is? ~"))
			{
				label.setText("I like this ~ character.");
			}
			else if(label.getText().equals("I like this ~ character."))
			{
				label.setText("~~~");
			}
			else if(label.getText().equals("~~~"))
			{
				label.setText(".....");
			}
			else if(label.getText().equals("....."))
			{
				label.setText("How are you not bored yet?");
			}
			else if(label.getText().equals("How are you not bored yet?"))
			{
				label.setText("You are so rude ya know?");
			}
			else if(label.getText().equals("You are so rude ya know?"))
			{
				label.setText("Alright. No choice. I am taking this button away!");
			}
			else if(label.getText().equals("Alright. No choice. I am taking this button away!"))
			{
				System.exit(0);
			}
			
		}

}
