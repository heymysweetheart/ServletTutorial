package com.creditease;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by leo on 15/9/14.
 */
public class ResposeBodyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json; charset=UTF-8");
        Gson gson = new Gson();
        Student tom = new Student(20, "tom");
        String json = gson.toJson(tom);
        resp.getWriter().print(json);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Test
    public void testGson() {
        Gson gson = new Gson();
        Student jim = new Student(15, "jim");
        String json = gson.toJson(jim);
        System.out.println(json);
    }
}
