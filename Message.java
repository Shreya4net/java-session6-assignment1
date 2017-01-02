import java.util.Timer;

import java.util.TimerTask;

public class Message {
Timer timer;
public  Message(int seconds){
	timer = new Timer();
	timer.schedule(new RemindTask(), seconds*1000);
}
class RemindTask extends TimerTask{
	public void run(){
		System.out.println("Timeout!!");
		timer.cancel();
	}
	}
	public static void main(String args[]){
		new Message(5);
		System.out.println("Timer!!");
}




}
