class ComplexNumCalculator {

    ComplexNum lastRes;
    int nOpDone;

    ComplexNum add(ComplexNum a, ComplexNum b) {
        //operazione
        this.lastRes.re = a.re + b.re;
        this.lastRes.im = a.im + b.im;

        //incremento nOp
        this.nOpDone ++;

        return this.lastRes;
    }

    ComplexNum sub(ComplexNum a, ComplexNum b) {
        //operazione
        this.lastRes.re = a.re - b.re;
        this.lastRes.im = a.im - b.im;

        //incremento nOp
        this.nOpDone ++;

        return this.lastRes;
    }
    ComplexNum mul(ComplexNum a, ComplexNum b) {
        //operazione
        this.lastRes.re = a.re * b.re - a.im * b.im;
        this.lastRes.im = a.im * b.re + a.re * b.im;
        //incremento nOp
        this.nOpDone ++;

        return this.lastRes;
    }

    ComplexNum div(ComplexNum a, ComplexNum b) {
        //operazione
        this.lastRes.re = a.re * b.re + a.im * b.im / (b.re * b.re + b.im * b.im);
        this.lastRes.im = a.im * b.re - a.re * b.im / (b.re * b.re + b.im * b.im);
        //incremento nOp
        this.nOpDone ++;
        
        return this.lastRes;
    }

}