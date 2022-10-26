package pl.wipb.ztp.ps2;

import java.util.Random;

class TableDataBoolean extends TableData {
	private boolean data;

    public TableDataBoolean() {
    	Rand();
    }
    
    @Override
    public void Rand() {
    	this.rnd = new Random();
    	data = rnd.nextBoolean();
    }

    public String toString() {
        return Boolean.toString(data);
    }
}