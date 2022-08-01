package Curs10;

public enum EnumExample {
	
	DEV("http://dev.com"),
	QA("http://qa.com"),
	PP("http://pp.com"),
	PROD("http://prod.com");
	
	private String url;
	
	private EnumExample(String s) {
		// TODO Auto-generated constructor stub
		this.url = s;
	}
	
	public String getUrl() {
		return url;
	}

}
