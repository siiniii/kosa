package day6.ex;

class Book {
	String title;
	String author;
	int price;

	Book() {
		this("이것이 자바다", "신용권", 36000);
	}

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void getBookInfo() {
		System.out.printf("%s\t%s\t%,d원\n ", title, author, price);
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("이것이 우분투 리눅스다", "우재남", 28800);
		Book book2 = new Book("이것이 취업을 위한 코딩 테스트다 with 파이썬", "나동빈", 30600);
		Book book3 = new Book("이것이 자료구조+알고리즘이다 with C 언어", "박상현", 30600);
		Book book4 = new Book("이것이 Windows Server다", "우재남", 38700);
		Book book5 = new Book();

		book1.getBookInfo();
		book2.getBookInfo();
		book3.getBookInfo();
		book4.getBookInfo();
		book5.getBookInfo();
	}

}