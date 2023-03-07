package replitttt;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class tryExcel {
    public static void main(String[] args) throws IOException {
        String path="ExcelSheet/test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        int noOfRows=sheet.getPhysicalNumberOfRows();
        System.out.println(noOfRows);

        for (int i = 0; i < noOfRows; i++) {
            Row row=  sheet.getRow(i);
            System.out.println(row.getCell(0)+" "+row.getCell(1));
        }

    }
}
