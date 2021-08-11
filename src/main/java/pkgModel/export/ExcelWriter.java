/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModel.export;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author thomy
 */
public class ExcelWriter {
    
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("List User");
    
    public void write(ResultSet rs) {
        try {
            Object[][] data = new Object[8][];
            int rowCount = 0;
            
            while(rs.next()) {
                data[rowCount] = new Object[4];
                data[rowCount][0] = rs.getString(1);
                data[rowCount][1] = rs.getString(2);
                data[rowCount][2] = rs.getString(3);
                data[rowCount][3] = rs.getString(4);
                rowCount++;
            }
            
            int roWCount = 0;
            for (Object[] reg : data) {
                Row row = sheet.createRow(++rowCount);
                int columnCount = 0;
                if (reg != null) {
                    for (Object field : reg) {
                        Cell cell = row.createCell(++columnCount);
                        cell.setCellValue((String) field);
                        
                    }
                }
            }
            File initial_file = new File("Users.xlsx");
            FileOutputStream outputStream = new FileOutputStream(initial_file);
            workbook.write(outputStream);
            JOptionPane.showMessageDialog(null, "Export succesfull.");
        } catch (Exception e) {
        }
    }
}
