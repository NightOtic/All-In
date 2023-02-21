class HelloName {
    public static void main(String[] args) {
        final String name1 = "Krzysiek";
        final String name2 = "Maciek";

        String name = "Krzysiek";

        switch (name) {
            case name1:
                System.out.println("Siemano Krzychu! Witaj w programie.");
                break;
            case name2:
                System.out.println("Witam Panie Prezesie. Jak mija dzień?");
                break;
            default:
                System.out.println("Witaj nieznany użytkowniku!");
        }
    }
}