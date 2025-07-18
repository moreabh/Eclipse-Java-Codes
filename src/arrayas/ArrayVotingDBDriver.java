package arrayas;

public class ArrayVotingDBDriver {
	public static void main(String[] args) {
		
		ArrayVotingDB [] db = new ArrayVotingDB[5];
		
		db[0] = new ArrayVotingDB("Pruthvi", 21, 1, 808442211239l);
		db[1] = new ArrayVotingDB("Abhi", 22, 2, 646448790498l);
		db[2] = new ArrayVotingDB("Vedant", 21, 3, 123354672345l);
		db[3] = new ArrayVotingDB("Ramesh", 22, 4, 545454675434l);
		db[4] = new ArrayVotingDB("Nikhil", 21, 5, 202929345676l);
		
		System.out.println(db[0]);
		for (int i = 0; i < db.length; i++) {
			System.out.println(db[i].adharNo);
		}
		                                          
	}

}
/*
[Name: Pruthvi,Age: 21,Ward No.:1Adhar No.: 808442211239]
808442211239
646448790498
123354672345
545454675434
202929345676
*/