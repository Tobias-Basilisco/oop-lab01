class TestStudent {

    public static void main(String[] args) {
        Student alexBalducci = new Student();
        alexBalducci.build("Alex", "Balducci", 1015, 2019);
        alexBalducci.printStudentInfo();

        Student angelBianchi = new Student();
        angelBianchi.build("Angel", "Bianchi", 1016, 2020);
        angelBianchi.printStudentInfo();

        Student andreaBracci = new Student();
        andreaBracci.build("Andrea", "Bracci", 1017, 2021);
        andreaBracci.printStudentInfo();
    }
}
