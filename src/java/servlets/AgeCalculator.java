package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculator
        extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;  
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        String age = request.getParameter("age_input");
        String message="";
        
        
        if (age.equals("")){
            message = "You must give your current age.";            
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        try{
        int ageParsed = Integer.parseInt(age);
        
        if (ageParsed <= 0 ){
            message = "You must give your current age.";         
            
        }else{
         message = "Your age next birthday will be "+(ageParsed+1);               }
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        } catch (NumberFormatException e){
            message = "You must enter a number.";
            request.setAttribute("message", message);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
        }       
    
    }
}
    
    