public interface Omnivoros {

    String getNombre();
    String getTamano();
    String getHabitat();
    int esperanzadeVida();
    String caracterisicasFisicas();
    int getEsperanzadevida();
    String getCaracteristicasfisicas();
    void mostrarCaracteristicas();

    public enum OmnivorosEnum implements Omnivoros {
        OSO("Oso", "Grande", "Bosques y montañas", 25, "Pelaje denso, gran tamaño"),
        HUMANO("Humano", "Mediano", "Diversos hábitats", 70, "Inteligente, bípedo"),
        CERDO("Cerdo", "Mediano", "Granjas", 15, "Cuerpo rechoncho, hocico largo");

        private final String nombre;
        private final String tamano;
        private final String habitat;
        private final int esperanzadevida;
        private final String caracteristicasfisicas;

        // Constructor del enum
        OmnivorosEnum(String nombre, String tamano, String habitat, int esperanzadevida, String caracteristicasfisicas) {
            this.nombre = nombre;
            this.tamano = tamano;
            this.habitat = habitat;
            this.esperanzadevida = esperanzadevida;
            this.caracteristicasfisicas = caracteristicasfisicas;
        }

        @Override
        public String getNombre() {
            return nombre;
        }

        @Override
        public String getTamano() {
            return tamano;
        }

        @Override
        public String getHabitat() {
            return habitat;
        }

        @Override
        public int esperanzadeVida() {
            return 0;
        }

        @Override
        public String caracterisicasFisicas() {
            return "";
        }

        @Override
        public int getEsperanzadevida() {
            return esperanzadevida;
        }

        @Override
        public String getCaracteristicasfisicas() {
            return caracteristicasfisicas;
        }

        @Override
        public void mostrarCaracteristicas() {
            System.out.println("Nombre: " + getNombre());
            System.out.println("Tamaño: " + getTamano());
            System.out.println("Hábitat: " + getHabitat());
            System.out.println("Esperanza de vida: " + getEsperanzadevida() + " años");
            System.out.println("Características Físicas: " + getCaracteristicasfisicas());
        }
    }
}
