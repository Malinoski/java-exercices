package am2018;

public class GCD {
	public static void main(String args[]) {
		GCD exercice = new GCD();
		
//		int [] arrtestCase1 = {2,3,4,5,6};
//		int testCase1 = exercice.generalizedGCD(arrtestCase1.length, arrtestCase1);		
//		System.out.println("testCase1 result : "+testCase1);
		
		int [] arr = {2,4,6,8,10};
		int testCase2 = exercice.generalizedGCD(arr.length, arr);		
		System.out.println("testCase1 result : "+testCase2);
	}
	
	public int generalizedGCD(int num, int[] arr) {
		
		int winner = 1;
		
		if(num>0) {
			
			for(int i=0; i<num; i++) {

				System.out.println("Calc for: "+arr[i]);
					
				boolean noRemainder = true;
				for(int j=0; j<num; j++) {
					
					int result = arr[j]%arr[i];
					System.out.println("\tmod: "+arr[j]+"%"+arr[i]+": "+result);
					if(result>0) {
						noRemainder = false;
					}
						
				}
				
				if(noRemainder) {
					System.out.println("\t\tHas no remider");
					if(arr[i]>winner) {
						winner = arr[i];
					}				
				}
			}
			
			
		}
		
		return winner;
		
	}
}
