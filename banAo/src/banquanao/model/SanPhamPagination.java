package banquanao.model;

import javax.swing.table.DefaultTableModel;

public class SanPhamPagination extends DefaultTableModel {

    public SanPhamPagination() {
        super();
        this.addColumn("MASP");
        this.addColumn("TENSP");
        this.addColumn("SOLUONG");

    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            default:
                return String.class;
        }
    }
}
