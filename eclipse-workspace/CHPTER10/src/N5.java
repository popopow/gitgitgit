import java.awt.*; //import문
import java.awt.event.*;
import javax.swing.*;

public class N5 extends JFrame {
	public N5() {		
		super("+,- 키로 폰트 크기 조절");		//타이틀
		setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Love Java");		// 출력문
		label.setFont(new Font("TimesRoman", Font.PLAIN, 10)); // 10픽셀 크기
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {		//+를 누를경우
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN, size+5)); 					
				}
				else if(e.getKeyChar() == '-') {		//-를 누를경우
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("TimesRoman", Font.PLAIN, size-5)); 					
				}				
			}
		});
		add(label);
		setSize(300,150);	//300,150
		setVisible(true);
		label.requestFocus();
	}
	static public void main(String [] args) {
		new N5();		//객체 생성
	}
}
