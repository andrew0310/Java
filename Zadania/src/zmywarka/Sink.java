package zmywarka;

import java.util.Optional;
import java.util.Stack;

public class Sink {

    Stack<Dish> stack = new Stack<>();

    public void throwDish(Dish dish) {

        stack.push(dish);
    }

    public Optional<Dish> clean() {

        if (stack.isEmpty()) {
            return Optional.empty();
        }
        return Optional.ofNullable(stack.pop());
    }
}
