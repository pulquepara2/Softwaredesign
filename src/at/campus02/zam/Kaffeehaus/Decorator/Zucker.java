package at.campus02.zam.Kaffeehaus.Decorator;


    public class Zucker extends ZutatDecorator {

        public Zucker(Getraenk getraenk) {
            super(getraenk);
        }

        @Override
        public String getBeschreibung() {
            return getraenk.getBeschreibung() + ", " +"Zucker";
        }

        public double kostet() {
            return getraenk.kostet() + 0.1;
        }
    }