import com.intuitive.webscraping.FetchHtml;
import com.intuitive.webscraping.PdfExtractor;

import java.io.IOException;
import java.util.List;

public class PdfExtractorTest {
    public static void main(String[] args) throws IOException {
        String URL_PRINCIPAL = "https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos";
        String HTML = FetchHtml.fetchHtml(URL_PRINCIPAL);

        List<String> lista = PdfExtractor.extractPdfLinks(HTML);

        System.out.println(lista.size());

        for (String item : lista){
            System.out.println(item);
        }
    }
}
