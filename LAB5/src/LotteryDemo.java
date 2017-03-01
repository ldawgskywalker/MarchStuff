import java.util.*;
public class LotteryDemo {
	public static void main(String[] args){
		int n;
		Scanner kb = new Scanner(System.in);
		
		Lottery lottoMax = new Lottery();
		
		System.out.println("Please input 5 numbers from 1-9");
		for(int i=0;i<5;i++){
		System.out.print("Number: ");
			n = kb.nextInt();
		lottoMax.setUserNumbers(n);
		}
				
		System.out.println(lottoMax);
		
		System.out.println(lottoMax.Prize());
		
		kb.close();
	}
}
