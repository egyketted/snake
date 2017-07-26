package snake.map;

import snake.snake.Snake;
import snake.snake.Strategy;

public interface Map {

    FieldType getField(int x, int y);

    void move(Direction direction, String snakeId);

    Position getFoodPosition();

    Snake addSnake(String name, Strategy strategy);

}
