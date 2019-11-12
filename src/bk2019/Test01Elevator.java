package bk2019;

public class Test01Elevator {
	
	public static void main(String args[]) {
		
		// Floors with no '4' and '13'		
		// Real		:1 2 3 4 5 6 7 8 9  10 11 12 13 14 15 16 17 18 19 20 21 
		// Lucky		:1 2 3 5 6 7 8 9 10 11 12 15	16 17 18 19 20 21 22 23 25
		
		// Examples:
		// 4	 must return 5
		// 12 must return 15 
		// so on..
		
		int result = Test01Elevator.getLucky(12);
		
		System.out.println(result);
	}
	
	public static int getLucky(int n) {
		
		int luckCountInt = 1;
		String floorStr = "";
		
		for(int floor=1; floor<=n; floor++) {
			floorStr = Integer.toString(floor);
			
			//if(luckCountStr.contains("4") || luckCountStr.contains("13")) {
				
			//}
			luckCountInt++;
			System.out.println(floor+":"+luckCountInt);
			
		}		
		
		return luckCountInt;
	}
	
}