package br.com.kaiomuniz.configurations;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfiguration {

	 @Bean
	 OpenAPI customOpenAPI() {
		 return new OpenAPI()
				 .info(new Info()
						 .title("API Agenda - Kaio Muniz")
	                     .version("1.0")
	                     .description("Documentação da API desenvolvida pelo estudante Kaio Muniz")
	                     .contact(new Contact()
	                    		 .name("Suporte Kaio Muniz")
	                             .url("https://www.kaiomuniz.com.br/contato")
	                             .email("suporte@kaiomuniz.com.br"))
	                     .license(new License()
	                    		 .name("Licença MIT")
	                             .url("https://opensource.org/licenses/MIT")))
	                	 .servers(List.of(
	                        new Server().url("http://localhost:8088").description("Ambiente de Desenvolvimento"),
	                        new Server().url("https://api.kaiomuniz.com.br").description("Ambiente de Produção")
	                ));
	    }
}
