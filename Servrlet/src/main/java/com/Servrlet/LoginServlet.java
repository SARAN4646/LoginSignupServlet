package com.Servrlet;
import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("pass");
        Loginservice s = new Loginservice();
        ((Loginservice) s).createUser(name, password);
        
        Loginservice s1 = new Loginservice();
        if (s1.getUsers(name) != null) {
            res.getWriter().append("success");
        } else {
            res.getWriter().append("failure");
        }

        System.out.println("get");
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
    {
        BufferedReader reader = req.getReader();
        StringBuilder requestBody = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null)
        {
            requestBody.append(line);
        }
        System.out.println(requestBody.toString());
    }
}
