package singleton;

public class SingletonExam {
	
	private static volatile SingletonExam exam;
	
	private SingletonExam() {
		if(exam != null) {
			throw new RuntimeException("Please use getExam method");
		}
		
	}

	public static SingletonExam getExam() {
		
		if(exam == null) {
			synchronized (SingletonExam.class) {
				if(exam == null) {
					exam = new SingletonExam();
					countdown();
				}
			}
		}
		return exam;
	}
	
	public static void countdown() {
		for(int i = 10; i >= 0; i--) {
			System.out.println("Remaining time for the exam:" + i);
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==0) {
				System.out.println("Your time is up.. Thank you for participating");
			}
		}
	}
	
	
	
	
}
