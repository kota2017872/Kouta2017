import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{
	//data
	//method
	Hello(String title){
		//JFrame
		setTitle(title);
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//JButton
		JButton btn = new JButton("Click Me!");
		//JPanel
		JPanel panel = new JPanel();
		panel.add(btn);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.CENTER);

	}

		public static void main(String[] args){
			Hello hello = new Hello("ALOHA");
			hello.setVisible(true);
			

	}
}