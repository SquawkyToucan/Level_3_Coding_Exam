import java.util.ArrayList;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> votes) {
		int popeFrancis = 0;
		int edwardSnowden = 0;
		for(String s : votes) {
			//Make all of the votes lower case because they were all capitalized differently
			String temp = s.toLowerCase();
			//Check who was voted for
			if(temp.equals("pope francis")) {
				//Vote for Pope Francis
				popeFrancis++;
			}
			else if(temp.equals("edward snowden")) {
				//Vote for Edward Snowden
				edwardSnowden++;
			}
		}
		//The loop is now over. Whichever number is larger is the winner, and a tie returns "TIE"
		if(popeFrancis > edwardSnowden) {
			//Pope Francis won the vote
			return "pope francis";
		}
		else if (edwardSnowden > popeFrancis) {
			return "edward snowden";
		}
		else {
			return "TIE";
		}
	}
}
