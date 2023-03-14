package Exception;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

        public static void main(String[] args) throws IOException {
            FileOutputStream fileInputStream=new FileOutputStream("Test.xlsx");
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
            xssfWorkbook.createSheet().createRow(1).createCell(0).setCellValue(5);
            xssfWorkbook.write(fileInputStream);
        }
    }

