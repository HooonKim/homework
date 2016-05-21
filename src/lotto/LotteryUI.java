package lotto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class LotteryUI extends JFrame implements ActionListener{
	Lottery lottery;
	JButton btn;
	JPanel panNorth, panSouth;
	ImageIcon icon;
	List<JButton> btns;
	
	
	public LotteryUI() {
		lottery = new Lottery();
		btn = new JButton("로또번호추첨");
		panNorth = new JPanel();
		panNorth.setBackground(Color.BLUE);
		panSouth = new JPanel();
		panSouth.setBackground(Color.YELLOW);
		btns = new ArrayList<JButton>();
		btn.addActionListener(this);
		panNorth.add(btn);
		add(panNorth,BorderLayout.NORTH); 
		add(panSouth,BorderLayout.SOUTH);
		setBounds(300, 400, 1200, 300);
		// 300,400은 x,y 좌표
		// 1200,300은 픽셀 크기
		setVisible(true);
	}
	 


	@Override
	public void actionPerformed(ActionEvent e) {
		// 기능  
		
		if (btns.size() == 0) {
			JButton btn = null; 
			for (int i = 0; i < 6; i++) {
				btn = new JButton();
				btns.add(btn);
				panSouth.add(btn);
				
			}
		}
		
		
		int[] lotto = lottery.getLotto();
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
			btns.get(i).setIcon(this.getIcon(lotto[i]));
			
		}
	}

	private Icon getIcon(int i){
		String img = "src/img/" + Integer.toString(i) + ".gif" ;
		ImageIcon icon = new ImageIcon(img);
		return icon;
	}
}
