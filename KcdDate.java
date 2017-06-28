package kcb;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class KcdDate implements TableModel {
	private String[] title = { "星期日","星期一","星期二",
			"星期三","星期四","星期五","星期六", };
	private String[][] date = new String[8][7];
	
	public KcdDate(){
		for(int i = 0;i<date.length;i++)
			for(int j = 0;j<date[i].length;j++){
				date[i][j] = "";
			}
		
	}
	
	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public int getRowCount() {
		// TODO Autoring-generated method stub
		return 8;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return title[arg0];
	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return date[arg0][arg1];
	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		date[arg1][arg2] = (String)arg0;
	}

	

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub

	}


}
