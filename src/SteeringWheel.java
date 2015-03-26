import de.hardcode.jxinput.Axis;
import de.hardcode.jxinput.Button;
import de.hardcode.jxinput.Directional;
import de.hardcode.jxinput.JXInputDevice;
import de.hardcode.jxinput.directinput.DirectInputDevice;


public class SteeringWheel extends DirectInputDevice implements JXInputDevice{

	public SteeringWheel(int dev) 
		{super(dev);}
	
	public Axis getAxis(int axis) {
		return super.getAxis(axis);}

	public Button getButton(int butt) 
		{return super.getButton(butt);}

	public Directional getDirectional(int dir) 
		{return super.getDirectional(dir);}

	public int getMaxNumberOfAxes() 
		{return super.getMaxNumberOfAxes();}

	public int getMaxNumberOfButtons() 
		{return getMaxNumberOfButtons();}

	public int getMaxNumberOfDirectionals() 
		{return getMaxNumberOfDirectionals();}

	public String getName() 
		{return super.getName();}

	public int getNumberOfAxes() 
		{return super.getNumberOfAxes();}

	public int getNumberOfButtons() 
		{return super.getNumberOfButtons();}

	public int getNumberOfDirectionals() 
		{return super.getNumberOfDirectionals();}

}
