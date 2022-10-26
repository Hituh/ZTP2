package pl.wipb.ztp.ps2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

class TableDataDouble extends TableData {
	private double data;

    public TableDataDouble() {
    	Rand();
    }
    
    @Override
    public void Rand()
    {
    	this.rnd = new Random();
    	data = this.rnd.nextDouble();
        data = (double) Math.round(data * 100.0) / 100.0;
    }

    public String toString() {
        return Double.toString(data);
    }
}