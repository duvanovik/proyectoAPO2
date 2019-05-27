package model;

import java.util.Collection;

import exceptions.RepeatedBookException;

public class Book extends Publication implements Comparable<Book>{
	private Book left;
	private Book right;
	private String isbn;

	private boolean readed;
	public Book(String title, String editorial, String author, String publicationDate, String isbn, boolean readed) {
		super(title, editorial, author, publicationDate);
		this.isbn = isbn;
		this.readed = readed;
		left = null;
		right = null;
	}
	public String getIsbn() {
		return isbn;
	}
	public boolean isReaded() {
		return readed;
	}
	public int compareTo(Book other) {
		return getTitle().compareToIgnoreCase(other.getTitle());
	}
	public void add(Book other) throws RepeatedBookException{
		if(compareTo(other) == 0)
			throw new RepeatedBookException(other.getTitle());
		if(compareTo(other) > 0) {
			if(left == null)
				left = other;
			else
				left.add(other);
		}
		else {
			if(right == null)
				right = other;
			else
				right.add(other);
		}
		
	}
	public Book search(String title) {
	    if( getTitle().compareToIgnoreCase( title ) == 0 )
            return this;
        else if( getTitle().compareToIgnoreCase( title ) > 0 )
            return ( left == null ) ? null : left.search( title );
        else
            return ( right == null ) ? null : right.search( title );
	}
    public void inorden( Collection accumulated )
    {
        if( left != null )
            left.inorden( accumulated );
        
        accumulated.add( getTitle() );

        if( right != null )
            right.inorden( accumulated );
    }
	public Book getLeft() {
		return left;
	}
	public Book getRight() {
		return right;
	}
}



	