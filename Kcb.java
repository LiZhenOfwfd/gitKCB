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
		//���ϴ���һ���յĴ��ڣ�������ק�ı䴰�ڴ�С
		
		//JTable table = new JTable(new KcdDate());
		//frame.add(table);
		//JTable�ǳ����ά��Ԫ�����ǽ�һ����Ԫ����ӵ�������
		//JTable�Ǳ��󣬲������ݣ������ڱ�ĵط�

	}

}
