public class SumArray{
public static void main(String[] args){
int[]array ={1,3,5,9,8,7,6,43};
int total = 0;
for (int counter = 0; counter < array.length; counter++)
total += array[counter];
System.out.printf("Total of array elements: %d%n", total);
}
}