import com.intuitive.webscraping.FileDownloader;

public class FileDownloadTest {
    public static void main(String[] args) {
        String URL_Anexo = "https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos/Anexo_I_Rol_2021RN_465.2021_RN627L.2024.pdf";
        String PATH = "src";

        FileDownloader.downloadFile(URL_Anexo, PATH);
    }
}
