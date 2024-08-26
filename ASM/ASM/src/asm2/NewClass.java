/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;
import java.io.ByteArrayOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 *
 * @author Hawin
 */
public class NewClass {
        public static void main(String[] args) {
        // Tạo nội dung hoá đơn
        String invoiceContent = "Tên sản phẩm: Máy tính\nSố lượng: 1\nĐơn giá: 1000\nTổng tiền: 1000";

        try {
            // Tạo một ByteArrayOutputStream để ghi dữ liệu PDF vào
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            // Tạo một đối tượng Document
            Document document = new Document();
            // Tạo một đối tượng PdfWriter để ghi vào outputStream
            PdfWriter.getInstance(document, outputStream);
            // Mở Document để bắt đầu ghi vào nó
            document.open();

            // Thêm nội dung hoá đơn
            document.add(new Paragraph(invoiceContent));

            // Đóng Document sau khi hoàn thành
            document.close();

            // Chuyển dữ liệu từ outputStream thành inputStream
            InputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());

            // Ghi dữ liệu từ inputStream vào một tệp tin PDF
            writeInputStreamToPDFFile(inputStream, "invoice.pdf");

            System.out.println("Hoá đơn đã được tạo thành công.");
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeInputStreamToPDFFile(InputStream inputStream, String outputFile) throws IOException {
        // Tạo một OutputStream để ghi dữ liệu vào tệp PDF
        OutputStream outputStream = new java.io.FileOutputStream(outputFile);

        // Đọc dữ liệu từ inputStream và ghi vào outputStream
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, length);
        }

        // Đóng các luồng
        inputStream.close();
        outputStream.close();
    }
}
