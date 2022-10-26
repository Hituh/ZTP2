package pl.wipb.ztp.ps2;

class TableHeaderChar extends TableHeader {
	public TableData createTableData() {
        return new TableDataChar();
    }
    public String toString() {
        return "CHAR";
    }
}