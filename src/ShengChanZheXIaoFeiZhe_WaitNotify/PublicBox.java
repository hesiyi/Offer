package ShengChanZheXIaoFeiZhe_WaitNotify;

//公共的盒子
public class PublicBox {
	private int apple=0;
	
	public synchronized void increase(){
		while(apple==5){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		apple++;
		System.out.println("生成苹果成功!");
		notify();
		
	}
	
	public synchronized void decreace(){
		while(apple==0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		apple--;
		System.out.println("消费苹果成功");
		notify();
		
	}

	public static void main(String[] args) {
		
		
		PublicBox publicBox=new PublicBox();
		
		Producer producer=new Producer(publicBox);
		Consumer consumer=new Consumer(publicBox);
		
		Thread t1=new Thread(producer);
		Thread t2=new Thread(consumer);
		t1.start();
		t2.start();
		
		
	}
}
