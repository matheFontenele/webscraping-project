package com.intuitive.webscraping;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FileDownloader {

    public static void downloadFile(String fileUrl, String fileDirectory) {

        try {
            File directory = new File(fileDirectory);
            if (!directory.exists()) {
                directory.mkdirs(); //Cria o diretorio caso não exista
            }

            String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1); // Extrai o nome do arquivo da URL
            File destinationFile = new File(directory, fileName);

            System.out.println("Baixando: " +fileUrl + "...");

            //Usa FileUtils para simplificar a leitura e gravação do arquivo
            FileUtils.copyURLToFile(new URL(fileUrl), destinationFile);

            System.out.println("Arquivo salvo: "+destinationFile.getAbsolutePath());
        } catch (IOException e){
            e.getMessage();
        }

    }
}
