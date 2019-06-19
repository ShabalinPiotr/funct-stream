package FuncINt;//  Created by piotr.shabalin on 19.06.2019 10:46//  Created by piotr.shabalin on 19.06.2019 10:46

import java.util.stream.IntStream;

public class stream {
    int sum = IntStream.iterate(1, n -> n + 1)
            .filter(n -> n%5 == 0 && n%2 !=0)
            .limit(10)
            .map(n -> n * n)
            .sum();

    public int getSum() {
              return sum;
    }
}
