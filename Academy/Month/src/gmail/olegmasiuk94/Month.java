package gmail.olegmasiuk94;

import java.util.Arrays;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] month = new int [12];
		for(int i= 0; i<month.length;i++){
		
			if( i==1){
				month[i]=28;
			}else if ((i==3) ||(i==5)|| (i==8)||(i==10)){
				month[i]=30;
			}else{
				month[i]=31;
			}
			
		}
		System.out.println(Arrays.toString(month));
	}

}
