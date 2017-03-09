package ShengChanZheXIaoFeiZhe_WaitNotify;
//生产者
public class Producer implements Runnable {
	private PublicBox box;
	public Producer(PublicBox box) {
		// TODO Auto-generated constructor stub
		this.box=box;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			try{
				System.out.println("pro i:"+i);
				Thread.sleep(30);
			}catch (Exception e) {
				e.printStackTrace();
			}
			box.increase();
		}
		
		
	}

}
