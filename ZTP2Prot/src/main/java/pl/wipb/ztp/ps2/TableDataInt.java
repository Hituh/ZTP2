package pl.wipb.ztp.ps2;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

class TableDataInt extends TableData {
    private int data;
    
    public TableDataInt() {
        Rand();
    }
    @Override
    public void Rand()
    {
    	this.rnd = new Random();
    	data = this.rnd.nextInt(100);
    }
    public String toString() {
        return Integer.toString(data);
    }
    
}