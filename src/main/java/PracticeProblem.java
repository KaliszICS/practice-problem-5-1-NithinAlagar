/**

        * File: Lesson 5.1 - arrays

        * Author: nitin.a

        * Date Created: April 28, 2026

        * Date Last Modified: april 28, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

    public static int[] createIntArray(){
        int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++){
		    arr[i] = i + 1;
		}
		return arr;
		
	}

	public static String[] createArray(String var1, String var2, String var3 , String var4){
	    return new String[] {var1, var2, var3, var4};
	}

	public static String getElement(int idx, String[] arr3){
		return arr3[idx];
	}

	public static void replaceElement(int idx, double num, ndouble[] arr2){
		arr2[idx] = num;
	}
		

}
