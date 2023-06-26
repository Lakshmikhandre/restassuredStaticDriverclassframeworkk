package requestRepositoryPackage;

public class req_rep_class {

	public static String Base_URI() {
		String Base_URI="https://reqres.in/";
		return Base_URI;
	}
	
	public static String post_resource() {
		String post_resource="/api/users";
		return post_resource;
	}
	
	public static String post_req1() {
		String post_requestbody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return post_requestbody;
	}
}

