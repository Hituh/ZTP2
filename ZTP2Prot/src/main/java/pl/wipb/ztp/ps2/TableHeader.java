package pl.wipb.ztp.ps2;

class TableHeader {
    private String type;
    TableData tableData;

    public TableHeader(String type, TableData tableData) {
        this.type = type;
        this.tableData = tableData;
    }

    public String toString() {
        return type;
    }
    
    public TableData createTableData() {
        return tableData.clone();
    }
}
