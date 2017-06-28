package kcb;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Kcb {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JTable table = new JTable(new KcdDate());
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setBounds(50,50,50,50);
		//以上创建一个空的窗口，可以拖拽改变窗口大小
		
		//JTable table = new JTable(new KcdDate());
		//frame.add(table);
		//JTable是常规二维单元表，这是将一个单元表添加到窗口中
		//JTable是表象，不管数据，数据在别的地方

	}

}
