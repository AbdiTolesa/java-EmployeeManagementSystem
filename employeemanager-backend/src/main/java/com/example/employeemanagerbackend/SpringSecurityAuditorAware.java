package com.example.employeemanagerbackend;

import org.springframework.data.domain.AuditorAware;
import com.example.employeemanagerbackend.Employee;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.User;
import java.util.Optional;

import com.example.employeemanagerbackend.SecurityUtils;

class SpringSecurityAuditorAware implements AuditorAware<String> {

    // @Override
    // public Optional<User> getCurrentAuditor() {
  
    //   return Optional.ofNullable(SecurityContextHolder.getContext())
    //           .map(SecurityContext::getAuthentication)
    //           .filter(Authentication::isAuthenticated)
    //           .map(Authentication::getPrincipal)
    //           .map(User.class::cast);
    // }

    @Override
    public Optional<String> getCurrentAuditor() {
        String userName = SecurityUtils.getCurrentUserLogin();
        String username = userName != null ? userName : "Anonymous";
        return Optional.ofNullable(username);
    }

  }