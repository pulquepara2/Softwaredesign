package at.campus02.zam.Observer.Medienverlag.Podcast;

public class Smartwatch implements PodcastAbonnent{
    private String name;
    private PodcastServer podcastServer;

    public Smartwatch(String name, PodcastServer podcastServer) {
        this.name = name;
        this.podcastServer = podcastServer;
        System.out.println("Podcastabonnent "+ name + " wurde erstellt.");
        podcastServer.addSubscriber(this);
    }

    @Override
    public void erhalte(Podcast podcast) {
        System.out.println("Smartwatch "+ getName() + " hat den Podcast mit dem Titel '"+ podcast.getName()+ "' erhalten.");
    }

    @Override
    public String getName() {
        return name;
    }
}
