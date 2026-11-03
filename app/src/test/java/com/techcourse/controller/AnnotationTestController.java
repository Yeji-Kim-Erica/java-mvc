package com.techcourse.controller;

import com.interface21.context.stereotype.Controller;
import com.interface21.web.bind.annotation.RequestMapping;
import com.interface21.web.bind.annotation.RequestMethod;
import com.interface21.webmvc.servlet.ModelAndView;
import com.interface21.webmvc.servlet.view.JspView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AnnotationTestController {

    @RequestMapping(value = "/annotation-test", method = RequestMethod.GET)
    public ModelAndView get(final HttpServletRequest request, final HttpServletResponse response) {
        return new ModelAndView(new JspView("/annotation-test.jsp"))
                .addObject("name", "테리");
    }

    @RequestMapping(value = "/annotation-test", method = RequestMethod.POST)
    public ModelAndView post(final HttpServletRequest request, final HttpServletResponse response) {
        return new ModelAndView(new JspView("redirect:/annotation-test"));
    }
}
