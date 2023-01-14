package documentation.single.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@ApiOperation("Products API")
@EnableSwagger2
@EnableConfigurationProperties({SwaggerServicesConfig.class,SwaggerServicesConfig.SwaggerServices.class})
public class MsDocumentationApplication {
//	public Docket apiDocket() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.any())
//				.paths(PathSelectors.any())
//				.build();
//	}
	public static void main(String[] args) {
		SpringApplication.run(MsDocumentationApplication.class, args);
	}
}
