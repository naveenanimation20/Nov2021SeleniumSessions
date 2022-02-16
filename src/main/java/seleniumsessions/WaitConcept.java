package seleniumsessions;

public class WaitConcept {

	public static void main(String[] args) {

		//wait: 
		//1. static: Thread.sleep(10000)...e1--3 secs...
		//2. dynamic: timout = 10...e1...3 secs found...
		//2.a: Implicitly Wait
		//2.b: Explict Wait:
			//2.b.1: WebDriverWait (Class): timeOut, polling timeout, ignoring, withMessg
			//2.b.2: FluentWait (Class) : timeOut, polling timeout, ignoring, withMessg
		
		//WebDriverWait(C) --> extends --> FluentWait(C) ---implements->  Wait(I) -- until();
										   //unlit(){}
										   //other methods
		
		
		//never use imp wait in framework
		//case:
		//mix imp wait + exp wait together: never use both waits
		//imp wait : 20 secs
		//e1 --> webdriverwait : 10 secs
		
		//imp wait     |     exp wait
		// 20		   |     10
	//0--> 0           |      0   -> 0 sec
	//x--> 2           |      5   --> 7 secs
	//x--> 0           |      5   --> 5 secs
	//x--> 5	       |      0 ----> 5 secs
	//x-->20	       |     NA  -->   20 secs
	//x --> 0          |     10(max) --> 10 secs
	//x -- 20          |     10(max)  --> 30 secs	
	//x -- 20          |     10(max)  --> 30 secs	--timeout

		
		
		
	}

}
