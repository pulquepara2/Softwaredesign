package at.campus02.zam.Podcast;

import java.util.ArrayList;
import java.util.List;

public class PodcastServer {
    private List <Podcast> podcasts = new ArrayList<>();

    public void add (Podcast podcast){
        for(Podcast p : podcasts){
            podcasts.add(podcast);
        }
    }
}
