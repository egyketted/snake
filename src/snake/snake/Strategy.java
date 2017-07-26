package snake.snake;

import snake.map.Direction;
import snake.map.Position;

public interface Strategy {

    Direction moveTowards(Position foodPosition);

}
