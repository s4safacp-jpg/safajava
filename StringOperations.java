import java.util.Scanner;
class StringOperations{
public static void main(String[]args){
Scanner sc=new
Scanner(System.in);
System.out.print("enter the first string:");
String str1=sc.nextLine();
System.out.print("Enter the second string:");
String str2=sc.nextLine();
System .out.println("\nCharacter at index 0:"+str1.charAt(0));
System.out.println("substring from index 1:"+str1.substring(1));
System.out.println("Concatenation: "+ str1.concat(str2));
System.out.println("Are both string equal? " +str1.equals(str2));
System.out.println("Is first string empty? " + str1.isEmpty());
sc.close();
}
}
