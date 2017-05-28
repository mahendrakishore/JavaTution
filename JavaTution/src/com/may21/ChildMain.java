package com.may21;

public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.getParentData("firstparent", "middleparent", "lastparent", 50);
		c.getChildDetails("firstchild", 30);
		c.showChild();
		//c.showParent();
	}

}
