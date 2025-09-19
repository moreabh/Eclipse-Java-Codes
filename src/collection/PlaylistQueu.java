package collection;

public class PlaylistQueu {

	private String name;
	private int cap;
	
	private int count;
	
	private PlaylistQueu() {
		// TODO Auto-generated constructor stub
	}
	
	private SongQueu [] songs = new SongQueu[cap];;
	
	
	public PlaylistQueu(String name, int cap)
	{
		super();
		this.name = name;
		this.cap = cap;
	}
	
	
	public String getName()
	{
		return name;
		
	}
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public int getCap()
	{
		return cap;
		
	}
	public void showPlaylist()
	{
		if (count>0)
		{
			for (int i = 0; i < count; i++)
			{
				System.out.println(songs[i]+", ");
				
			}
			
			System.out.println();
			
		}
		else 
		{
			System.out.println("No Songs in the Playlist!!!");
		}
	}
	
	public boolean addSong(String name, String singer, String duration, String writer, String movie)
	{
		System.out.println(songs.length);
		
		if (count< songs.length)
		{
			int i;
			
			SongQueu toBeAdded = new SongQueu(name, singer, duration, writer, movie);
			for ( i = 0;  i < count; i++) 
			{
				if (songs[i].equals(toBeAdded)) 
				{
					break;
					 
				}
				
			}
			
			if (i == count)
			{
				songs[count] = toBeAdded;
				
				count++;
				 
				return true;
			}
			else
			{
				System.out.println("Song already present!");
			}
			
		}
		return true;
		
	}

}
