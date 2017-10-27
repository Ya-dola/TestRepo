package guiTest;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestFrame extends JFrame {

	JLabel lblImg = addlabel();

	public TestFrame() {
		super();

		this.add(lblImg);
		this.setResizable(false);
		this.setTitle("Guess the Word Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1022, 598);
		this.setBackground(new Color(244, 241, 215));
		this.setLocationRelativeTo(null);

	}

	public JLabel addlabel() {

		JLabel lblPic = new JLabel("pic");
		lblPic.setBounds(0, 0, 1022, 598);
		ImageIcon bg_icon = new ImageIcon("Images/bell.png");
		Image bg_img = bg_icon.getImage(); // converts icon to image
		Image sized_bg_img = bg_img.getScaledInstance(lblPic.getWidth(), lblPic.getHeight(),
				Image.SCALE_SMOOTH); /*
										 * scales the image to label size
										 */
		ImageIcon sized_bg_icon = new ImageIcon(
				sized_bg_img); /*
								 * converts the scaled image to an icon
								 */

		lblPic.setIcon(sized_bg_icon);

		return lblPic;

	}

}
