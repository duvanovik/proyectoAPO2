package model;

import java.util.Collection;

import exceptions.RepeatedBookException;
import exceptions.RepeatedMagazineException;

public class Magazine extends Publication implements Comparable<Magazine> {
	private int id;
	private Magazine left;
	private Magazine right;
	public Magazine(String title, String editorial, String author, String publicationDate, int id) {
		super(title, editorial, author, publicationDate);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Magazine getLeft() {
		return left;
	}

	public Magazine getRight() {
		return right;
	}
	public int compareTo(Magazine other) {
		return getTitle().compareTo(other.getTitle());
	}
	public void add(Magazine other) throws RepeatedMagazineException{
		if(compareTo(other) == 0)
			throw new RepeatedMagazineException();
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
	public Magazine search(String title) {
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
	
}
