package pl.wipb.ztp.ps2;

class TableDataBoolean implements TableData {
	private boolean data;

    public TableDataBoolean() {
        data = rnd.nextBoolean();
    }

    public String toString() {
        return Boolean.toString(data);
    }
}