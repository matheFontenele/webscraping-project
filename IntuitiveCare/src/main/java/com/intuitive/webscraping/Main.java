package com.intuitive.webscraping;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //LINK PRINCIPAL DO SITE
        String URL_PRINCIPAL = "https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos";
        //PASTA A SER CRIADA
        String PATH = "assets";

        try {
            //Fecth do HTML do site principal
            String HTML = FetchHtml.fetchHtml(URL_PRINCIPAL);

            //Cria uma lista com os links de anexo I e II do site principal
            List<String> linksList = PdfExtractor.extractPdfLinks(HTML);

            //Loop for para baixar os PDFs dos links salvos na lista
            for (String link : linksList){
                FileDownloader.downloadFile(link, PATH);
            }

            //Comprime os PDFs salvos na pasta criada em .zip
            FileCompressor.compressFiles(PATH);

        }catch (IOException e){
            e.getMessage();
        }
    }
}