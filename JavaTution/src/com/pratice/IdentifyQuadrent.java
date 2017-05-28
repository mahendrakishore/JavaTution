package com.pratice;

public class IdentifyQuadrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = - 3 , y= -4;

if(x>0 && y>0)
	System.out.println("lies in the 1 st quad");
else if (x<0 && y>0){
	System.out.println("lies in the 2nd quad");
}

else if(x<0 && y<0){
	System.out.println(" lies in the 3rd quad");
}

else if(x>0 && y<0){
	System.out.println("lies in the 4th quad");
}

else{
	System.out.println("don'e lies anywhere");
}
	}

}
