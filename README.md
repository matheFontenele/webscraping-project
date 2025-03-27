# 🕸️ Web Scraping

> **Projeto para automação de download, extração e compressão de arquivos PDF usando Web Scraping.**

📌 Progama criado para teste de nivelamente, com função de capturar arquivos PDFs de um link distinto e compactalos em .ZIP.

---

## 📌 Funcionalidades

✔️ **Web Scraping:** Coleta os links de PDFs diretamente do site.  
✔️ **Download Automático:** Salva os arquivos PDF em uma pasta local.   
✔️ **Compactação:** Cria um arquivo ZIP/RAR com os PDFs extraídos.

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia     | Descrição |
|---------------|-----------|
| **Java 17+**  | Linguagem principal do projeto |
| **Maven**     | Gerenciamento de dependências |
| **Jsoup**     | Biblioteca para Web Scraping |
| **PDFBox**    | Extração de conteúdo dos PDFs |

---

## 📂 Estrutura do Projeto

```plaintext
projeto-webscraping/
├── src/
│   ├── main/
│   │   ├── java/com/intuitive/webscraping/
│   │   │   ├── FileDownloader.java       # Baixa os PDFs do site
│   │   │   ├── PdfExtractor.java         # Extrai links dos PDFs do HTML
│   │   │   ├── ScrapGetURL.java          # Captura o código-fonte HTML da página
│   │   │   ├── FileCompressor.java       # Compacta os PDFs baixados
│   │   │   ├── Main.java                 # Executa todas as funções
│   │   ├── resources/                    # Pasta para armazenar os PDFs baixados
│   ├── test/
├── pom.xml                               # Configuração do Maven
├── README.md                             # Documentação do projeto
├── .gitignore                            # Arquivos a serem ignorados no Git

# 🛠️ Configuração do Projeto Web Scraping

```

## 📌 Pré-requisitos  

✔️ **Java 17+** instalado [(Baixar aqui)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)  
✔️ **IntelliJ IDEA (Community ou Ultimate)** [(Baixar aqui)](https://www.jetbrains.com/idea/download/)  
✔️ **Maven** instalado [(Guia de instalação)](https://maven.apache.org/install.html)  
✔️ **Git** instalado [(Baixar aqui)](https://git-scm.com/downloads)  

---
## Guia passo a passo para configurar o ambiente de desenvolvimento no IntelliJ IDEA

## 1️⃣ Clonar o Repositório
```plaintext
git clone https://github.com/seu-usuario/projeto-webscraping.git
cd projeto-webscraping
```
---
## 📦 Instalar Dependências
```plaintext
mvn clean install
```
---
## ▶️ Executar o Projeto
```plaintext
mvn exec:java -Dexec.mainClass="com.intuitive.webscraping.Main"
```
---
## 👤 Matheus Fontenele
📧 Email: matheusfontenele979700@email.com  
🔗 [LinkedIn](https://www.linkedin.com/in/matheus-fontenele-28843734b/) | [GitHub](https://github.com/matheFontenele)
