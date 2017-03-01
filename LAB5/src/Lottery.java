public class Lottery {
	private int[] lotteryNumbers, userNumbers;
	private int count;
	private int num = 0;
	
	public Lottery(){
		lotteryNumbers = new int[5];
		userNumbers = new int[5];
		
		for(int i=0; i<5; i++){
			lotteryNumbers[i] = (int)( Math.random()*9+1);
		}
	}

	public int[] getLotteryNumbers() {
		return lotteryNumbers;
	}

	public void setLotteryNumbers(int[] lotteryNumbers) {
		this.lotteryNumbers = lotteryNumbers;
	}

	public int[] getUserNumbers() {
		return userNumbers;
	}

	public void setUserNumbers(int[] userNumbers) {
		this.userNumbers = userNumbers;
	}
	
	public void setUserNumbers(int x){
		userNumbers[num] = x;
		num++;
	}
	public int Contains(){
		for(int i=0;i<5;i++){
			if(lotteryNumbers[i]==userNumbers[i]){
				count++;
			}

		}
		return count;
	}
	public String Prize(){
		
		String s;
		if(Contains()>0){
			s = "Congratulations! You have "+Contains()+" matches. You win ";
			if(count==1){
				s += "$2!";
			}
			if(count==2){
				s+="$10!";
			}
			if(count==3){
				s+="$100!";
			}
			if(count==4){
				s+="$500 000";
			}
			if(count==5){
				s+="the GRANDPRIZE! $1million!!";
			}
		}
		else
			s = "Sorry, you have no matches.";
		return s;
	}
	
	public String toString(){
		String s = "Lottery Numbers: \n[";
		for(int i=0;i<lotteryNumbers.length;i++){
			s+=" "+lotteryNumbers[i];
		}
		s+= " ]\nUser Numbers: \n[";
		for(int i=0;i<userNumbers.length;i++){
			s+=" "+userNumbers[i];
		}
		s+=" ]";
		
		return s;
	}
	
}
