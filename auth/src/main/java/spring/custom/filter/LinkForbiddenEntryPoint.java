package spring.custom.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
@Component
public class LinkForbiddenEntryPoint implements AuthenticationEntryPoint{

	public void commence(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse,
			AuthenticationException paramAuthenticationException) throws IOException, ServletException {
		//link forbidden
		System.out.println(paramAuthenticationException);
	}

}
