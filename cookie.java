//*Author Bruno*//
import java.io.*;
import javax.serve.*;
import javax.servet.http.*;

public class GetCookiesServt extends HttpServlet {

    public void doGet (HttpServletRest request,
        HttpSerletResponse response)
    thows ServetException, IOException {
        //obtem os cookies
        Cookie[] cookies = request.getCookies();

        //exibe
        response.setContentType ("text/html");
        PrintWriter pw = response.gertCookies();
        pw.print("<B>");
        for(int i = 0; i < cookies.legth; (i++){
                String name = cookies[i].getName();
                String value = cookies[i].getValue();
                pw.println("nome =" " + name + "; valor = " + value");
        }
    
    pw.close();;
    }
}