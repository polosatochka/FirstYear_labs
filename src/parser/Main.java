package parser;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.util.ArrayList;

import static parser.Parser.*;
import static parser.Writer.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList<String> dates = new ArrayList<>();
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<String> prices = new ArrayList<>();
        ArrayList<String> innerLinks = new ArrayList<>();
        ArrayList<String> descriptions = new ArrayList<>();
        ArrayList<String> viewers = new ArrayList<>();

        //подключение к сайту
        String url = "https://auto.drom.ru/kia/cee~d/";
        Document document = Jsoup.connect(url).get();
        int adsTotal = totalAddsAmount(document);
        int allPages = totalPagesAmount(adsTotal);
        System.out.println("Общее количество объявлений: " + adsTotal);
        System.out.println("На сайте около " + allPages + " страниц.");

        int testPage = 3;

        //получение данных
        for (int j = 1; j < testPage; j++) {
            String urlNext = "https://auto.drom.ru/kia/cee~d/page" + j + "/";
            Document documentNext = Jsoup.connect(urlNext).get();
            getDates(documentNext, dates);
            getTitles(documentNext, titles);
            getCities(documentNext, cities);
            getPrice(documentNext, prices);
            getDataFromPage(documentNext, innerLinks, descriptions, viewers);
        }

        //запись данных
        Workbook workbook = new HSSFWorkbook(); //Создание excel доумента
        Sheet sheetOne = workbook.createSheet("Результаты парсинга");
        tableHead(sheetOne);


        int rowsCount = 1;
        writeData(sheetOne, dates, titles, cities, prices, innerLinks, descriptions, viewers, rowsCount);

        FileOutputStream fos = new FileOutputStream("C:/Users/Анна/Downloads/testing.xls");
        workbook.write(fos);
        fos.close();
        System.out.println("Данные записаны в файл");
    }
}