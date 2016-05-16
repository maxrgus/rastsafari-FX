package com.rastsafari.server.report;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.rastsafari.server.model.Guide;
import com.rastsafari.server.model.GuideSalary;

/**
 * Class for generating reports with the iText library
 * @author maxrg
 *
 */
public class RastsafariReport {
	private static Font catFont = new Font(Font.FontFamily.HELVETICA, 18);
	private static Font subFont = new Font(Font.FontFamily.HELVETICA, 16);
	private static Font smallBold = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
	
	/**
	 * Generates a salary report for a guide
	 * @param path
	 * @param guide
	 * @param salaryObjects
	 * @throws DocumentException
	 */
	public void generateSalaryReport(String path,Guide guide,ArrayList<GuideSalary> salaryObjects)
			throws DocumentException {
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(path));
			document.open();
			addMetaData(document, "Lönerapport", "Lönerapport för " + guide.getGivenName() + " " + guide.getFamilyName());
			Paragraph preface = new Paragraph();
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("Lönerapport", catFont));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("Rapport genererad: " + new Date(), smallBold));
			addEmptyLine(preface, 3);
			preface.add(new Paragraph("Lönerapport för anställd: " + Integer.toString(guide.getId()) + " " + 
									guide.getGivenName() + " " + guide.getFamilyName(),subFont));
			
			addEmptyLine(preface, 8);
			preface.add(new Paragraph("Genomförda safarier",subFont));
			addEmptyLine(preface, 3);
			document.add(preface);
			String[] cellNames = { "Datum",
								   "Safari",
								   "Lön" };
			PdfPTable safariTable = createTable(3,cellNames,salaryObjects);
			document.add(safariTable);
			Paragraph total = new Paragraph();
			addEmptyLine(total, 4);
			int totalPay = 0;
			for (GuideSalary gs : salaryObjects) {
				totalPay += gs.getPay();
			}
			total.add(new Paragraph("Totalt: " + Integer.toString(totalPay)));
			document.add(total);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
		}
	
	private static void addMetaData(Document document, String title, String subject) {
		document.addTitle(title);
		document.addSubject(subject);
		document.addAuthor("Småländska Fiskeförbundet");
		document.addCreator(System.getProperty("user.name"));
	}
	private static void addEmptyLine(Paragraph paragraph, int number) {
	    for (int i = 0; i < number; i++) {
	      paragraph.add(new Paragraph(" "));
	    }
	  }
	private static PdfPTable createTable(int cells,String[] cellNames,ArrayList<GuideSalary> salaryObjects)
			throws BadElementException {
		PdfPTable table = new PdfPTable(cells);
		PdfPCell c1;
		for (int i=0; i<cells; i++) {
			c1 = new PdfPCell(new Phrase(cellNames[i]));
			c1.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(c1);
		}
		table.setHeaderRows(1);
		for (GuideSalary gs : salaryObjects) {
			table.addCell(gs.getDate());
			table.addCell(gs.getSafari());
			table.addCell(Integer.toString(gs.getPay()));
		}
	    return table;
	}
	
}
