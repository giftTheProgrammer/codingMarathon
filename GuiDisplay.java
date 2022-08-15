import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiDisplay implements ActionListener{
	
		JFrame firstApp = new JFrame();

		JTextField nameField = new JTextField("Morgan");

		public GuiDisplay(){
			firstApp.setLayout( new FlowLayout() );
			windowSetup();
		}
		// 
		

		public void windowSetup(){
			JLabel textBoxLabel = new JLabel();
			textBoxLabel.setFont( new Font("Verdana", Font.PLAIN, 15) );

			textBoxLabel.setText("Name: ");
			textBoxLabel.setBounds(0, 20, 50, 10);

			// JTextField nameField = new JTextField("Morgan");
			nameField.setHorizontalAlignment(JTextField.CENTER);
			nameField.setPreferredSize( new Dimension(150, 30) );
			JButton saveName = new JButton("SUBMIT");

			saveName.addActionListener(this);
			firstApp.add(textBoxLabel);

			firstApp.add(nameField);
			firstApp.add(saveName);
			firstApp.setSize(400, 500);

			firstApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			firstApp.setVisible(true);
		}
		

	
		public void actionPerformed(ActionEvent e){
				JLabel showName = new JLabel();
				JDialog messageDisplay = new JDialog(firstApp, "Welcome", true);
				showName.setText( nameField.getText() );
				messageDisplay.add( showName );
				messageDisplay.setVisible(true);
			}
		}