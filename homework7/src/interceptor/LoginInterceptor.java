package interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
public class LoginInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url = request.getRequestURI();
	
		if(url.indexOf("/users/register") >= 0 || url.indexOf("/users/tologin") >= 0 || url.indexOf("/users/login") >= 0) {
			return true;
		}
	
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("flag");
		if(obj != null)
			return true;

		request.setAttribute("msg", "还没登录，请先登录！");
		request.getRequestDispatcher("register").forward(request, response);
		return false;
	}
}
