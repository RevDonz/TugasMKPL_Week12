import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Jumlah saat ini :" + counter.getCount());
		
		counter.increment();
		counter.increment();
		counter.increment();
		
		System.out.println("Jumlah saat ini :" + counter.getCount());
		
		counter.decrement();
		counter.decrement();
		
		System.out.println("Jumlah saat ini :" + counter.getCount());
		
	}

}
