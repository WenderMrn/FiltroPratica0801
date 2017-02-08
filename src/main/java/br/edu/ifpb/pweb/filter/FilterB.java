package br.edu.ifpb.pweb.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="FiltroB",urlPatterns={"/a.do"})
public class FilterB implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FiltroB pre-processamento...");
		chain.doFilter(request, response);
		System. out.println("FiltroB pos-processamento...");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
