package snake.map;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import snake.snake.Snake;
import snake.snake.Strategy;

public class ScoreKeepingTimedMap implements Map {

    private final long          timeLimitInMilis;
    private final List<Snake>   snakes;
    private final FieldType[][] map;

    private final Position currentFoodPosition = null;

    public ScoreKeepingTimedMap(final int dimension, final long timeLimitInMilis) {
        this.timeLimitInMilis = timeLimitInMilis;
        this.snakes = new ArrayList<>();
        this.map = new FieldType[dimension][dimension];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = FieldType.EMPTY;
            }
        }
    }

    @Override
    public FieldType getField(final int x, final int y) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void move(final Direction direction, final String snakeId) {
        // TODO Auto-generated method stub

    }

    @Override
    public Position getFoodPosition() {
        return currentFoodPosition;
    }

    @Override
    public Snake addSnake(final String name, final Strategy strategy) {
        final Snake snake = new Snake(UUID.randomUUID().toString(), name, strategy, this);
        snakes.add(snake);
        return snake;
    }

}
