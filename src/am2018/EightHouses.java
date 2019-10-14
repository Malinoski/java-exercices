package am2018;

public class EightHouses {
	public static void main(String args[]) {
		
		EightHouses exercice = new EightHouses();
		
//		int [] statesTestCase1 = {1,0,0,0,0,1,0,0};
//		int [] resultTestCase1 = exercice.cellCompete(statesTestCase1, 1);		
//		System.out.println("testCase1 result : ");
//		for (int i = 0; i < resultTestCase1.length; i++) {
//			System.out.print(resultTestCase1[i]+",");
//		}
		
		int [] statesTestCase1 = {1,1,1,0,1,1,1,1};
		int [] resultTestCase1 = exercice.cellCompete(statesTestCase1, 2);		
		System.out.println("testCase1 result : ");
		for (int i = 0; i < resultTestCase1.length; i++) {
			System.out.print(resultTestCase1[i]+",");
		}
	}
	
	public int [] cellCompete(int [] states, int days) {
		
		for(int i=0;i<days; i++) {
		
			states = new int[]{ 
				((states[1]==0) ? 0 : 1),
				((states[0]==states[2]) ? 0 : 1),
				((states[1]==states[3]) ? 0 : 1),
				((states[2]==states[4]) ? 0 : 1),
				((states[3]==states[5]) ? 0 : 1),
				((states[4]==states[6]) ? 0 : 1),
				((states[5]==states[7]) ? 0 : 1),
				((states[6]==0) ? 0 : 1)
			}; 
			
		}
		
		return states;
		
	}
}
