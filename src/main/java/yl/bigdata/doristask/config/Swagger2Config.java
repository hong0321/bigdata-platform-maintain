package yl.bigdata.doristask.config;


import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class Swagger2Config {

  @Bean
    public Docket customDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("任务管理")
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("yl.bigdata.doristask"))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * name:开发者姓名
     * url:开发者网址
     * email:开发者邮箱
     * @return
     */
    private ApiInfo apiInfo() {
       Contact contact = new Contact("练冬红", "http://localhost:8080/swagger-ui.html", "923962977@qq.com");
        return new ApiInfoBuilder()
                .title("测试dorisLoadTask API接口")//标题
                .description("API接口的描述")//文档接口的描述
                .termsOfServiceUrl("http://localhost:8080/")
                .contact(contact)
                .version("1.1.0")//版本号
                .build();
    }
}
