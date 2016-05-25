package spring.custom.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import spring.custom.service.CustomUserDetailService;

@Service
public class Provider implements AuthenticationProvider {

	private @Autowired CustomUserDetailService userDetailsService;

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		UsernamePasswordAuthenticationToken token =new  UsernamePasswordAuthenticationToken(authentication.getPrincipal(), authentication.getCredentials());
		System.out.println(token);
		return token;
	}

	public boolean supports(Class<?> arg0) {
		return true;
	}

}
