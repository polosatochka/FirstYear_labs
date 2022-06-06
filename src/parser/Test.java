package parser;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static parser.Parser.*;
import static parser.Writer.tableHead;
import static parser.Writer.writeData;

public class Test {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        boolean exit = false;

        ArrayList<String> dates = new ArrayList<>();
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<String> prices = new ArrayList<>();
        ArrayList<String> innerLinks = new ArrayList<>();
        ArrayList<String> descriptions = new ArrayList<>();
        ArrayList<String> viewers = new ArrayList<>();

        System.out.println("Для начала работы введите r");
        while (!exit) {

            String start = in.nextLine();
            if ("r".equals(start)) {
                //подключение к сайту
                String url = "https://auto.drom.ru/kia/cee~d/";
                Document document = Jsoup.connect(url).get();
                int adsTotal = totalAddsAmount(document);
                int allPages = totalPagesAmount(adsTotal);
                System.out.println("Общее количество объявлений: " + adsTotal);
                System.out.println("На сайте около " + allPages + " страниц.");
                System.out.println("Для начала работы парсера введите p");
            }


            String parse = in.nextLine();
            if ("p".equals(parse)) {
                System.out.println("Сколько страниц вы хотите проанализировать?");
                int page = in.nextInt();

                for (int j = 1; j <= page; j++) {
                    String urlNext = "https://auto.drom.ru/kia/cee~d/page" + j + "/";
                    Document documentNext = Jsoup.connect(urlNext).get();
                    getDates(documentNext, dates);
//                        getTitles(documentNext, titles);
//                        getCities(documentNext, cities);
//                        getPrice(documentNext, prices);
//                        getDataFromPage(documentNext, innerLinks, descriptions, viewers);
                }
                System.out.println("Работа парсера завершена.");
                System.out.println("Записать данные в файл? (да/нет)");
            }


            String answer = in.nextLine();
            if (answer.equals("да")) {
                Workbook workbook = new HSSFWorkbook(); //Создание excel доумента
                Sheet sheetOne = workbook.createSheet("Результаты парсинга");
                tableHead(sheetOne);
                int rowsCount = 1;
                writeData(sheetOne, dates, titles, cities, prices, innerLinks, descriptions, viewers, rowsCount);
                FileOutputStream fos = new FileOutputStream("C:/Users/Анна/Downloads/report.xls");
                workbook.write(fos);
                fos.close();
                System.out.println("Данные записаны в файл, для выхода введите e");
            } else if (answer.equals("нет")) {
                System.out.println("Для выхода введите e. (?Для перезапуска введите p)");
                String e = in.nextLine();
                if ("e".equals(e)) {
                    System.out.println("Завершение программы");
                    exit = true;}
            }
        }
        in.close();
    }
}
