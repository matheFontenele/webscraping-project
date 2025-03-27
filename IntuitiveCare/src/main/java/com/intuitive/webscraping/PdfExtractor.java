package com.intuitive.webscraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class PdfExtractor {
    public static List<String> extractPdfLinks(String html){
        List<String> pdflinks = new ArrayList<>();

        //Converte o HTML para um documento Jsoup
        Document document = Jsoup.parse(html);

        //Seleciona todas as tags <a> que possuem um atritubo href terminado em .pdf
        Elements links = document.select("a[href$=.pdf][href*=anexo]");

        //itera sobre os links encontrados e adiciona a lista
        for (Element link : links){
            pdflinks.add(link.absUrl("href")); //Pega o link absoluto do PDF
        }

        return pdflinks;
    }
}
