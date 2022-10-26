package pl.wipb.ztp.ps2;

class TableDataChar implements TableData {
    private char data;

    public TableDataChar() {
        int data = rnd.nextInt(122);
        this.data = (char) data;
    }

    public String toString() {
        return String.valueOf(data);
    }
    
}