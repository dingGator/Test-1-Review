/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Test.Review;

public class Library {
	/*-
	 * General format
		True/False.
		Multiple choice.: output base
			print
			println
			"\n"
		"What does this code do".
		Three coding questions, with instructions given as a JUnit test, or as a UML diagram.

	 * **********************************************************************************
	 * 
	 *Data Type			Default Value (for fields)
	 	*Primitive:
	 		Integer
	 			*byte			0
	 			*short			0
	 			*int			0
	 			*long			0L
	 		
	 		Character
	 			*char: 			'\u0000'
	 		
	 		Floating Point
	 			*double: 		0.0d
	 			*float: 		0.0f
	 					Pitfall:  lose accuracy

			boolean

		Class
			String 			: null
			User Defined Type : null
			
			****Type coercion: when double 3.7 put in int---> 3
			*
			*Type Casting: double needs to be with a number before numeric function * + /
	 
	 **********************************************************************************
	 *Branching and looping
	 *Branching
		if/else
			max = (n1 > n2) ? n1 : n2;
		switch:	fall through statement without --->break

		Loops:	
			for   use if you know exactly how many loops
			enhanced: for each  
		while
		do /  while
		
		
		short circuit:  if first = true OR      always true
						if first = false &&     always false
		
	 *****************************************************************************
	 *
	 *Array basics
	 *	:  Looping over the contents of an array.
	 *	Initializing arrays.
	 *		class: .length  
	 *
	 
	 *	use for loop to load the array 
	 *			start of array is a[0]
	 *			creating array   int[] array1 = new int[5]
	 *			array1[0]
	 *			int[] array2 = {1,2,3,4,5}
	 *			array2[0] = 1;
	 *			array1.length is the number rows of array
	 *			
	 *			int[][] array3 = new int[3][];
	 *
	 *			array3[0] = new int[5];
	 *			array3[1] = new int[6];
	 *			array3[2] = new int[4];
	 **********************************************************************
	 *		Object Oriented Programming principles
	 *		What are they and what does each depend on?
	 *			encapsulation----> object to encapsulating data
	 *			inheritance----
	 *					base class or super class
	 *					
	 *						
	 *			polymorphism
				
	*******************************************************************************		
	 *I/O topics will not be on the exam.
		
		******************************
	*UML to code, code to UML.
			visible in UML
			
			red box are private variables
			green circle are methods
			
			
			
	*JUnit.

				
	 */
    public boolean someLibraryMethod() {
        return true;
    }
}
