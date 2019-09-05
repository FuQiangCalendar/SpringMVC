package springMVC.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import springMVC.tools.exception.ServiceException;
import springMVC.tools.result.Result;
import springMVC.tools.string.JsonUtil;

@Slf4j
public class ExceptionInterceptor implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		log.error("异常:" + ex.getMessage(), ex);
		/*	使用response返回	*/
        response.setContentType(MediaType.APPLICATION_JSON_VALUE); //设置ContentType
        response.setCharacterEncoding("UTF-8"); //避免乱码
        response.setHeader("Cache-Control", "no-cache, must-revalidate");
        String msg = "操作失败！";
        if(ex instanceof ServiceException)
        	msg = ex.getMessage();
        Result fail = Result.fail(msg);
        String exceptionMsg = JsonUtil.bean2json(fail);
        try {
            response.getWriter().write(exceptionMsg);
            response.getWriter().flush();
			response.getWriter().close();
        } catch (IOException e) {
           log.error("与客户端通讯异常:"+ e.getMessage(), e);
        }
		return new ModelAndView();
	}

}
