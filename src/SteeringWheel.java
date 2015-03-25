import de.hardcode.jxinput.Axis;
import de.hardcode.jxinput.Button;
import de.hardcode.jxinput.Directional;
import de.hardcode.jxinput.JXInputDevice;
import de.hardcode.jxinput.directinput.DirectInputDevice;


public class SteeringWheel extends DirectInputDevice implements JXInputDevice{

	public SteeringWheel(int dev1) {
		super(dev1);
	}
	public Axis getAxis(int arg0) {
		return null;
	}

	public Button getButton(int arg0) {
		return null;
	}

	public Directional getDirectional(int arg0) {
		return null;
	}

	public int getMaxNumberOfAxes() {
		return 0;
	}

	public int getMaxNumberOfButtons() {
		return 0;
	}

	public int getMaxNumberOfDirectionals() {
		return 0;
	}

	public String getName() {
		return null;
	}

	public int getNumberOfAxes() {
		return 0;
	}

	public int getNumberOfButtons() {
		return 0;
	}

	public int getNumberOfDirectionals() {
		return 0;
	}

}
