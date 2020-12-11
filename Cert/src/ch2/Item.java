package ch2;

public class Item {

	
	private String description;
	
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public static void modifyDesc(Item item,String desc) {
		item = new Item();
		item.setDescription(desc);
	}

	public static void main(String[] args) {
       Item it = new Item();
       it.setDescription("GobStopper");
       Item it2 = new Item();
       it2.setDescription("FIzzylifting");
       modifyDesc(it,"Scrundiddlyumptious");
       System.out.println(it.getDescription());
       System.out.println(it2.getDescription());
	}

}
