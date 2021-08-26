package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	public int getItemsReceived() {
		return itemsReceived;
	}
	public void setItemsReceived(int x) {
		if(x>0) {
			this.itemsReceived = x;
		}else {
			this.itemsReceived = 0;
		}
	}
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
		public float getDegreesTurned() {
			return degreesTurned;
		}
		public void setDegreesTurned(float degree) {
			if(degree > 0.0) {
				if(degree < 360.0) {
					this.degreesTurned = degree;
				}else {
					this.degreesTurned = 360;
				}
			}else {
				this.degreesTurned = 0;
			}
		}
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
		public String getNomenClature() {
			return nomenclature;
		}
		public void setNomenClature(String s) {
			if(s != "") {
				this.nomenclature = s;
			}else {
				this.nomenclature = " ";
			}
		}
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
		public Object getMemberObj() {
			return memberObj;
		}
		public void setMemberObj(Object o) {
			if(o instanceof String) {
				o = new Object();
			}else {
				memberObj = o;
			}
		}
	public static void main(String[] args) {
		
	}
	
}
