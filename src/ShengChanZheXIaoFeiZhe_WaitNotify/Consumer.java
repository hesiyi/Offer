package ShengChanZheXIaoFeiZhe_WaitNotify;

//消费者
public class Consumer implements Runnable {
	private PublicBox box;
	public Consumer(PublicBox box) {
		// TODO Auto-generated constructor stub
		this.box=box;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			try{
				System.out.println("con i:"+i);
				Thread.sleep(3000);// 这里设置跟上面30不同是为了 盒子中的苹果能够增加，不会生产一个马上被消费  
			}catch (Exception e) {
				e.printStackTrace();
			}
			box.decreace();
		}
		
	}

}
