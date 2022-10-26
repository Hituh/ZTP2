package pl.wipb.ztp.ps2;

class TableHeaderInt extends TableHeader {
	public TableData createTableData() {
        return new TableDataInt();
    }
    public String toString() {
        return "INT";
    }
}
