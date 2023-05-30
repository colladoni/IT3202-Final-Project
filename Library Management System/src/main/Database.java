package main;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Book> colBook;
    private final List<Member> colMember;

	public Database(){
		colBook = new ArrayList<>();
                colMember = new ArrayList<>();
	}

        public List<Book> getColBook() {
            return colBook;
        }

        public List<Member> getColMember() {
            return colMember;
        }
        

    @Override
	public String toString() {
            String totalBook = "\n";
            String totalMember = "\n";
        
                for (int i=0; i<colBook.size(); i++){
			Book b = colBook.get(i);
			totalBook = totalBook + b.toString();
                }
                for (int j=0; j<colMember.size(); j++){
                        Member m = colMember.get(j);
                        totalMember = totalMember + m.toString();
                }
            return totalBook;
        }
}
