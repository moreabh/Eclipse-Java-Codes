package collection;

public class SongQueu {
	
	private String name;
	private String singer;
	private String duration;
	private String writer;
	private String movie;
	
	
	
	public SongQueu() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public String getSinger()
	{
		return singer;
	}
	
	public String getDuration()
	{
		return duration;
		
	}
	
	public String getWriter()
	{
		return writer;
		
	}
	public String getMovie()
	{
		return movie;
		
	}
	
	public SongQueu(String name, String singer, String duration, String writer, String movie)
	{
		super();
		this.name = name;
		this.singer = singer;
		this.duration = duration;
		this.writer = writer;
		this.movie = movie;
		
	}
	
	public String toString()
	{
		return "[Name: "+name+",Singer: "+singer+",Duration: "+duration+"]";
	}
	
	public boolean equals(Object o)
	{
		SongQueu s = (SongQueu) o;
		
		return this.name.equalsIgnoreCase((s.name)) && this.singer.equalsIgnoreCase((s.singer)) && this.writer.equalsIgnoreCase((s.writer));
		
	}
	
	public int hashcode()
	{
		return name.hashCode()+writer.hashCode()+singer.hashCode()+duration.hashCode()+writer.hashCode()+movie.hashCode();
	}
	
	
}
