package DSL;


import java.util.concurrent.TimeUnit;



public abstract class Tempo {

	public static void aguardarAplicacao(Integer segundos){
		try {
			TimeUnit.SECONDS.sleep(segundos.intValue());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
