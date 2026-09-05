package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {

    static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/TestData.xlsx";

    static FileInputStream fileInputStream;


    static {
        try {
            fileInputStream = new FileInputStream(testDataDir);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;

    static {
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ReadData() throws IOException{

    }

    static XSSFSheet sheet = workbook.getSheet("Login Details");

    public static String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password = sheet.getRow(1).getCell(1).getStringCellValue();
//    public static String wrong = sheet.getRow(3).getCell(0).getStringCellValue();
//    public static String wrongpass = sheet.getRow(2).getCell(1).getStringCellValue();

    static XSSFSheet inventorySheet = workbook.getSheet("Inventory Details");

    public static String deviceType = inventorySheet.getRow(1).getCell(0).getStringCellValue();
    public static String brand = inventorySheet.getRow(1).getCell(1).getStringCellValue();
    public static String storage = inventorySheet.getRow(1).getCell(2).getStringCellValue();
    public static String colour = inventorySheet.getRow(1).getCell(3).getStringCellValue();
    public static int quantity = (int) inventorySheet.getRow(1).getCell(4).getNumericCellValue();
    public static String address = inventorySheet.getRow(1).getCell(5).getStringCellValue();

//    @Test
//    public void testData(){
//       System.out.println("Username: " + username);
//       System.out.println("Password: " + password);
//       System.out.println("wrong user: " + wrong);
//       System.out.println("wrong password: " + wrongpass);
//    }






}
