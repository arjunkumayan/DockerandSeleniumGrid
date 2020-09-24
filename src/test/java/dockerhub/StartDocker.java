package dockerhub;

import java.io.IOException;

import org.testng.annotations.Test;

public class StartDocker {
	
	@Test
	public void startDockerFile() {
			
		Runtime runtime= Runtime.getRuntime();
		try {
			runtime.exec("cmd /c start dockerUp.bat");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
