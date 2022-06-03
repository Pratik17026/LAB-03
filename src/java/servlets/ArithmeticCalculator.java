package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculator extends HttpServlet {
    
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String message = "---";
        
        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        request.setAttribute("first", num1);
        request.setAttribute("second", num2);
        String message = "";
        
        
        try{
            int firstNum = Integer.parseInt(num1);
            int secondNum = Integer.parseInt(num2);
            int resultNum=0;
            
            String action  = request.getParameter("calc");
            switch(action){
                case "+": resultNum = firstNum + secondNum;
                    break;
                case "-": resultNum = firstNum - secondNum;
                    break;
                case "*": resultNum = firstNum * secondNum;
                    break;
                case "%": resultNum = firstNum % secondNum;
                    break;           }
            message="" + resultNum;
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            
        }catch (NumberFormatException e){
            message = "invalid";
            request.setAttribute("message", message);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
    }    
    }

