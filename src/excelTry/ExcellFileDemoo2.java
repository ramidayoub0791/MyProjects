package excelTry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcellFileDemoo2 {
    public static void main(String[] args) throws IOException {
        String path="ExcelFile/Test.xlsx";
        FileInputStream file=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(file);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        List<Map<String,String>>excelData=new ArrayList<>();

        int noOfRow=sheet2.getPhysicalNumberOfRows();
        for (int i=1;i<noOfRow ;i++) {
            Row row = sheet2.getRow(i);
            Map<String, String> rowMap = new LinkedHashMap<>();
            rowMap.put("Useraname", row.getCell(0).toString());
            rowMap.put("Password", row.getCell(1).toString());
            excelData.add(rowMap);
        }
            System.out.println(excelData);
        }
    }
