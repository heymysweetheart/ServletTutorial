package com.creditease;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by leo on 15/9/9.
 */
public class ServletTutorial extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PersonHomework personHomework = new PersonHomework();
        String weight = req.getParameter("weight");
        double weightD = Double.parseDouble(weight);

        String height = req.getParameter("height");
        double heightD = Double.parseDouble(height);

        String gender = req.getParameter("gender");

        int age = Integer.parseInt(req.getParameter("age"));

        double index = personHomework.getXCDXIndex(gender, weightD,
                heightD, age);

                resp.getOutputStream().write(("你的体重是： " + weightD + " " +
                        "你的身高是： " +
                        heightD + " " + "gender: " + gender + "age: " + age
                        + "你的代谢指数是: " + index).getBytes("GBK"));
    }
}
