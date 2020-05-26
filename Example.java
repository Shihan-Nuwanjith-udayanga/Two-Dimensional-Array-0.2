import java.util.*;
public class Example {
	public static void main(String[] args) {
		int[][] s=new int[10][4];
		Random r=new Random();
		for(int i=0; i<10; i++){	
			for(int j=0; j<4; j++){
				s[i][j]=r.nextInt(101);
			}
		}
		
		for(int i=0; i<10; i++){
			for(int j=0; j<4; j++){
				System.out.print(s[i][j]+"\t");
			}
			System.out.println();
		}
    }
}
