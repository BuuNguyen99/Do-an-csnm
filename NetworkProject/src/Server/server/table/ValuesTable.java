package Server.server.table;

import javax.swing.table.AbstractTableModel;

public class ValuesTable extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	public static final int NAME = 0;
	public static final int IP_ADDRESS = 1;
	public static final int STATUS = 2;
	public static final int TIME = 3;
	public static final String[] columnName = {"Name", "IP Address","Status","Time"};
	public int rowCount;
	public Object[][] values = new Object[20][4];
	
	public ValuesTable() {
		super();
		rowCount = 0;
		for (int i = 0; i<4; i++){
			setColumnName(i, getColumnName(i));
		}
	
	}
	
	@Override
	public int getColumnCount() {
		return values[0].length;
	}

	@Override
	public int getRowCount() {
		return values.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return values[rowIndex][columnIndex];
	}

	public void addRow(String name, String ipAddress, String status, String time){
		int rowIndex = getRowCount();
		values[rowIndex][NAME] = name;
		values[rowIndex][IP_ADDRESS] = ipAddress;
		values[rowIndex][STATUS] = status;
		values[rowIndex][TIME] = time;
		rowIndex++;
		System.out.println("row Index: "+rowIndex);
	}
	
	public void setColumnName(int i, String name) {
		columnName[i] = name;
		fireTableStructureChanged();
	}

	public String getColumnName(int columnIndex){
		return columnName[columnIndex];
	}
}
