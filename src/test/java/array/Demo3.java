package array;

public class Demo3 {
	public static void main(String [] args) {
		//-- declearation + initialiazation without setting size
		//--without cfreating object 

		String[] suv = {" Xuv700", "nexon","creta "," safari","brezza ","seltos"};

		//System.out.println(suv[2]);
		//--as the length is not fix so we have to find 
		//--to find length of array we have one property called (arrays refvariable.length)

		System.out.println(suv.length);

		// now u can applly for loop now we have a fix length that is (6)
		//for(int i=0; i<6; i++) {
		for(int i=0; i<suv.length; i++) {
			System.out.println(suv[i]);
		}
	}

}
