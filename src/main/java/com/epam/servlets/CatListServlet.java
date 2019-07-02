package com.epam.servlets;

import com.epam.domain.Cat;
import com.epam.service.CatService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CatListServlet extends HttpServlet {

//    private CatService catService ;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cat> cats = new ArrayList<>();
        cats.add(Cat.builder().id(1L).name("lala").build());
        cats.add(Cat.builder().id(2L).name("kola").build());
        request.setAttribute("cats", cats);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/cat_list_page.jsp");
        dispatcher.forward(request, response);
    }
}
