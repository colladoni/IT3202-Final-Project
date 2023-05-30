package main;

import java.util.List;
import java.util.Scanner;

public class Librarian {
    Database LibSystem = new Database();
    private final List<Book> nwBookList = LibSystem.getColBook();
    private final List<Member> nwMemberList = LibSystem.getColMember();
    private int librCode;
    private int librID;
    public Librarian(){
        LibSystem = null;
        librCode = 0;
        librID = 0;
    }

    public Librarian(Database LibSystem,int librCode,int librID) {
        this.LibSystem = LibSystem;
        this.librCode = librCode;
        this.librID = librID;
    }

    public int getLibrCode() {
        return librCode;
    }

    public void setLibrCode(int librCode) {
        this.librCode = librCode;
    }

    public int getLibrID() {
        return librID;
    }

    public void setLibrID(int librID) {
        this.librID = librID;
    }

    public Database getLibSystem() {
        return LibSystem;
    }

    public void setLibSystem(Database LibSystem) {
        this.LibSystem = LibSystem;
    }
    public void addBook(Book book){
            nwBookList.add(book);
	}
        public void addMember(Member mem){
            nwMemberList.add(mem);
        }
        public void searchBook(int ISBN){
            int i;
            for(i=0;i<nwBookList.size();++i){
                if(nwBookList.get(i).getISBN()==ISBN){
                    System.out.println(nwBookList.get(i).toString());
                    break;
                }
            }
        }
        public void displayAll(){
            System.out.println("Books:");
            int i;
            for(i=0;i<nwBookList.size();++i){
                System.out.println(" " + nwBookList.get(i).getTitle());
            }
        }
        public void displayCat(String cat){
            int i;
            System.out.println(cat+":");
            for(i=0;i<nwBookList.size();++i){
                if(nwBookList.get(i).getCategory().equals(cat)){
                    System.out.println(" Title:" + nwBookList.get(i).getTitle());
                }
            }
        }
        public void displayDatePub(int year){
            int i;
            System.out.println("Year "+year+":");
            for(i=0;i<nwBookList.size();++i){
                if(nwBookList.get(i).getPublished().getYear()==year){
                    System.out.println(" Title: " + nwBookList.get(i).getTitle());
                    System.out.println(" Published:" + nwBookList.get(i).getPublished());
                }
            }
        }
        public void displayAuthor(String fname, String lname){
            int i;
            System.out.println("Author: "+fname+" "+lname);
            for(i=0;i<nwBookList.size();++i){
                if(nwBookList.get(i).getAuthor().getLName().equals(lname)){
                    System.out.println(" Title: " + nwBookList.get(i).getTitle());
                } 
            }
        }
        public void issueBookStat(String Status, int ISBN){
            int i;
            for(i=0;i<nwBookList.size();++i){
                if(nwBookList.get(i).getISBN()==ISBN){
                    nwBookList.get(i).setStatus(Status);
                }
            }
        }
        public void issuePenalty(int ID, double fine){
            int i;
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getMemID()==ID){
                    nwMemberList.get(i).setPenalty(fine);
                }
            }
        }
        public void collectFine(int ID, double payFine){
            int i;
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getMemID()==ID){
                   if(nwMemberList.get(i).getPenalty()==payFine){
                       nwMemberList.get(i).setPenalty(0);
                       nwMemberList.get(i).setStatus("Clear");
                   }
            }
        }
       }
        public void displayAllMembers(){
            System.out.println("Members:");
            int i;
            for(i=0;i<nwMemberList.size();++i){
                System.out.println("" + nwMemberList.get(i).getMemName());
            }
        }
        public void displaySpecificMemtype(String type){
            int i;
            System.out.println(type+":");
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getType().equals(type)){
                    System.out.println(" MemID:" + nwMemberList.get(i).getMemID());
                    System.out.println(" Name:" + nwMemberList.get(i).getName());
                }
            }
        }
        public void searchMember(int memID){
            int i;
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getMemID()==memID){
                    System.out.println(nwMemberList.get(i).toString());
                    break;
                }
            }
        }
        public void displayYearExp(int year){
            int i;
            System.out.println("Year "+year+":");
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getExpiryMembership().getYear()==year){
                    System.out.println(" MemID: " + nwMemberList.get(i).getMemID());
                    System.out.println(" MemName:" + nwMemberList.get(i).getMemName());
                }
            }
        }
        public void displayYearReg(int year){
            int i;
            System.out.println("Year "+year+":");
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getRegistered().getYear()==year){
                    System.out.println(" MemID: " + nwMemberList.get(i).getMemID());
                    System.out.println(" MemName:" + nwMemberList.get(i).getMemName());
                }
            }
        }
        public void displayMonthExp(String month){
            int i;
            System.out.println("Month of "+month+":");
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getExpiryMembership().getMonth().equals(month)){
                    System.out.println(" MemID: " + nwMemberList.get(i).getMemID());
                    System.out.println(" MemName:" + nwMemberList.get(i).getMemName());
                }
            }
        }
        public void displayMonthReg(String month){
            int i;
            System.out.println("Month of "+month+":");
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getRegistered().getMonth().equals(month)){
                    System.out.println(" MemID: " + nwMemberList.get(i).getMemID());
                    System.out.println(" MemName:" + nwMemberList.get(i).getMemName());
                }
            }
        }
        public void displayStatus(String status){
            int i;
            System.out.println(status+" Members:");
            for(i=0;i<nwMemberList.size();++i){
                if(nwMemberList.get(i).getStatus().equals(status)){
                    System.out.println(" MemID: " + nwMemberList.get(i).getMemID());
                    System.out.println(" MemName:" + nwMemberList.get(i).getMemName());
                }
            }
            
        }
        public void displayStatusBook(String status){
            int i;
            System.out.println(status+" Books:");
            for(i=0;i<nwBookList.size();++i){
                if(nwBookList.get(i).getStatus().equals(status)){
                    System.out.println(" ISBN: " + nwBookList.get(i).getISBN());
                    System.out.println(" Title:" + nwBookList.get(i).getTitle());
                }
            }
            
        }
    public static void CLS() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
        
    public static void main(String args[]){
        Database Lib = new Database();
        Member mem = new Member();
        Librarian libr = new Librarian();
        
        Catalog cat1 = new Catalog("Computer",1, 2,25);
        Name auth1 = new Name("Chris","Topher","Philips");
        Date datPub1 = new Date(1,"July",2021);
        Date bor1 = new Date(0,null,0);
        Book book1 = new Book(2145123,"Hello World",auth1,"Academic","Academic Book",
                    "Fundamentals of Programming",cat1,datPub1,"Available",bor1);
        libr.addBook(book1);
        
        Catalog cat2 = new Catalog("Science",2, 1,1);
        Name auth2 = new Name("Chris","Tine","Dee");
        Date datPub2 = new Date(2,"January",1994);
        Date bor2 = new Date(0,null,0);
        Book book2 = new Book(9182372,"Water and Sea",auth2,"Sceince","Academic Book",
                    "Ocean Life",cat2,datPub2,"Available",bor2);
        libr.addBook(book2);
        
        Catalog cat3 = new Catalog("Science",3, 1,11);
        Name auth3 = new Name("Sponge","Bob","Sqaure");
        Date datPub3 = new Date(11,"March",2002);
        Date bor3 = new Date(21,"January",2020);
        Book book3 = new Book(6662113,"Gary the Snail",auth3,"Science","Non-Fiction",
                    "Devoteful woman suicides",cat3,datPub3,"Borrowed",bor3);
        libr.addBook(book3);
        
        Catalog cat4 = new Catalog("Architecture",3, 24,12);
        Name auth4 = new Name("Jose","Riz","Al");
        Date datPub4 = new Date(13,"December",1929);
        Date bor4 = new Date(0,null,0);
        Book book4 = new Book(1234567,"Encantadia",auth4,"Academic","Journal",
                    "Houses and Buildings",cat4,datPub4,"Reserved",bor4);
        libr.addBook(book4);
        
        Catalog cat5 = new Catalog("Arts",4, 10,5);
        Name auth5 = new Name("Mary","Little","Lamb");
        Date datPub5 = new Date(4,"July",1999);
        Date bor5 = new Date(0,null,0);
        Book book5 = new Book(5000001,"Big Bad Wolf",auth5,"Academic","Non-Fiction",
                "Paintings and Murals Around the World",cat5,datPub5,"Available",bor5);
        libr.addBook(book5);
        
        ///////////////
        //INSERT BOOK DATA HERE FROM data.txt
        ///////////////
        
        Name nam1 = new Name ("Justin","Austiro","Collado");
        Date reg1 = new Date(3,"Septemebr",2021);
        Date exp1 = new Date(3,"September",2022);
        Member mem1 = new Member(18100760,nam1,"Student",0,reg1,exp1,0,"Clear");
        libr.addMember(mem1);
         
        Name nam2 = new Name ("Alexander","James","Velez");
        Date reg2 = new Date(5,"August",2021);
        Date exp2 = new Date(5,"August",2022);
        Member mem2 = new Member(16100667,nam2,"Student",0,reg2,exp2,0,"Clear");
        libr.addMember(mem2);
        
        ///////////////
        //INSERT MEMBER DATA HERE FROM data.txt
        ////////////////
        
        libr.setLibrCode(1234);
        libr.setLibrID(1234);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=========================");
        System.out.println("Library Management System");
        System.out.println("=========================");
        int libCode;
        int libID;
        System.out.println("Librarian ID:");
        libID = sc.nextInt();
        System.out.println("Librarian Passcode:");
        libCode = sc.nextInt();
        int input;
        
        if(libID==libr.getLibrID()){
            if(libCode==libr.getLibrCode()){
                System.out.println("=========================");
                System.out.println("Menu");
                System.out.println("=========================");
                System.out.println("1. Display");
                System.out.println("2. Search");
                System.out.println("3. Issue/Collect");
                System.out.println("=========================");
                System.out.println("Select task:");
                System.out.println("=========================");
                input =sc.nextInt();
                
                switch(input){
                    case 1:
                        System.out.println("====================");
                        System.out.println("Display");
                        System.out.println("====================");
                        System.out.println("1. All Books");
                        System.out.println("2. All Members");
                        System.out.println("3. Member Type");
                        System.out.println("4. Books by Category");
                        System.out.println("5. Books by Year");
                        System.out.println("6. Books by Author");
                        System.out.println("7. Books by Status");
                        System.out.println("8. Members by Year Registered");
                        System.out.println("9. Members by Year Expired");
                        System.out.println("10. Members by Month Registered");
                        System.out.println("11. Exit");
                        int input2;
                        System.out.println("=========================");
                        System.out.println("Select option:");
                        System.out.println("=========================");
                        input2=sc.nextInt();
                        switch(input2){
                            case 1:
                                libr.displayAll();
                                break;
                            case 2:
                                libr.displayAllMembers();
                                break;   
                            case 3:
                                System.out.println("=========================================");
                                System.out.println("MemberType(Student, Faculty, Non-Faculty)");
                                System.out.println("=========================================");
                                System.out.println("Input type:");
                                String typo = sc.next();
                                libr.displaySpecificMemtype(typo);
                                break;
                            case 4:
                                String cate;
                                System.out.println("=========================================================");
                                System.out.println("Category");     
                                System.out.println("(Science, Academic, Fiction,Non-Fiction,Horror,Thriller)");
                                System.out.println("=========================================================");
                                System.out.println("Input category:");
                                cate = sc.next();
                                libr.displayCat(cate);
                                break;
                            case 5:
                                int yeary;
                                System.out.println("=========================");
                                System.out.println("Year");
                                System.out.println("=========================");
                                System.out.println("Chosen Year:");
                                yeary = sc.nextInt();
                                libr.displayDatePub(yeary);
                                break;
                            case 6:
                                String fname;
                                String lname;
                                System.out.println("=========================");
                                System.out.println("Author");
                                System.out.println("=========================");
                                System.out.println("First Name:");
                                fname = sc.next();
                                System.out.println("Last Name");
                                lname = sc.next();
                                libr.displayAuthor(fname,lname);
                                break;
                            case 7:
                                String stats;
                                System.out.println("=====================================");
                                System.out.println("Status(Borrowed, Reserved, Available)");
                                System.out.println("=====================================");
                                System.out.println("Input Book Status:");
                                stats = sc.next();
                                libr.displayStatusBook(stats);
                                break;
                            case 8:
                                System.out.println("=========================");
                                System.out.println("Year Registered");
                                System.out.println("=========================");
                                System.out.println("Year Registered:");
                                int yrRg = sc.nextInt();
                                libr.displayYearReg(yrRg);
                                break;
                            case 9:
                                System.out.println("=========================");
                                System.out.println("Expired Year");
                                System.out.println("=========================");
                                System.out.println("Input year expired:");
                                int yrEx = sc.nextInt();
                                libr.displayYearExp(yrEx);
                                break;
                            case 10:
                                System.out.println("=========================");
                                System.out.println("Month Registered");
                                System.out.println("=========================");
                                System.out.println("Month Registered:");
                                String monRg = sc.next();
                                libr.displayMonthReg(monRg);
                                break;
                            case 11:
                                System.out.println("Thanks for Choosing LMS!");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("=========================");
                        System.out.println("Search");
                        System.out.println("=========================");
                        System.out.println("1. Book");
                        System.out.println("2. Member");
                        
                        int input3;
                        input3 = sc.nextInt();
                        switch(input3){
                            case 1:
                                System.out.println("=========================");
                                System.out.println("Book Search");
                                System.out.println("=========================");
                                System.out.println("Input ISBN:");
                                int isbn = sc.nextInt();
                                libr.searchBook(isbn);
                                break;
                            case 2:
                                System.out.println("=========================");
                                System.out.println("Member Search");
                                System.out.println("=========================");
                                System.out.println("Input Member ID:");
                                int memid = sc.nextInt();
                                libr.searchMember(memid);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("=========================");
                        System.out.println("1. Issue Book Status");
                        System.out.println("2. Issue Penalty");
                        System.out.println("3. Collect Fine");
                        System.out.println("=========================");
                        int input4;
                        input4 = sc.nextInt();
                        switch(input4){
                            case 1:
                                System.out.println("===================================");
                                System.out.println("Status(Borrowed,Available,Reserved)");
                                System.out.println("===================================");
                                System.out.println("Input status:");
                                String bookstat = sc.next();
                                System.out.println("Input ISBN:");
                                int bookisbn = sc.nextInt();
                                libr.issueBookStat(bookstat, bookisbn);
                                libr.searchBook(bookisbn);
                                break;
                            case 2:
                                System.out.println("Input member ID:");
                                int memberid = sc.nextInt();
                                System.out.println("Input penalty:");
                                double fine = sc.nextDouble();
                                libr.issuePenalty(memberid, fine);
                                libr.searchMember(memberid);
                                break;
                            case 3:
                                System.out.println("Input member ID:");
                                int memidd = sc.nextInt();
                                System.out.println("Input paid fine:");
                                double payFine = sc.nextDouble();
                                libr.collectFine(memidd, payFine);
                                libr.searchMember(memidd);
                                break;
                            case 4:
                                System.out.println("Thanks for Choosing LMS!");
                                break;
                        }
                        break;
                }
                
            }else{
                System.out.println("Incorrect Library Code");
            }
        }else{
            System.out.println("Incorrect Lirary ID!");
        }
    }
}
