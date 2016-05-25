package spring.custom.filter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

public class SecurityFilter extends AbstractPreAuthenticatedProcessingFilter {

	@Override
	protected Object getPreAuthenticatedCredentials(HttpServletRequest arg0) {
		return true;
	}

	@Override
	protected Object getPreAuthenticatedPrincipal(HttpServletRequest request) {
		if (request.getParameter("username") != null && request.getParameter("username").equals("abc")
				&& request.getParameter("password") != null && request.getParameter("password").equals("abc")) {
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
			return new User("abc", "abc", authorities);
		}
		return null;
	}

}
