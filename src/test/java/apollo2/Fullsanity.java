package apollo2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Fullsanity 
	{
				//series set
		@Test(priority=1)
		 void staticpage()
		{
			 given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://apollo2.humanbrain.in/public/footer.html")
	        .then()
	            .statusCode(200)
	            .log().all();
		}
		@Test(priority=2)
		 void getloginuser()
		{
			 String jsonBody = "{\"user_name\":\"software team\",\"user_hash\":\"106900966448254245591\",\"email\":\"teamsoftware457@gmail.com\",\"image\":\"https://lh3.googleusercontent.com/a/ACg8ocJ98wDtdlOS-ADlQ2n_WnL1iY7vWcGr8bWfkxU-9ntv=s96-c\"}";
					 given()
		            .auth()
		            .preemptive()
		            .basic("admin", "admin")
		            .contentType(ContentType.JSON) 
		            .body(jsonBody) 
		        .when()
		            .post("https://apollo2.humanbrain.in/CC/getLoginUser")
		        .then()
		            .statusCode(200)
		            .log().all();
		}
		@Test(priority=3)
		void activitylogin()
		{
			String jsonBody = "{\"user\":\"124\",\"action\":\"Login\",\"info\":\" \"}";
		    given()
           .auth()
           .preemptive()
           .basic("admin", "admin")
           .contentType(ContentType.JSON) 
           .body(jsonBody) 
       .when()
           .post("https://apollo2.humanbrain.in/activities/Activity/")
       .then()
           .statusCode(201)
           .log().all();
		}
		@Test(priority=4)
		void detailsofseriesset()
		{
			 given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://apollo2.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/106900966448254245591")
	        .then()
	            .statusCode(200)
	            .log().all();
		}
			//Viewer page
		@Test(priority=5)
		void Brainaccessactivity()
		{
			String jsonBody = "{\"user\":124,\"action\":\"Brain Access\",\"info\":\"Brain Id - 15\"}";
		    given()
           .auth()
           .preemptive()
           .basic("admin", "admin")
           .contentType(ContentType.JSON) 
           .body(jsonBody) 
       .when()
           .post("https://apollo2.humanbrain.in/activities/Activity/")
       .then()
           .statusCode(201)
           .log().all();
		}
		
		@Test(priority=6)
		void Getthumbnailsdetails()
		{
			given()
	            .auth()
	            .preemptive()
	            .basic("admin", "admin")
	        .when()
	            .get("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-15:-1:-1")
	        .then()
	            .statusCode(200)
	            .log().all();
		}
		
		@Test(priority=7)
		void Brainviewerdetails()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-15:-1:-1")
        .then()
            .statusCode(200)
            .log().all();
		}
		//HD
		
		@Test(priority=8)
		void HDBrainviewerdetails()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-15:10:1006")
        .then()
            .statusCode(200)
            .log().all();
		}
		

		@Test(priority=9)
		void HDgetannotationtype()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin")
        .then()
            .statusCode(200)
            .log().all();
		}
		

		@Test(priority=10)
		void HDgetdetailsofseriesset()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/108775719029651384883")
        .then()
            .statusCode(200)
            .log().all();
		}
		@Test(priority=11)
		void HDactivity()
		{
			String jsonBody = "{\"user\":57,\"action\":\"High Resolution\",\"info\":\"SS-15:10:1006\"}";
		    given()
           .auth()
           .preemptive()
           .basic("admin", "admin")
           .contentType(ContentType.JSON) 
           .body(jsonBody) 
       .when()
           .post("https://apollo2.humanbrain.in/activities/Activity/")
       .then()
           .statusCode(201)
           .log().all();
		}
		
		//Atlas Editor
		
		@Test(priority=12)
		void Atlasappatlasregistration()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/7832/")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=13)
		void Atlasgetthumbnailsdetails()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-15:10:1006")
        .then()
            .statusCode(200)
            .log().all();
		}
		

		@Test(priority=14)
		void Atlasgetbrainviewerdetails()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-15:10:1006")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=15)
		void Atlasgetccuserid()
		{
			String jsonBody = "{\"user_hash\":\"108775719029651384883\"}";
		    given()
           .auth()
           .preemptive()
           .basic("admin", "admin")
           .contentType(ContentType.JSON) 
           .body(jsonBody) 
       .when()
           .post("https://apollo2.humanbrain.in/CC/getCCUserId")
       .then()
           .statusCode(200)
           .log().all();
		}
		
		@Test(priority=16)
		void Atlasgetcontributordetails()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-15:10:1006:1006&annotationtype=6")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=17)
		void Atlasappannotationtype()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAnnotationType/")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=18)
		void Atlasdefaultappannotationtype()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAnnotationType/6/")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		//Cell annotation
		@Test(priority=19)
		void Cellappatlasregistration()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/11524/")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=20)
		void Cellgetthumbailsdetail()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-15:10:1006")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=21)
		void Cellgetbrainviewerdetail()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-15:10:1006")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=22)
		void Cellccuserid()
		{
			String jsonBody = "{\"user_hash\":\"108775719029651384883\"}";
		    given()
           .auth()
           .preemptive()
           .basic("admin", "admin")
           .contentType(ContentType.JSON) 
           .body(jsonBody) 
       .when()
           .post("https://apollo2.humanbrain.in/CC/getCCUserId")
       .then()
           .statusCode(200)
           .log().all();
		}
		@Test(priority=23)
		void Cellappannotationtype()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAnnotationType/")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=24)
		void Cellgetseriesset()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/108775719029651384883")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=25)
		void Celldefaultapptype()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAnnotationType/3/")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=26)
		void Cellcontributors()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=PixelAnnotation::IIT:V1:SS-15:10:1006:1006&annotationtype=3")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=27)
		void Cellannotatedtileslist()
		{
			String jsonBody = "{\"bid\":37,\"sec\":1006,\"annotationtype\":3,\"seriestype\":\"NISSL\",\"tilesize_ip\":\"512\",\"tilesize_op\":512}";
		    given()
           .auth()
           .preemptive()
           .basic("admin", "admin")
           .contentType(ContentType.JSON) 
           .body(jsonBody) 
       .when()
           .post("https://apollo2.humanbrain.in/GW/listAnnotatedTiles")
       .then()
           .statusCode(200)
           .log().all();
		}
		
		@Test(priority=28)
		void Cellwiptilelist()
		{
			String jsonBody = "{\"bid\":37,\"sec\":1006,\"annotationtype\":3,\"seriestype\":\"NISSL\",\"tilesize_ip\":\"512\",\"tilesize_op\":512}";
		    given()
           .auth()
           .preemptive()
           .basic("admin", "admin")
           .contentType(ContentType.JSON) 
           .body(jsonBody) 
       .when()
           .post("https://apollo2.humanbrain.in/GW/listWipTiles")
       .then()
           .statusCode(200)
           .log().all();
		}
		

		@Test(priority=29)
		void CellAGtilelist()
		{
			String jsonBody = "{\"bid\":37,\"sec\":1006,\"annotationtype\":3,\"seriestype\":\"NISSL\",\"tilesize_ip\":\"512\",\"tilesize_op\":512}";
		    given()
           .auth()
           .preemptive()
           .basic("admin", "admin")
           .contentType(ContentType.JSON) 
           .body(jsonBody) 
       .when()
           .post("https://apollo2.humanbrain.in/GW/listAGTiles")
       .then()
           .statusCode(200)
           .log().all();
		}
		
		//Registration

		@Test(priority=30)
		void Regappatlasregistration()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/11534/")
        .then()
            .statusCode(200)
            .log().all();
		}
		@Test(priority=31)
		void Regcontributors()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=Registration::IIT:V1:SS-15:10:1006:1006&annotationtype=1971")
        .then()
            .statusCode(200)
            .log().all();
		}
		
		@Test(priority=32)
		void Reguserdetails()
		{
			given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=Registration::IIT:V1:SS-15:10:1006:1006&annotationtype=197")
        .then()
            .statusCode(200)
            .log().all();
		}
		

	
	}
