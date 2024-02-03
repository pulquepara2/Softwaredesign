package at.campus02.zam.Observer.Medienverlag.Podcast;

public class Main {
    public static void main(String[] args) {
        PodcastServer highfive = new PodcastServer();

        Podcast p1 = new Podcast("Highfive stellt sich vor", "www.highfive.com/stell sich vor", 25.6);
        Podcast p2 = new Podcast("Highfive wird eingestellt", "www.highfive.com/das_ende", 45.4);
        PodcastAbonnent abonnent1 = new Notebook("Lenovo", highfive);
        PodcastAbonnent abonnent2 = new Smartphone("iPhone 14", highfive);
        PodcastAbonnent abonnent3 = new Smartwatch("smartwatchy", highfive);

        highfive.addNewPodcastAndNotifySubscribers(p1);
        highfive.addNewPodcastAndNotifySubscribers(p2);
    }
}
