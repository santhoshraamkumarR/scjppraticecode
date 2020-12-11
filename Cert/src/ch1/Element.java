package ch1;

public enum Element  {
EARTH,WIND,
FIRE{
	public String info() {
		return "Hot";
	}
	
};

public String info1() {
	return "element";
}

}

