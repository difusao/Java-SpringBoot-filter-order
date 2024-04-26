package com.difusao;

import java.util.Collections;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import com.difusao.filter.DoNothingFilter;
import com.difusao.filter.HeadersLoggingFilter;

@Configuration
public class MyAppConfiguration {

    @Bean
    FilterRegistrationBean<DoNothingFilter> registrationBean() {
        final FilterRegistrationBean<DoNothingFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new DoNothingFilter());
        registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);

        return registrationBean;
    }
}