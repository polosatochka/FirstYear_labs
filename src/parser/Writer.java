package parser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.ArrayList;

public class Writer {

    //Метод заполнения шапки Листа 1
    public static void tableHead(Sheet sheetOne) {
        Row row0 = sheetOne.createRow(0);

        Cell cell0 = row0.createCell(0);
        cell0.setCellValue("Время подачи");
        sheetOne.autoSizeColumn(0);
        Cell cell2 = row0.createCell(1);
        cell2.setCellValue("Модель");
        sheetOne.autoSizeColumn(1);
        Cell cell3 = row0.createCell(2);
        cell3.setCellValue("Город");
        sheetOne.autoSizeColumn(2);
        Cell cell4 = row0.createCell(3);
        cell4.setCellValue("Цена");
        sheetOne.autoSizeColumn(3);
        Cell cell5 = row0.createCell(4);
        cell5.setCellValue("Ссылка");
        sheetOne.autoSizeColumn(4);
        Cell cell6 = row0.createCell(5);
        cell6.setCellValue("Описание");
        sheetOne.autoSizeColumn(5);
        Cell cell7 = row0.createCell(6);
        cell7.setCellValue("Просмотры");
        sheetOne.autoSizeColumn(6);
    }

    //заполнение Листа 1 информацией
    public static void writeData(Sheet sheetNext, ArrayList<String> dates, ArrayList<String> titles,
                                 ArrayList<String> cities, ArrayList<String> prices, ArrayList<String> innerLinks,
                                 ArrayList<String> descriptions, ArrayList<String> viewers, int rowCounter) {
        for (int i = 0; i < dates.size(); i++) {
            Row row = sheetNext.createRow(rowCounter);

            Cell cell0 = row.createCell(0);
            cell0.setCellValue(dates.get(i));
            sheetNext.autoSizeColumn(0);

            Cell cell1 = row.createCell(1);
            cell1.setCellValue(titles.get(i));
            sheetNext.autoSizeColumn(1);

            Cell cell2 = row.createCell(2);
            cell2.setCellValue(cities.get(i));
            sheetNext.autoSizeColumn(2);

            Cell cell3 = row.createCell(3);
            cell3.setCellValue(prices.get(i));
            sheetNext.autoSizeColumn(3);

            Cell cell4 = row.createCell(4);
            cell4.setCellValue(innerLinks.get(i));
            sheetNext.autoSizeColumn(4);

            Cell cell5 = row.createCell(5);
            cell5.setCellValue(descriptions.get(i));
            sheetNext.autoSizeColumn(5);

            Cell cell6 = row.createCell(6);
            cell6.setCellValue(viewers.get(i));
            sheetNext.autoSizeColumn(6);

            rowCounter++;}

//            dates.clear();
//            titles.clear();
//            cities.clear();
//            prices.clear();
//            innerLinks.clear();
//            descriptions.clear();
//            viewers.clear();
    }
}
