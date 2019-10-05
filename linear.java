public class LinearSearchExample{
public static int linearsearch(int[] arr,int key){
for(int i=0;i<arr.length;i++){
if(arr[i]==key){
return i;
}
}
return -1;
}
public static void main(string a[]){
int[] a1={10,20,30,40,70,90};
int key= 40;
System.out.println(key+" is found at index:"LinearSearch(a1,key));
}
}

