/**
 * 二维数组测试
 * @author KK
 *
 */
public class TestTwoDimensionalArray {
	public static void main(String[] args) {
		//初始值为1
		int o =0;
		//creat a two dimensional array
		int[][] a = new int[3][5];
		//Set default value
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=o+1;
				o++;
				//print
				if(a[i][j]<10) {
					System.out.print("0" + a[i][j] + "  ");
				}else{
					System.out.print(a[i][j] + "  ");
				}
			}
			System.out.println("");
		}
	}
}
