package com.api.sportyShoes.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig<HttpSecurity> extends WebMvcConfigurerAdapter {
	
	protected void configure(HttpSecurity http) throws Exception {
		((Object) http)
		.csrf().disable()
        .authorizeRequests()
        	.anyRequest()
        	.authenticated()
        	.and()
        .httpBasic();
        
	}

}
