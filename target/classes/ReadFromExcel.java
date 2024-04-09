package bmw_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static Map<String, String> getExcelData(String fileName) throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/testinputs/" + fileName);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);
		System.out.println(sheet.getSheetName());

		Iterator<Row> rows = sheet.iterator();

		HashMap<String, String> map = new HashMap<String, String>();
		String key = null;
		String value = null;
		while (rows.hasNext()) {
			Row nextRow = rows.next();
			Iterator<Cell> cell = nextRow.cellIterator();
			key = nextRow.getCell(0).toString();
			value = nextRow.getCell(1).toString();
			map.put(key, value);
		}
		return map;

	}

	public String readFromExcel(String fileName, String sheetName, String testCaseColumn, String testCaseName, String name) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\shivam\\training_work\\RedBus\\src\\main\\java\\resources1\\"+fileName+".xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		String city = null;
		int sheets = wb.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {

			if (wb.getSheetName(i).equalsIgnoreCase(sheetName)) {

				XSSFSheet sheet = wb.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();

				Row firstRow = rows.next();

				Iterator<org.apache.poi.ss.usermodel.Cell> cells = firstRow.cellIterator();
				int k = 0;
				int column = 0;
				while (cells.hasNext()) {

					org.apache.poi.ss.usermodel.Cell value = cells.next();
					if (value.getStringCellValue().equalsIgnoreCase(testCaseColumn)) {

						column = k;

					}
					k++;
				}

				while (rows.hasNext()) {

					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {

						Iterator<org.apache.poi.ss.usermodel.Cell> ce = r.cellIterator();
						while (ce.hasNext()) {
							city = ce.next().getStringCellValue();

							if (city.equalsIgnoreCase(name)) {

								break;

							}

						}

					}

				}

			}

		}
		return city;

	}
}
