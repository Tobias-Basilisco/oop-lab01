class TestComplexNumCalculator {
  public static void main(String[] args) {
    /*
      * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
      *    tra numeri complessi:
      *
      * - add(1+2i, 2+3i) = 3+5i
      *
      * - sub(4+5i, 6+7i) = -2-2i
      *
      * - mul(8+2i, 3-i) = 26 - 2i
      *
      * - ... altre a piacere
      *
      * 2) Verificare il corretto valore dei campi nOpDone, lastRes
      *
      * 3) Fare altre prove con operazioni a piacere
      */

    ComplexNum operandoA = new ComplexNum();
    ComplexNum operandoB = new ComplexNum();
    ComplexNum ress = new ComplexNum();
    ComplexNumCalculator calculator = new ComplexNumCalculator();

    operandoA.build(1,2);
    operandoB.build(2,3);
    ress = calculator.add(operandoA, operandoB);
    System.out.println(operandoA.toStringRep() + " + " + operandoB.toStringRep() + " = " + ress.toStringRep());

    operandoA.build(4,5);
    operandoB.build(6,7);
    ress = calculator.sub(operandoA, operandoB);
    System.out.println(operandoA.toStringRep() + " - " + operandoB.toStringRep() + " = " + ress.toStringRep());

    operandoA.build(8,2);
    operandoB.build(3,1);
    ress = calculator.mul(operandoA, operandoB);
    System.out.println(operandoA.toStringRep() + " * " + operandoB.toStringRep() + " = " + ress.toStringRep());

    operandoA.build(22,14);
    operandoB.build(3,1);
    ress = calculator.div(operandoA, operandoB);
    System.out.println(operandoA.toStringRep() + " / " + operandoB.toStringRep() + " = " + ress.toStringRep());
  }
}
