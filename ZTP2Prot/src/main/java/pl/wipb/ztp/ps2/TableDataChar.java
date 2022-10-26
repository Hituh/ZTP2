package pl.wipb.ztp.ps2;

import java.util.Random;

class TableDataChar extends TableData {
    private char data;

    public TableDataChar() {
        Rand();
    }
    @Override
    public void Rand()
    {
    	this.rnd = new Random();
    	int data = rnd.nextInt(122);
        this.data = (char) data;
    }

    public String toString() {
        return String.valueOf(data);
    }
    
}