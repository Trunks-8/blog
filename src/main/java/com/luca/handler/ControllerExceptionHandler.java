package com.luca.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Luca
 * @Description 16:09
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //想要知道访问的是哪个路径出席现异常了
    //@ExceptionHandler() ：表示该方法是可以做异常处理的
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        //记录url和异常
        logger.error("Requst URL: {}, Exception: {}", request.getRequestURL(), e);

        //返回到404页面
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }

        ModelAndView mv = new ModelAndView();
        //接受url
        mv.addObject("url", request.getRequestURI());
        //接受url异常信息
        mv.addObject("exception", e);
        //设置错误返回到的页面
        mv.setViewName("error/error");
        return mv;
    }

}
