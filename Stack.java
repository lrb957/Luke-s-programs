import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lukey
 */
public class Stack {

    static Object stack[] = new Object[500];
    static int count = 0;
static int top= 1;

public static void main(String[] args) {
float a = (float) 2.2;
float b = (float) 5.2;
       Passenger p = new Passenger(a, b);
       System.out.println(stack[0]);
       System.out.println(empty());
    try {
        File f = new File("C:\\Users\\lukey\\OneDrive\\Desktop\\Ex1.txt");
        Scanner scan = new Scanner(f);

        while(scan.hasNextLine()){
        String data = scan.nextLine();
        System.out.println(data);

        }
        scan.close();
    }catch (FileNotFoundException ex){
        System.out.println("Error");
        ex.printStackTrace();
     }
   // System.out.println(empty());

push(p.arrivalTime);
push("how are you");
  System.out.println(stack[1]);
       System.out.println(empty());
for(int x = 0; x < count; x++){
System.out.println(stack[x + 1]);
}
pop();
pop();
 System.out.println(stack[1]);

/*
for (String s : stack){
System.out.println(s);
//pop();
}

*/

}

public static void push(Object x){

stack[top++] = x;
count++;
}

public static Object pop(){
count--;
return stack[top--];
}
public static boolean empty(){
if(stack[1] == null){
return true;
}else{
    return false;
}
}
}

class Passenger {
	float arrivalTime;
	float serviceTime;
	double assignmentTime=0;
    int clas = 1;
	public Passenger(float arr,float serv) {
		this.arrivalTime=arr;
		this.serviceTime=serv;
		
	}
	
}

class Server {

	//int type;
	int id;
	ArrayList<Passenger> servedPassengers = new ArrayList<Passenger>();
	
	public void assign(Passenger ps, float assignmentTime)
	{
		ps.assignmentTime = assignmentTime;
		servedPassengers.add(ps);
	}
    }
