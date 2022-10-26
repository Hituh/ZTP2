package pl.wipb.ztp.ps2;

class TableHeaderDouble extends TableHeader {
	public TableData createTableData() {
        return new TableDataDouble();
    }
    public String toString() {
        return "DOUBLE";
    }
}