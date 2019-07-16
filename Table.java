package javapro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Table {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table window = new Table();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 583, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"www", "eee", "Rrr"},
				{"1",'b', 'c'},
				{"aaa","bbb","ccc"},
			},
			new String[] {
				"abcd", "New column", "New column"
			}
		));
		table.setBounds(47, 31, 431, 48);
		frame.getContentPane().add(table);
		/*table.setCellSelectionEnabled(true);
		ListSelectionModel select=table.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		select.addListSelectionListener(new ListSelectionListener()*/
		
		table.setCellSelectionEnabled(true);
		ListSelectionModel select =table.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		select.addListSelectionListener(new ListSelectionListener()
			{

					@Override
					public void valueChanged(ListSelectionEvent arg0) {
						// TODO Auto-generated method stub
						String data=null;
						int row[]=table.getSelectedRows();
						int column[]=table.getSelectedColumns();
						for(int i=0;i<row.length;i++)
						{
							for(int j=0;j<column.length;j++)
							{
								data=(String)table.getValueAt(row[i], column[j]);
							}
						}
						System.out.println("Data is "+data);
					}
			
		});
	}
}
