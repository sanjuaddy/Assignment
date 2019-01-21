package appLaunch;

import java.util.Scanner;

public class PeopleAndGuns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N==0){
			System.out.println("Sorry");
		}
		else if(N==1||N==2){
			System.out.println("Survivor is : "+1);
		}
		else{
 
			int value = findSurvive(N);
			System.out.println("Survivor is : "+value);
		}
		sc.close();
	}
 
	private static int findSurvive(int n) {
		
		for(int i =2; i<=n/2; i++){
			int num = (int)Math.pow(2, i);
			if(num>=n){
				if(num==n){
					return 1;
				}
				if(num == n+1){
					return num;
				}
				else{
					int temp = ((num-1)-(n))*2;
					return (num-1)-temp;
				}
			}
		}
		
		return 0;
	}

}
