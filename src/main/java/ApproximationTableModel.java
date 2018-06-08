import javax.swing.table.AbstractTableModel;

public class ApproximationTableModel extends AbstractTableModel {

    private String[] columnNames = { "x", "f(x)", "y(x)", "e (błąd rzeczywisty)" };
    private Object[][] data = {
            { 0.1, 0.2, 0.3, 0.005 }
    };

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
