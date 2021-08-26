package controller;
public class ThreadId extends Thread{
	private long id;
	@SuppressWarnings("unused")
	private ThreadId(long id){
		this.id =id;
	}
	public ThreadId() {
		// TODO Auto-generated constructor stub
	}
	public void run(){
		getThreadId();
		
	
	}
	private void getThreadId() {
		// TODO Auto-generated method stub
		id = getId();
		System.out.println("TID ----> "+id);
	}
	
}

