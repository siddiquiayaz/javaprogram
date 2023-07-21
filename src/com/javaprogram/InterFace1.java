package com.javaprogram;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.plaf.synth.SynthGraphicsUtils;


public class InterFace1 {
	public static void main(String[] args) {
		  
         CopyOnWriteArrayList cList =new CopyOnWriteArrayList();
		   cList.add(13);
		   cList.add(15);
		   cList.add(18);
		   cList.add(11);
		   cList.add(10);
		  synchronized(cList) {
		
		   Iterator it=cList.iterator();
		   while (it.hasNext()) {
			   
			     System.out.println(it.next());
			     cList.remove(2);
			
		   }
		   
		   
		   System.out.println(cList);
		}
		   
	
	}

}
