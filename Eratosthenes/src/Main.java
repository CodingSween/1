
public class Main {
	public static void main(String[] args){
		int[] j = new int[1001];
		//int[] p = new int[71];
		
		for(int i = 0; i<=j.length-1;i++){
			j[i] = 1;
		}
		
		
		int count = 0; 
		for(int i = 2; i<=j.length-1; i++){
			//System.out.println("The number is " + i );
			count = 0;
			for(int k = i+1; k <=j.length-1; k++){
				//System.out.println("The possible multiple is " + k );
				count++;
				if(count == i){
					//System.out.println("are we here ever?");
					j[k] = 0;
					count = 0;
					//System.out.println(j[k]);
				}
			}
		}
		
		//count = 0;
		for(int i = 2; i<j.length; i++){
			if(j[i]!=0){
				//System.out.println("Okay, how about here?");
				System.out.println(i);
			}
			//count++;
		}
		
		//System.out.println(j[17]);
		
		
	}
}
