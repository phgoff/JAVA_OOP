public class ExtractIt{

	public static String extract(String url){
		String[] str= url.split("/");
		String name = str[str.length-1 ];

		if(name.startsWith("*"))
			name = "_" + name.substring(1,name.length()-1);

		return name;

	}
	
	public static void main(String[] args) {
		System.out.println(extract("http://example.com/files/public_files/test.zip"));
		System.out.println(extract("www.abc.com/pub/*aaa.html"));

	}


}