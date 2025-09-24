class UseTrain2 {
    public static void main(String[] args) {
        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri
         *
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         *
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         *
         * 4) Cancellare tutte le prenotazioni
         *
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */

        /*1)*/
        Train testTrain1 = new Train();
        testTrain1.build(100, 201);

        /*2) e 3)*/
        bookSeats(testTrain1, 1, 30);
        bookSeats(testTrain1, 2, 20);
        //4)
        testTrain1.deleteAllReservations();

        //5)
        bookSeats(testTrain1, 1, 60);
        bookSeats(testTrain1, 2, 20);
    }

    static void bookSeats(Train train, int clazz, int quantity){
            if (clazz == 1){
                train.reserveFirstClassSeats(quantity);
                System.out.println("Percentuale totale dei posti occupati: " + train.getTotOccupancyRatio());
                System.out.println("Percentuale dei posti occupati della prima classe: " + train.getFirstClassOccupancyRatio());
            }else if (clazz == 2){
                train.reserveSecondClassSeats(quantity);
                System.out.println("Percentuale totale dei posti occupati: " + train.getTotOccupancyRatio());
                System.out.println("Percentuale dei posti occupati della seconda classe: " + train.getSecondClassOccupancyRatio());

            }
        }
}
