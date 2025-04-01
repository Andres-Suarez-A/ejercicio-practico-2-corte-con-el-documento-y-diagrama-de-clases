public enum Carnivoros {

    LEON("Leon", "Mediano", "Selvas y sabanas", 16, "pelaje corto, mandibula fuerte y colas largas"),
    COCODRILOS("Cocodrilo", "Mediano", "Lagunas y rios", 70, "Cuerpo macizo, cabeza ancha y mandibula fuerte"),
    LOBO("Lobo", "Mediano", "Bosques de las montañas", 16, "Hocicos puntiagudos, orejas tiesas y colas largas");

    private final String nombre;
    private final String tamano;
    private final String habitat;
    private final int esperanzadevida;
    private final String caracteristicasfisicas;


    Carnivoros(String nombre, String tamano, String habitat, int esperanzadevida, String caracteristicasfisicas) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.habitat = habitat;
        this.esperanzadevida = esperanzadevida;
        this.caracteristicasfisicas = caracteristicasfisicas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getEsperanzadevida() {
        return esperanzadevida;
    }

    public String getCaracteristicasfisicas() {
        return caracteristicasfisicas;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tamaño: " + getTamano());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Esperanza de vida: " + getEsperanzadevida() + " años");
        System.out.println("Características Físicas: " + getCaracteristicasfisicas());
    }
}
