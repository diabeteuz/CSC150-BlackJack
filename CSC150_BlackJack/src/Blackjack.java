import javax.swing.JFrame;

/**
 * 
 * @author jadams
 *
 */
public class Blackjack 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("BlackJack");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PANEL());
		
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
