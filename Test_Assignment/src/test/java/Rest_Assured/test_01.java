package Rest_Assured;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
public class test_01 {
	@DataProvider(name="userdata")
	public Object[][] userIds() {
		return new Object[][] {
			{1},{2},{3}
		};
	}
	@Test(dataProvider="userdata")
	public void testUserAPI(int userId) {
		RestAssured.baseURI="https://reqres.in/api";
				Response response=RestAssured.
						given().header("x-api-key","reqres_e5526649a9224fd4b0113165a03b057d")
				.when()
				.get("https://reqres.in/api");
				RestAssured.given()
						.when()
						.get("/api/user/"+userId)
				        .then()
				        .statusCode(200)
				        .extract().response();
				        response.then().body("id",equalTo(userId));
						
	}

}
