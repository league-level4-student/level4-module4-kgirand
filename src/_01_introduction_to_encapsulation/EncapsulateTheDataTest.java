package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {

	EncapsulateTheData e = new EncapsulateTheData();
	
	@Test
	void itemsReceived() {
		e.getItemsReceived();
		e.setItemsReceived(3);
	}
	@Test
	void degreesTurned() {
		e.getDegreesTurned();
		e.setDegreesTurned(90);
	}
	@Test
	void NomenClature() {
		e.getNomenClature();
		e.setNomenClature("hello");
	}
	Object ob = new Object();
	@Test
	void MemberObject() {
		e.getMemberObj();
		e.setMemberObj(ob);
	}

}
