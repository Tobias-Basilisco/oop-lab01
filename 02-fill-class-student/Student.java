class Student {
    String name;
    String surname;
    int id;
    int matriculationYear;
    
    void build(String name, String surname, int id, int matriculationYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
        System.out.println("Nome e Cognome: " + this.name + " " + this.surname);
        System.out.println("Matricola: " + this.id);
        System.out.println("Anno di immatricolazione: " + this.matriculationYear + "\n");
    }
}
