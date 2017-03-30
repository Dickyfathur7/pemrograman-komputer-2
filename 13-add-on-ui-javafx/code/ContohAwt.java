import java.awt.Frame;
import java.awt.Button;

public class ContohAwt extends Frame {

	Button b;
	TextField tf;

	public ContohAwt() {

		b = new Button("Silahkan Tekan");
		b.setBounds(30, 100, 80, 30);
		add(b);

		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String args[]) {	
		ContohAwt app = new ContohAwt();
	}
		
}
