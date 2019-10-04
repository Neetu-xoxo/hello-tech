public class BubbleSortExample{
public static void(int[]arr){
int n=arr.length;
int tempp=0;
for(int i=0;i<n;i++){
for(int j=0;j<(n-1);j++){
if(arr[j-1]>arr[j]{
temp=arr[j-1];
arr[j-1]=arr[j];
arr[j-1]=temp;
}
}
}
}
public static void main(string[]args){
int arr=(5,34,65,78,90,23);
System.ot.println("Array Before Bubble Sort");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+"");
}
System.out.println();
System.out.println("Array After Bubble Sort");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+"");
}
}
}

