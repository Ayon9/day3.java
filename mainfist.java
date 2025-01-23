import java.util.Scanner;

public class mainfist{
    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
        int Sum = 20;
        int sum2 = 30;
        int sum3 = 40;
        String name = "example";
        System.out.println(name);
        System.out.println(Sum + sum2 + sum3 +name);
        int a=150;
 int b=200;
 System.out.println(a+b+Sum+sum2+sum3+ " " + name);
 if (a < b) {
  System.out.println("a is less then b");
}
int j = 0;
while (j < 10) {
  j++;
}
 int newVar = 100;
 int newVar2 = 200;
 if(newVar2 < newVar){
  System.out.println("i am too short");
 }
 else { 
  System.out.println("i am too tall");
 }
int newVar3 = 300;
int newVar4 = 400;
if (newVar3 == newVar4){
  System.out.println("i am not equal");
} else if (newVar3 > newVar4){
    System.out.println("i am greater");
} else {
    System.out.println("i am less");
}
int newVar5 = myObj.nextInt();
int newVar6 = myObj.nextInt();
if (newVar5 == newVar6){
    System.out.println("i am equal");
} else if (newVar5 > newVar6){
    System.out.println("i am greater");
} else {
    System.out.println("i am less");
      }
int button = myObj.nextInt();
if (button == 50){
    System.out.println("button 50 is pressed");
} else if (button == 20){
    System.out.println("button 20 is pressed");
} else if (button == 30){
    System.out.println("button 30 is pressed");
} else {
    System.out.println("no button is pressed");
}
button = myObj.nextInt();
if (button == 50){
    System.out.println("button 50 is pressed");
} else if (button == 20){
    System.out.println("button 20 is pressed");
} else if (button == 30){
    System.out.println("button 30 is pressed");
} else {
    System.out.println("no button is pressed");
}
myObj.nextLine(); // consume the leftover newline
String buttonStr = myObj.nextLine();
switch(buttonStr) {
  case "50":
    System.out.println("button 50 is pressed");
    break;
  case "20":
    System.out.println("button 20 is pressed");
    break;
  case "30":
    System.out.println("button 30 is pressed");
    break;
  default:
    System.out.println("no button is pressed");
}
for(int counter = 0; counter < 10; counter = counter + 1){
  System.out.println("hello world");
}
int i = 0;
while (i < 10) {
  System.out.println("hello world");
  i=i+1;
}
int k = 0;
do {
  System.out.println("hello world");
  k=k+1;
} while (k < 10);
for(int counter = 0; counter < 100; counter = counter + 1){
    System.out.println(counter);
int i2 = 0;
while (i2 < 11) {
 System.out.println(i2);
  i2=i2+1;}
 int j2 = 0;
do {
   System.out.println(j2);
   j2=j2+1;
   } while (j2 < 10);
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
cars[0] = "Opel";
System.out.println(cars[0]);
System.out.println(cars.length);
for (int m = 0; m < cars.length; m++) {
  System.out.println(cars[m]);
  for (String car : cars) {
    System.out.println(car);
  }
 int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

 int length = ages.length;
 
 int lowestAge = ages[0];

 for (int age : ages) {
   if (lowestAge > age) {
     lowestAge = age;
   }
 }
 System.out.println("The lowest age in the array is: " + lowestAge);
}
}
}
}
