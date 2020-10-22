import java.util.Random;

public class Demo {
    public static void main(String args[]) {
int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
System.out.println(arrayDeepToString(arr));

int[][] test = create2DArray(5,5,5);
int [][] test2 = Create2DArrayRandomized(4,10,4);
System.out.println(arrayDeepToString(test));
System.out.println(arrayDeepToString(test2));
    }
    
public static String arrToString(int[] arr){
 String Result = "{";
 for (int i=0; i< arr.length; i ++)
{ Result += arr [i];
if (arr.length > 1 && i < arr.length -1){
Result += ", ";
}}
  Result += "}" ;
  return Result; 
}

public static String arrayDeepToString (int [][] arr) {
    String new1 = "{";
for (int i = 0; i < arr.length; i++)
{new1  += arrToString(arr[i]);

}

new1 += "}";
return new1;
}

public static int[][] create2DArray (int rows, int cols, int maxValue)
	{
Random rand = new Random();
	int [][] arr = new int [rows][cols];
	for (int x = 0; x < rows; x++)
		{
		for (int y = 0; y < cols; y++)
			{
			arr[x][y] = rand.nextInt(maxValue + 1);
			}
		}
	return arr;
	}
    
    public static int[][] Create2DArrayRandomized (int rows, int cols, int maxValue)
	{
Random rand = new Random();
cols = rand.nextInt(cols) + 1;

	int [][] arr = new int [rows][cols];
	for (int x = 0; x < rows; x++)
		{
		for (int y = 0; y < cols; y++)
			{
			arr[x][y] = rand.nextInt(maxValue + 1);
			}
		}
	return arr;
	}
	
}
