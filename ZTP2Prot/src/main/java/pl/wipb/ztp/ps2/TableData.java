package pl.wipb.ztp.ps2;

import java.util.Random;


abstract class TableData implements Cloneable {
    // static final Random rnd = new Random();
     protected Random rnd;
     abstract void Rand();
     
     @Override
     public TableData clone() {
         TableData tabledata = null;
         try {tabledata=(TableData)super.clone();
         tabledata.Rand();}
         catch(CloneNotSupportedException e) {}
             return tabledata;
         
     }
 }
 