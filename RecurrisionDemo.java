class RecurrisionDemo{
static String reverse(String str){
if (str.isEmpty()){
return str;
}else{
return reverse(str.SubString(1))+str.charAt(0);
}
}
public static void main(String[]args){
String s="hello";
System.out.println("Reversed String:"+reverse(s));
}
}

