import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContohAwt extends Frame {

	Button b;
	TextField tf;
	TextArea ta;

	public ContohAwt() {
		initComponents();
	}

	private void initComponents() {
		tf = new TextField();
		tf.setBounds(3, 3, 200, 30);
		add(tf);

		b = new Button("Tambahkan");
		b.setBounds(203, 3, 80, 30);
		add(b);

		ta = new TextArea(250, 280);
		ta.setBounds(3, 35, 280, 200);
		add(ta);

		setSize(300,300);
		setLayout(null);
		setVisible(true);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {	
		ContohAwt app = new ContohAwt();
	}
		
}
