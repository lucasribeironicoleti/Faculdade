public class Calcular extends HTTPServlet{
    public processRequest{
        Double celsius = Double.parseDouble(request.getParameter("celsius"));

        Double fahrenheit = celsius * 1.8 + 32;

        request.setAtributte("fahrenheit", fahrenheit);

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}