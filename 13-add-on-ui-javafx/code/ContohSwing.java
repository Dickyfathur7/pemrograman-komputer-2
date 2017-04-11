import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;

public class ContohSwing extends JFrame {

	private JTextField jtf;
	private JButton btn;
	private GridBagLayout layout;
	private JTextArea taInfo;
	
	public ContohSwing() {
		initComponents();
	}

	private void initComponents() {
		layout = new GridBagLayout();
		GridBagConstraints cons = new GridBagConstraints();
		getContentPane().setLayout(layout);

		jtf = new JTextField();
		jtf.setBounds(3, 3, 150, 30);
		cons.fill = GridBagConstraints.BOTH;
		cons.weightx = 2.0;
		layout.setConstraints(jtf, cons);
		getContentPane().add(jtf);

		btn = new JButton("Proses");
		cons.gridwidth = GridBagConstraints.REMAINDER;
		layout.setConstraints(btn, cons);
		getContentPane().add(btn);


		taInfo = new JTextArea();
		taInfo.setBounds(3, 40, 150, 80);
		cons.gridwidth = GridBagConstraints.BOTH;
		layout.setConstraints(taInfo, cons);
		getContentPane().add(taInfo);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		//pack();
		setVisible(true);
	}

	public static void main(String []a) {
		//javax.swing.SwingUtilities.invokeLater(new Runnable() {
		//	public void run() {
				ContohSwing app = new ContohSwing();
		//	}
		//});
	}

}
