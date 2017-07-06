package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class EncodingFilter
 */
public class EncodingFilter implements Filter {

    private Object encoding;

	/**
     * Default constructor. 
     */
    public EncodingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		System.out.println("��ʼ�����ˣ���������");
		chain.doFilter(request, response);
		System.out.println("�ֿ�ʼ�����ˡ���������");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig cfg) throws ServletException {
		//��ȡweb.xml ���EncodingFilter���������Ϣ
		 this.encoding=cfg.getInitParameter("encoding");
		//System.out.println(encoding);
	}

}
