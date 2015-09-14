package com.creditease;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by leo on 15/9/13.
 */
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Caculator caculator = new Caculator();
        String first = req.getParameter("first");
        String second = req.getParameter("second");
        String operator = req.getParameter("operator");

        if(!first.isEmpty()) {
            caculator.setFirst(Double.valueOf(first));
        }

        if (!second.isEmpty()) {
            caculator.setSecond(Double.valueOf(second));
        }
        caculator.setOperator(operator);

        String result = caculator.caculate();

        /*
         * 将计算结果重新赋值给当前JSP。
         */
        req.setAttribute("first", first);
        req.setAttribute("second", second);
        req.setAttribute("operator", operator);
        req.setAttribute("result", result);

        req.getRequestDispatcher("calate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
