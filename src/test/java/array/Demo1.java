package array;

public class Demo1 {
	public  static void main (String  args[]) {	
		// wAys of array declrearation 
      // array is a collection of similar type of information which has contigeous memory location  
		// Std. Syntax 
		// dataType[] refvariable;
		// dataType []refvariable;
		// dataType refvariable[];
		
        // object syntax 
		//// dataType refvariable[] = new dataType[];	
		//-----Declearation +initialoization 
		String[] name = new String[4];
           name  [0] ="sachin";
           name  [1]= "sagar";
           name[2]= "chandrakant";
           name [3]= "rameshwar";      
          // System.out.println(name[0]);
           for(int i=0; i<4; i++) {
        	   System.out.println(name[i]);
           }

}
}