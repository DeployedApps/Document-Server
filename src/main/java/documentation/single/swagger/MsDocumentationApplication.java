package documentation.single.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@ApiOperation("Products API")
@EnableSwagger2
@@OpenAPIDefinition(@Info(
	title = "Composite Api Gatway cum Document Server",
	description = "This is a Combined-API Gateway cum Document Sevrer. Please select the individual apis from Spec dropdown & Click on right of controller to access the api. Whereas the Openapi definition is avaiable at 
	USER-SERVICES        =>        https://userservice-production-c3f7.up.railway.app/v3/api-docs
	HOTEL-SERVICE        =>         https://hotelservice-production.up.railway.app/v3/api-docs
	RATING-SERVICE       =>         https://ratingservice-production.up.railway.app/v3/api-docs 
  
	Individual Services are also present at below location in Swagger 3 format
  
	 USER-SERVICE          =>        https://userservice-production-c3f7.up.railway.app/swagger-ui/index.html
	 HOTEL-SERVICE         =>        https://hotelservice-production.up.railway.app/swagger-ui/index.html
	 RATING-SERVICE        =>        https://ratingservice-production.up.railway.app/swagger-ui/index.html
  
	 Source code for the services is avaiable at https://github.com/praveen1664/SpringBootMicroserviceExample.git  ",

	contact = @Contact(url = "http://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
))
@EnableConfigurationProperties({SwaggerServicesConfig.class,SwaggerServicesConfig.SwaggerServices.class})
public class MsDocumentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDocumentationApplication.class, args);
	}
}
