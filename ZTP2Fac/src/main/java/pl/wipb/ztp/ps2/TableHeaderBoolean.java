package pl.wipb.ztp.ps2;

class TableHeaderBoolean extends TableHeader {
	public TableData createTableData() {
        return new TableDataBoolean();
    }
    public String toString() {
        return "BOOL";
    }
}