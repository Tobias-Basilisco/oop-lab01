class ComplexNum {
     /*
     * Inserire qui la dichiarazione dei campi della classe
     */
    double re, im;


    void build(double re, double im) {
        /*
        * Inserire qui l'inizializzazione dei campi con i parametri forniti in input
        */
        this.re = re;
        this.im = im;
    }


    boolean equal(ComplexNum num) {
        if (num.re == this.re && 
            num.im == this.im){
                return true;
            }
        return false;
    }

    void add(ComplexNum num) {
        /*
         * Implementare il metodo in modo che venga aggiunto il numero complesso
         * passato in input - Rif. Appendice A1 (slide)
         */
        this.re += num.re;
        this.im += num.im;
    }

    String toStringRep() {
        /*
         * Implementare il metodo in modo che restituisca una rappresentazione
         * testuale del numero complesso
         */
        String composedString = "";
        
        if (this.re != 0){
            composedString += this.re;
        }

        if (this.im > 0){
            composedString += "+";
        }

        if (this.im != 0){
            composedString += this.im + "i";
        }
        return composedString;
    }
}