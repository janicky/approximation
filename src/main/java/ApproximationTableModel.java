import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ApproximationTableModel extends AbstractTableModel {

    private String[] columnNames = { "x", "f(x)", "y(x)", "e (błąd rzeczywisty)" };
    private List<Object[]> data = new ArrayList<>();

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data.get(row)[col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public void add(Object[] o) {
        data.add(o);
    }

}
