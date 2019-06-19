package FuncINt;//  Created by piotr.shabalin on 19.06.2019 10:15//

import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class Demo {
    private int counter;

    public void foo() {
        IntUnaryOperator square =
                x -> x * x;
        IntSupplier sequence =
                () -> counter++;
        int bonus = 10;
        IntUnaryOperator bonusAdder =
                (x) -> x + bonus;
    }
}
