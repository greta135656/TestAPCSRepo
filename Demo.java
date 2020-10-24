import java.util.Random;

public class Demo {

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
if (arr.length>1 && i < arr.length -1) {
 new1 += ", ";

}}

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
    
public static int[][] create2DArrayRandomized (int rows, int cols, int maxValue)
	{
Random rand = new Random();
	int originalcols = cols;
	int [][] arr = new int [rows][];
	for (int x = 0; x < rows; x++)
		{
		cols = rand.nextInt(originalcols);
		arr[x] = new int[cols];
		for (int y = 0; y < cols; y++)
			{
			arr[x][y] = rand.nextInt(maxValue);
			}
		}
	return arr;
	}}
    
    
