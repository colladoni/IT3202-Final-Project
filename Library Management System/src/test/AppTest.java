package test;

import main.Librarian;
import main.Database;
import main.Member;
import main.Book;
import main.Name;
import main.Date;
import main.Catalog;

import static org.junit.Assert.*;
import  org.junit.Test;
import java.util.List;



public class AppTest {
    Database LibSystem = new Database();
    final List<Book> nwBookList = LibSystem.getColBook();
    final List<Member> nwMemberList = LibSystem.getColMember();

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
    @Test
        //checks available book in database
    public void BookListTest(){
        
        Catalog cat1 = new Catalog("Computer",1, 2,25);
        Name auth1 = new Name("Chris","Topher","Philips");
        Date datPub1 = new Date(1,"July",2021);
        Date bor1 = new Date(0,null,0);
        Book book1 = new Book(2145123,"Hello World",auth1,"Academic","Academic Book",
                    "Fundamentals of Programming",cat1,datPub1,"Available",bor1);
        nwBookList.add(book1);

        int result = 1;

        if(nwBookList.size() == 0){
            result = 0;
        }

        assertEquals(1,result);

    }
    @Test
        //checks available member in database
    public void MemberListTest(){

        Name nam1 = new Name ("Justin","Austiro","Collado");
        Date reg1 = new Date(3,"Septemebr",2021);
        Date exp1 = new Date(3,"September",2022);
        Member mem1 = new Member(18100760,nam1,"Student",0,reg1,exp1,0,"Clear");
        nwMemberList.add(mem1);

        int result = 1;

        if(nwMemberList.size() == 0){
            result = 0;
        }

        assertEquals(1,result);       
    }

    @Test
    public void BookSearchTest(){
        int i;
        int result = 1;
        int isbn = 2145123;

        Catalog cat1 = new Catalog("Computer",1, 2,25);
        Name auth1 = new Name("Chris","Topher","Philips");
        Date datPub1 = new Date(1,"July",2021);
        Date bor1 = new Date(0,null,0);
        Book book1 = new Book(2145123,"Hello World",auth1,"Academic","Academic Book",
                    "Fundamentals of Programming",cat1,datPub1,"Available",bor1);
        nwBookList.add(book1);

        if (nwBookList.size() == 0){
            result = 0;
        }else{
            for(i=0;i<nwBookList.size();++i){
                if(nwBookList.get(i).getISBN()==isbn){
                    result = nwBookList.get(i).getISBN();
                    break;
                }
            }
        }
        assertEquals(2145123,result);  

    }
    @Test
    public void MemberSearchTest(){
        int i;
        int result = 1;
        int memid = 18100760;

        Name nam1 = new Name ("Justin","Austiro","Collado");
        Date reg1 = new Date(3,"Septemebr",2021);
        Date exp1 = new Date(3,"September",2022);
        Member mem1 = new Member(18100760,nam1,"Student",0,reg1,exp1,0,"Clear");
        nwMemberList.add(mem1);

        if (nwMemberList.size() == 0){
            result = 0;
        }else{
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getMemID()==memid){
                    result = nwMemberList.get(i).getMemID();
                    break;
                }
            }
        }
        assertEquals(18100760,result);  

    }
    @Test
    public void BookStatusTest(){
        String  result = "No Book";
        int i;
        String bookstat = "Reserved";
        int bookisbn = 2145123;

        Catalog cat1 = new Catalog("Computer",1, 2,25);
        Name auth1 = new Name("Chris","Topher","Philips");
        Date datPub1 = new Date(1,"July",2021);
        Date bor1 = new Date(0,null,0);
        Book book1 = new Book(2145123,"Hello World",auth1,"Academic","Academic Book",
                    "Fundamentals of Programming",cat1,datPub1,"Available",bor1);
        nwBookList.add(book1);
        
        if (nwBookList.size() == 0){
            result = "No Book";
         }else{
            for(i=0;i<nwBookList.size();++i){
                if(nwBookList.get(i).getISBN()==bookisbn){
                    nwBookList.get(i).setStatus(bookstat);
                    result = nwBookList.get(i).getStatus();
                }
            }
        }
        assertEquals("Reserved",result);  

}

    @Test
    public void IssuePenaltyTest(){
       
        int i;
        String result = "res";
        double fine = 500;
        int memid = 18100760;

        Name nam1 = new Name ("Justin","Austiro","Collado");
        Date reg1 = new Date(3,"Septemebr",2021);
        Date exp1 = new Date(3,"September",2022);
        Member mem1 = new Member(18100760,nam1,"Student",0,reg1,exp1,0,"Clear");
        nwMemberList.add(mem1);
        
        if (nwMemberList.size() == 0){
            result = "res";
         }else{
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getMemID()== memid){
                    nwMemberList.get(i).setPenalty(fine);
                    result = nwMemberList.get(i).getStatus();
                }
        }
    }
        assertEquals("Unpaid",result);   
}

    @Test
    public void CollectFineTest(){
        int i;
        String result = "res";
        double fine = 500;
        double over, under;
        int memid = 18100760;

        Name nam1 = new Name ("Justin","Austiro","Collado");
        Date reg1 = new Date(3,"Septemebr",2021);
        Date exp1 = new Date(3,"September",2022);
        Member mem1 = new Member(18100760,nam1,"Student",0,reg1,exp1,500,"Unpaid");
        nwMemberList.add(mem1);
        
        if (nwMemberList.size() == 0){
            result = "res";
         }else{
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getMemID()== memid){
                   if(nwMemberList.get(i).getPenalty()== fine){
                       nwMemberList.get(i).setPenalty(0);
                       nwMemberList.get(i).setStatus("Clear");
                       result = "Clear";
                   }else if(fine < nwMemberList.get(i).getPenalty()){
                    under = nwMemberList.get(i).getPenalty() - fine;
                    nwMemberList.get(i).setPenalty(under);
                    result = "Unpaid";
                   }else{
                
                   }
                }
        }
        assertEquals("Clear",result);  
    }
}

}
         
