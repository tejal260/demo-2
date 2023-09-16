public class StringPractice
{ static StringPractice stringPractice = new StringPractice();// created object for StringPractice class

 public static void main  (String [] args){

     stringPractice.concatenation("white and", "bright");
     stringPractice.contains();
     stringPractice.symbol();
     stringPractice.endswithexample();
     stringPractice.equals();
     stringPractice.length();
     stringPractice.startswith();
     stringPractice.substring();
     stringPractice.replace();
     stringPractice.extractnumber();
 }




 void concatenation (String colour, String name ) {

     System.out.println(colour+ " " + name);// concatenation of colour and name
 }


 void contains (){
    String str1 = " I do runnig and cycling";
    String str2= "and ";
    System.out.println("original string "+str1);
    System.out.println("Specified sequence of char values"  + " "+ str2);
    System.out.println(str1.contains(str2));
 }
 void symbol(){

     String s = " hello!how are you?";
     String newstring = s.replaceAll("[^a-zA-Z]+"," ");
     System.out.println("new string:"+ newstring);
}

void endswithexample() {

     String s1="Welcome to home";
     System.out.println(s1.endsWith("e"));
     System.out.println(s1.endsWith("home"));
}

void equals() {

    String colour1 = "Blue";
    String colour2= "Red";
    String colour3="blue";// test any of the above strings equal to one another
  boolean equals1= colour1.equalsIgnoreCase(colour2);
  boolean equals2= colour1.equalsIgnoreCase(colour3);
// display the result of the equality check
        System.out.println("\"" + colour1+"\" equals \"" +
                colour2+"/ " + equals1);
        System.out.println("\"" + colour1+ "\" equals \"" +
                colour3+"/"+equals2);
 }
 static void length(){
String str = "googlesearch.com";
int len = str.length();;
System.out.println("The string length of '"+str+"' is: "+len);

}

static void startswith(){
 String str1= "coffee is my favourite drink.";
 String str2= "Tea is also my favourite drink.";
 String startStr= "coffee";
 boolean starts1= str1.startsWith(startStr);
 boolean starts2= str2.startsWith(startStr);
    System.out.println( str1 + " starts with " +
            startStr + "? " + starts1);
    System.out.println(str2 + " starts with " +
            startStr + "? " + starts2);
}

static void substring(){
  String str = " There was a heavy rainfall yesterday";
    String new_str = str.substring(10, 26);

    // Display the two strings for comparison.
    System.out.println("old = " + str);
    System.out.println("new = " + new_str);
}

static void replace(){
 String str = "naresh dholakiya";

    String new_str = str.replace('d', 'f');

    // Display the strings for comparison.
    System.out.println("Original string: " + str);
    System.out.println("New String: " + new_str);
}

static void extractnumber(){
String str= "my phone number01 is 77758962";

String digits = str.replaceAll("[^0-9]", "");

    System.out.println(digits);
}
}




