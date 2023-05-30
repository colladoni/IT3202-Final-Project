package test;

import main.Librarian;
import static org.junit.Assert.*;
import  org.junit.Test;


public class AppTest {
    @Test
    public void LoginTest(){
        Librarian app = new Librarian();

        int result = 0;

        int libCode = 1234;
        int libID = 1234;

        app.setLibrCode(1234);
        app.setLibrID(1234);
        
        if(libID==app.getLibrID()){
            if(libCode==app.getLibrCode()){
            result = 1;
            }
        }
        
        assertEquals(1,result);
    }
}
