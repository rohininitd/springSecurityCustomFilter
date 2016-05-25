package spring.custom.manager;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class Manager implements AuthenticationManager {

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		User user = (User) authentication.getPrincipal();
		return new UsernamePasswordAuthenticationToken(authentication.getName(),null, user.getAuthorities());
	}

}
