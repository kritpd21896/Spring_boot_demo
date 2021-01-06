package com.spring.demo.project.Springdemoproject;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfiguration {
	// MessageDispatcherServlet
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {

		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);

		return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
	}

	@Bean(name = "users")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema userSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("UserPort");
		definition.setTargetNamespace("http://springdemoproject/users");
		definition.setLocationUri("/ws");
		definition.setSchema(userSchema);

		return definition;
	}

	// /ws/users.wsdl
	// user-details.xsd
	@Bean
	public XsdSchema userSchema() {

		return new SimpleXsdSchema(new ClassPathResource("user-details.xsd"));
	}

}
