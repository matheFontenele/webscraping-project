import com.intuitive.webscraping.FetchHtml;

import java.io.IOException;

public class FetchHtmlTest {
    public static void main(String[] args) {
        String URL_PRINCIPAL = "https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos";

        try {
            System.out.println(FetchHtml.fetchHtml(URL_PRINCIPAL));
        } catch (IOException e){
            e.getMessage();
        }

    }
}
