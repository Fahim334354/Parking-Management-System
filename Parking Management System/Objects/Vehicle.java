package Objects;
import java.io.*;
import javax.swing.*;
public class Vehicle
{
	private String s,s0,s1,s2,s3,s4,s5,s6;
	private File file;
	private FileWriter fw;
	public Vehicle(){}
    public Vehicle(String s, String s0, String s1, String s2, String s3, String s4, String s5, String s6)
{
	this.s = s;
	this.s0 = s0;
	this.s1 = s1;
	this.s2 = s2;
	this.s3 = s3;
	this.s4 = s4;
	this.s5 = s5;
	this.s6 = s6;
}
public void insertInfo()
    {
	try
	{
		    file = new File("./Data/vehicledata.txt");
			if(!file.exists())
			{
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
			fw = new FileWriter(file, true);
			fw.write("=====================================\n");
			fw.write("Owner: "+ s +"\n");
			fw.write("Vehicle No: "+ s0 +"\n");
			fw.write("Phone: "+ s1 +"\n");
			fw.write("Fee: "+ s2 +"\n");
			fw.write("Gender: " + s3 +"\n");
			fw.write("Slot: " + s4 +"\n");
			fw.write("Type: " + s5 + "\n");
			fw.write("Comment: " + s6 + "\n");
			fw.write("=====================================\n");
			fw.flush();
		    fw.close();
	}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error");
		}
    }
}