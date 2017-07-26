package snake.snake;

import lombok.AllArgsConstructor;
import lombok.Getter;
import snake.map.Direction;
import snake.map.Map;

@Getter
@AllArgsConstructor
public class Snake {

    private final String   id;
    private final String   name;
    private final Strategy strategy;
    private final Map      map;

    public Direction getNextMove() {
        return strategy.moveTowards(map.getFoodPosition());
    }
}
