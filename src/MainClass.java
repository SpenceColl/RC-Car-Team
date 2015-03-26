import de.hardcode.jxinput.Axis;
import de.hardcode.jxinput.Button;
import de.hardcode.jxinput.Directional;
import de.hardcode.jxinput.JXInputDevice;
import de.hardcode.jxinput.JXInputManager;


public class MainClass {

	private JXInputManager IManager;
	
	public static void main(String[] args) {

		JXInputManager IManager = null;
		
		
		System.out.println(IManager.getNumberOfDevices());
		IManager.reset();
		System.out.println(IManager.getNumberOfDevices());
	}


}
