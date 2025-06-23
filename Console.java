/* Name-Nang Nu Nu Aye
 * Id-6643005
 * Section-545
 */
package Quiz2_6643005;

public class Console {
	private String name="";
	private String CPU="";
	private int memory=0;
	
	public void load() {
		System.out.println("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void play() {
		System.out.println("Name:"+ name);
		System.out.println("CPU:"+ CPU);
		System.out.println("Memory:"+ memory+"GB");
		load();
	}
	

}
class Ps extends Console{
	private String model="";
	
	public Ps() {
		super();
		this.model="";
	}
	public void  form_factor() {

	}
	@Override
	public void load() {
		System.out.println("Load from Microsoft Store");
	}
	
	
}
class Xbox extends Console{
	private String Gen="";
	
	public Xbox() {
		super();
		this.Gen="";
	}
	public void store_option() {
		System.out.println("Name:"+getName());
		System.out.println("CPU:"+getCPU());
		System.out.println("Memory:"+getMemory());
	}

	@Override
	public void load() {
		System.out.println("Load from Xbox Store");
	}
}
