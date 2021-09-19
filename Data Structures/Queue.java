
/**
 *
 * @author lukey
 */
public class Queue {
    
    static double[] queue = new double[50];
    static int start = 0; 
    static int next = 0; 
    
    public static void main(String[] args) {
        // TODO code application logic here
        event evt = new event();
        event evt2 = new event();
       // Queue q = new Queue();
       System.out.println(isEmpty());
        evt.setTime(0.12);
        evt2.setTime(0.14);
        //System.out.println(evt.time);
        enqueue(evt.time);
        enqueue(evt2.time);
        enqueue(2.2);
        System.out.println(isEmpty());
        System.out.println("top: ");
        peek();
        
        //for(int x = 0; x < 2; x++)
            //System.out.println(queue[x]);
        //System.out.print(dequeue());
        System.out.println("dequeue: " + dequeue());
        System.out.println("New top: ");
        peek();
       // System.out.println("dequeue: " + dequeue());
        System.out.println("New top: ");
        peek();
        for(int i = 0; i < 50; i++){
            if(dequeue() == 0.0){
            System.out.println(i + ": Nothing to remove from queue: ");
            break;
            }
        System.out.println("dequeue: " + dequeue());
        }
       
        System.out.println(isEmpty());

    }
    
public static void enqueue(double elt){
    

    queue[next] = elt;
    next = next+1;

    if (next > 50){ 
        next = 1;
    }
 
}
    
public static double dequeue(){
    double elt = 0;

    if (start == next){
        elt = 0;
     }else{
        elt = queue[start];
     }
    start = start +1;
    if (start > 50){
        start = 1;
    }
    return queue[start - 1];
}

public static void peek() {
   System.out.println(queue[start]);
}
public static boolean isEmpty() {
   if(dequeue() == 0.0) 
      return true;
   else
      return false;
}
}


class event{
public double time;
public char eventType;
public double serviceDuration;
public event() {

}

void setTime(double time){
    this.time = time;
}
void setEventType(char eT){
    this.eventType = eT;
}
void setServiceDuration(double sD){
    this.serviceDuration = sD;
}



public double getTime(){
    return time;
}
public char getEventType(){
    return eventType;
}
public double getServiceDuration(){
    return serviceDuration;
}
}
