

public class Book {
	
	private static int index;
	private static String title;
	private static String author;
	private static int stateCode;
	
	public Book(){
	}
	public Book(int index,String title
			, String author) {
		Book.index=index;
		Book.title=title;
		Book.author=author;
		Book.stateCode=1;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		Book.index=index;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		Book.title=title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		Book.author=author;
	}
	public int getprint( ) {
		return stateCode;
	}
	public void setprint(int stateCode) {
		this.stateCode=stateCode;
	}

}
