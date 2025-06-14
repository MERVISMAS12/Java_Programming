package MyPackage;
public class NonPrimitiveData{
	public static void main(String args[]) {
		String str1 = "This is String 1";
		System.out.println(str1);
		
		String str2 = new String("This is String 2");
		System.out.println(str2);
		
		int arr[];
		arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}
}