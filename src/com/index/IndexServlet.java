package com.index;

import java.io.IOException;

/**
 * Created by smallgoodboy on 2014/6/4.
 */
public class IndexServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String clientSay = request.getParameter("say");
        String serverResponse = clientSay+" received";
        response.getWriter().write(serverResponse);
        response.flushBuffer();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
