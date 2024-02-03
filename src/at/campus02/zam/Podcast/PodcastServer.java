package at.campus02.zam.Podcast;

import java.util.ArrayList;
import java.util.List;

public class PodcastServer {


    private List <Podcast> podcasts = new ArrayList<>();
    private List<PodcastAbonnent>podcastAbonnenten = new ArrayList<>();

    public void addNewPodcastAndNotifySubscribers (Podcast podcast) {
        podcasts.add(podcast);
        for (PodcastAbonnent p : podcastAbonnenten) {
            p.erhalte(podcast);
        }
    }

    public void addSubscriber (PodcastAbonnent podcastAbonnent){
        podcastAbonnenten.add(podcastAbonnent);
    }

    public void removeSubsciber(PodcastAbonnent podcastAbonnent){
        podcastAbonnenten.remove(podcastAbonnent);
    }

}
