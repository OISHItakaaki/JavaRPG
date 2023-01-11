package RPG;

public class Item1 {
	private String name;
	private int count;
	
	public Item1(String name,int count) {
		this.name = name;
		this.count = count;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}

}
