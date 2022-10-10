package fr.esir.omd.ci;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import com.itextpdf.text.DocumentException;


/**
 * Unit test for simple App.
 */
public class FirstPdfTest 
    extends TestCase
{
    private FirstPdf pdf;
    private static String FILE = "FirstPdf.pdf";
    Document doc = new Document();  

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FirstPdfTest( String testName )
    {
        super( testName );     
    }

    protected void setUp() throws Exception 
    {
        super.setUp();
        pdf = new FirstPdf();
        PdfWriter.getInstance(doc, new FileOutputStream(FILE));
        doc.open();
    }

    protected void tearDown() throws Exception 
    {
        super.tearDown();
        pdf = null;
    }

    public void testAddMetaData() 
    {
        FirstPdf.addMetaData(doc);
        assertNotNull("L'instance n'est pas créée", pdf);
    }

    public void testcreateList() 
    {
        try
        {
            FirstPdf.addTitlePage(doc);
            assertNotNull("L'instance n'est pas créée", pdf);
        }catch(DocumentException de)
        {
        }   
    }
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FirstPdfTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testApp()
    {
        assertTrue( true );
    }
}
