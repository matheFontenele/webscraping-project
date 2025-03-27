package com.intuitive.webscraping;

import net.lingala.zip4j.ZipFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileCompressor {

    public static void compressFiles(String folderPath) {
        String zipFilePath = folderPath + File.separator + "arquivos.zip"; // Caminho do arquivo zip a ser criado

        try {
            File folder = new File(folderPath);
            File[] pdfFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf")); // Lista apenas os arquivos PDF

            if (pdfFiles == null || pdfFiles.length == 0) {
                System.out.println("Nenhum arquivo PDF encontrado para compactação");
                return;
            }

            // Cria o arquivo Zip
            ZipFile zipFile = new ZipFile(zipFilePath);

            // Adiciona cada arquivo PDF ao arquivo zip
            List<File> filesToAdd = new ArrayList<>();

            // Adiciona cada arquivo PDF na lista
            filesToAdd.addAll(Arrays.asList(pdfFiles));

            // Adiciona os arquivos na lista ao zip
            zipFile.addFiles(filesToAdd); // Método correto para adicionar múltiplos arquivos

            System.out.println("Arquivos compactados em: " + zipFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
